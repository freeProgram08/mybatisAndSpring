<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <c:forEach items="${requestScope.users}" var="user">
   ${user.id},${user.name}
 </c:forEach>
  </body>
</html>
