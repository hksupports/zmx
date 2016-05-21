<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html>
<html>
  <head>
		<meta charset="UTF-8">
		<title>show</title>
  </head>		

<body>
   <c:forEach items="${lst }" var="user">
      ${user.username }<br>
   </c:forEach>
</body>
</html>
