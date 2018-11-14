<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/public/css/style.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/public/css/select.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/js/jquery.idTabs.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/public/editor/kindeditor.js"></script>

<script type="text/javascript">
	KE.show({
		id : 'content7',
		cssPath : './index.css'
	});
</script>

<script type="text/javascript">
	$(document).ready(function(e) {
		$(".select1").uedSelect({
			width : 345
		});
		$(".select2").uedSelect({
			width : 167
		});
		$(".select3").uedSelect({
			width : 100
		});
	});
	function addUser() {
		var uName = $("#u_name").val();
		var uPwd = $("#u_pwd").val();
		var uDec = $("#u_dec").val();
		if(uName!=null&&uName!=""&&uPwd!=null&&uPwd!=""){
			$.post("${pageContext.request.contextPath}/user/useradd", {
				u_name : uName,
				u_pwd : uPwd,
				u_dec : uDec
			}, function(data) {
				if(data==true){
					alert("添加成功");
					window.location.reload();
				}else{
					alert("添加失败，该用户名已存在");
				}			
			}, "json");
		}else{
			alert("用户名或密码不能为空");
		}
		
	}
</script>
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="${pageContext.request.contextPath}/main/index">首页</a></li>
		</ul>
	</div>

	<div class="formbody">


		<div id="usual1" class="usual">



			<div id="tab1" class="tabson">

				<div class="formtext">
					Hi，<b>${userName}</b>，欢迎您试用信息发布功能！
				</div>
				
					<ul class="forminfo">
						<li><label>用户名<b>*</b></label><input id="u_name"
							name="u_name" type="text" class="dfinput" placeholder="请填写用户名"
							style="width: 518px;" /></li>

						<li><label>密码<b>*</b></label><input id="u_pwd" name="u_pwd"
							type="text" class="dfinput" placeholder="请填写密码"
							style="width: 518px;" /></li>

						<li><label>描述</label><input id="u_dec" name="u_dec"
							type="text" class="dfinput" placeholder="请填写职位描述"
							style="width: 518px;" /></li>

						<li><label>&nbsp;</label><input onclick="addUser()" name="" type="button"
							class="btn" value="添加" /></li>
					</ul>
				
			</div>

		</div>

		<script type="text/javascript">
			$("#usual1 ul").idTabs();
		</script>

		<script type="text/javascript">
			$('.tablelist tbody tr:odd').addClass('odd');
		</script>





	</div>


</body>

</html>
