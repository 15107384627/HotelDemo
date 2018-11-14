<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.tsl.po.UserPo"%>
<%@page import="java.util.List"%>
<%@page import="javax.xml.crypto.dsig.keyinfo.RetrievalMethod"%>
<%@ taglib uri="../c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
	
	function deleteGestroom(t){
		var uId =t.id;
		$.post("${pageContext.request.contextPath}/gestroom/gestroomDel", {
			id : uId
		}, function(data) {
			window.location.reload();
		}, "json");
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
			<div id="tab2" class="tabson">

				<form method="post" action="${pageContext.request.contextPath}/gestroom/info">
					<ul class="seachform">

						<li><label>房间号</label><input id="gr_num" name="gr_num"
							type="text" class="scinput" /></li>
						<li><label>&nbsp;</label><input name="" type="submit"
							class="scbtn" value="查询" /></li>

					</ul>
				</form>

				<table class="tablelist">
					<thead>
						<tr>
							<th><input name="" type="checkbox" value=""
								checked="checked" /></th>
							<th>编号<i class="sort"><img
									src="${pageContext.request.contextPath}/public/images/px.gif" /></i></th>
							<th>房间号</th>
							<th>房间类型</th>
							<th>房间描述</th>
							<th>房间照片</th>
							<th>价格</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${gestrooms}" var="gestroom" varStatus="sta">
							<tr>
								<td><input name="" type="checkbox" value="" /></td>
								<td>${sta.index+1}</td>
								<td>${gestroom.gr_num}</td>
								<td>${gestroom.gr_name}</td>
								<td>${gestroom.gr_des}</td>
								<td><img alt="" src="${pageContext.request.contextPath}${gestroom.gr_img}" width="168px" height="126px" /></td>
								<td>${gestroom.gr_price}</td>
								<td><a href="#" class="tablelink">查看</a> <a id="${gestroom.id}" onclick="deleteGestroom(this)" href="#" class="tablelink">删除</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>




			</div>

		</div>

	</div>

</body>
</html>