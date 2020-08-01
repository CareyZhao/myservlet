<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: zhaopan01
  Date: 2020/8/1
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello,jsp
<br>
<%=new Date().toLocaleString()%>
</body>
</html>
<%--
test.jsp 的执行过程为：
1.test.jsp 被转译为 test_jsp.java(该类继承自 HttpJspBase，而 HttpJspBase 继承自 HttpServlet)
2.test_jsp.java 被编译成 test_jsp.class
3.执行 test_jsp.class，生成 html
4.通过 HTTP 协议把 html 响应返回给浏览器
--%>
