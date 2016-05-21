package com.zmx.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zmx.domain.THome;
import com.zmx.domain.TUH;
import com.zmx.domain.TUser;
import com.zmx.service.UserService;

@Controller
public class TestAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value={" ", "/", "/index"})
	public String index(){
		return "index.jsp";//必须是jsp文件，因为容器编译的文件就是jsp
	}
	
	@RequestMapping(value="/save.do")
	public String save(TUH uh){
		userService.saveUser(uh.getUser());
		THome home = uh.getHome();
//		home.setUser(uh.getUser());
//		userService.saveHome(home);	
		String[] username = home.getUsername().split(",");
		List<THome> lst = new ArrayList<THome>();
		for(int i=0;i<username.length;i++){
			THome h = new THome();
			h.setUser(uh.getUser());
			h.setUsername(username[i].trim());
			lst.add(h);
		}
		userService.saveHomes(lst);
		return "index.jsp";
	}
	@RequestMapping("/show.do")
	public ModelAndView find(){
		Map map = new HashMap();
		map.put("lst", userService.find());
		return new ModelAndView("show.jsp",map);
	}
}










































