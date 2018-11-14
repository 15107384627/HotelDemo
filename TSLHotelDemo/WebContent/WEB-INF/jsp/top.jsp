<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/public/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath}/public/js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(${pageContext.request.contextPath}/public/images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main.html" target="_parent"><img src="${pageContext.request.contextPath}/public/images/logo.png" title="系统首页" /></a>
  
    </div>
     <!--  
    <ul class="nav">
    <li><a href="default.html" target="rightFrame" class="selected"><img src="${pageContext.request.contextPath}/public/images/icon01.png" title="工作台" /><h2>工作台</h2></a></li>
    <li><a href="imgtable.html" target="rightFrame"><img src="${pageContext.request.contextPath}/public/images/icon02.png" title="模型管理" /><h2>模型管理</h2></a></li>
    <li><a href="imglist.html"  target="rightFrame"><img src="${pageContext.request.contextPath}/public/images/icon03.png" title="模块设计" /><h2>模块设计</h2></a></li>
    <li><a href="tools.html"  target="rightFrame"><img src="${pageContext.request.contextPath}/public/images/icon04.png" title="常用工具" /><h2>常用工具</h2></a></li>
    <li><a href="computer.html" target="rightFrame"><img src="${pageContext.request.contextPath}/public/images/icon05.png" title="文件管理" /><h2>文件管理</h2></a></li>
    <li><a href="tab.html"  target="rightFrame"><img src="${pageContext.request.contextPath}/public/images/icon06.png" title="系统设置" /><h2>系统设置</h2></a></li>
    </ul>
     -->          
    <div class="topright">    
    <ul>
    <li><span><img src="${pageContext.request.contextPath}/public/images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    <li><a href="${pageContext.request.contextPath}/login" target="_parent">退出</a></li>
    </ul>
     
    <div class="user">
    <span>${userName}</span>
    <!--  
    <i>消息</i>
    <b>5</b>
    -->
    </div>    
    
    </div>

</body>
</html>
