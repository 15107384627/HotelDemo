<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" /> -->
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
	function addGestroom() {

		var gr_num = $("#gr_num").val();
		var gr_name = $("#gr_name").val();
		var gr_des = $("#gr_des").val();
		var gr_img = $("#gr_img").val();
		var gr_price = $("#gr_price").val();

		if ($.trim(gr_img) == "") {
			alert("请选择要上传的文件");
			return;
		}

		var gestroomForm=document.getElementById('gestroomForm');
		alert(gestroomForm);
		var formdata = new FormData(gestroomForm);
		//formdata.append("gr_img",file);
		//上传文件
		$.ajax({
			url : "${pageContext.request.contextPath}/file/fileUpload",
			type : 'POST',
			cache : false,
			data : formdata,
			dataType:"json",
			processData : false,
			contentType : false
		});

		//上传其他数据
		/* if (gr_num != null && gr_num != "" && gr_name != null && gr_name != ""
				&& gr_des != null && gr_des != "" && gr_img != null
				&& gr_img != "" && gr_price != null && gr_price != "") {
			$.post("${pageContext.request.contextPath}/gestroom/gestroomAdd", {
				gr_num : gr_num,
				gr_name : gr_name,
				gr_des : gr_des,
				gr_img : gr_img,
				gr_price : gr_price
			}, function(data) {
				if (data == true) {
					alert("添加成功");
					window.location.reload();
				} else {
					alert("添加失败，该房间已存在");
				}
			}, "json");
		} else {
			alert("必填的不能为空");
		} */
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
				<form id="gestroomForm" action="${pageContext.request.contextPath}/gestroom/gestroomAdd" method="post" enctype="multipart/form-data">
				<ul class="forminfo">
					<li><label>房间号<b>*</b></label><input id="gr_num" name="gr_num"
						type="text" class="dfinput" placeholder="请填写房间号"
						style="width: 518px;" /></li>

					<li><label>房间类型<b>*</b></label><input id="gr_name"
						name="gr_name" type="text" class="dfinput" placeholder="请填写房间类型"
						style="width: 518px;" /></li>

					<li><label>房间描述<b>*</b></label><input id="gr_des"
						name="gr_des" type="text" class="dfinput" placeholder="请填写房间描述"
						style="width: 518px;" /></li>

					<li><label>房间照片<b>*</b></label><input id="gr_img"
						name="gr_img" type="file" class="" placeholder="请填写房间照片"
						style="width: 518px;" accept="image/*" /></li>

					<li><label>价格<b>*</b></label><input id="gr_price"
						name="gr_price" type="text" class="dfinput" placeholder="请填写价格"
						style="width: 518px;" /></li>

					<li><label>&nbsp;</label><input onclick=""
						name="" type="submit" class="btn" value="添加" /></li>
				</ul>
				</form>

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
