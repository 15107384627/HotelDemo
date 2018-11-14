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
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>通讯录</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/public/images/leftico01.png" /></span>用户管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/user/info" target="rightFrame">用户信息</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/user/add" target="rightFrame">添加用户</a><i></i></li>
       
        </ul>    
    </dd>
         <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/public/images/leftico01.png" /></span>房间信息管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/gestroom/info" target="rightFrame">房间信息</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/gestroom/add" target="rightFrame">添加房型</a><i></i></li>
       
        </ul>    
    </dd>
    
     <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/public/images/leftico01.png" /></span>预定信息管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath}/reserveRoom/info" target="rightFrame">预定信息</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath}/reserveRoom/add" target="rightFrame">添加预定</a><i></i></li>
       
        </ul>    
    </dd>
    
     <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/public/images/leftico01.png" /></span>入住信息管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="index.html" target="rightFrame">入住信息</a><i></i></li>  
        </ul>    
    </dd>
    
    </dl> 
</body>
</html>
