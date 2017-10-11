<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul class="dropdown-menu">
    <!-- User image -->
    <li class="user-header">
        <img src="@Model.Photo" class="img-circle" alt="User Image">
        <p>
            Alexander Pierce - Web Developer
            <small>Member since Nov. 2012</small>
        </p>
    </li>
    <!-- Menu Body -->
  
    <!-- Menu Footer-->
    <li class="endbtndiv" style="margin-top:5px;">
        <a href="javascript:Profile();" class="easyui-linkbutton btns" style="float:left; margin-left:10px;">简介</a>
        <a href="javascript:SignOut();" class="easyui-linkbutton btnc" style="width:80px;">退出</a>
    </li>
</ul>
</body>
</html>