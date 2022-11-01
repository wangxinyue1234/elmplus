<%--
  Created by IntelliJ IDEA.
  User: 98173
  Date: 2022/10/31
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //未登录用户不能直接进入该页面
    request.getSession();
    Boolean flag =(Boolean) session.getAttribute("sta");
    if(flag){
%>
      只能管理员看到,用户名：<%=session.getAttribute("un")%>
      <a href="/logout.do">退出登录</a>
<%

    }else{
%>
   <a herf = "index.jsp" target = "_self">返回登录页</a>
<%
    }
%>

</body>
</html>
