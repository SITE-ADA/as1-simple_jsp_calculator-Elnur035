<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <div style='margin:0 auto;width: 50%; text-align:center; color:green'>
    <p>Browser: <%=request.getAttribute("brw")%></p>
    <p>OS: <%=request.getAttribute("os")%></p>
    <a href='cal-servlet'>Return back</a>
  </div>
  </body>
</html>
