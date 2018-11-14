<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="javax.xml.crypto.dsig.keyinfo.RetrievalMethod"%>
<%@ taglib uri="../c.tld" prefix="c"%>
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
</script>
<style type="text/css">
	select{outline:auto;opacity:0.4;filter:alpha(opacity=0.4);}
	select{width:100px;height:25px;line-height:32px;border-top:solid 1px #a7b5bc; border-left:solid 1px #a7b5bc; border-right:solid 1px #ced9df; border-bottom:solid 1px #ced9df; background:url(../images/inputbg.gif) repeat-x; text-indent:10px;
	}
</style>
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
					<li><label>您的名字<b>*</b></label><input id="c_name"
						name="c_name" type="text" class="dfinput" placeholder="请填写您的名字"
						style="width: 518px;" /></li>

					<li><label>您的电话<b>*</b></label><input id="c_tel" name="c_tel"
						type="text" class="dfinput" placeholder="请填写您的电话"
						style="width: 518px;" /></li>

					<li><label>房间类型<b>*</b></label><select id="roomType" name="gr_name" onchange="sele_Change()">
							<option value="0">--请选择--</option>
							<c:forEach items="${roomTypes}" var="roomType">
								<option value="${roomType}">${roomType}</option>
							</c:forEach>
					</select>

					</li>

					<li><label>房间号<b>*</b></label>
					<select id="gr_num"   name="gr_num" onchange="rm_moeny_Change()">
						
					</select></li>

					<li><label>预定时间<b>*</b></label><input id="rm_into_time"
						name="rm_into_time" type="text" class="dfinput"
						placeholder="请填写预定时间" style="width: 518px;" /></li>

					<li><label>预定天数<b>*</b></label><input id="rm_days"
						name="rm_days" type="text" class="dfinput" placeholder="请填写预定天数"
						style="width: 518px;" /></li>

					<li><label>押金<b>*</b></label><input id="rm_moeny"
						name="rm_moeny" type="text" class="dfinput" placeholder="请填写押金"
						style="width: 518px;" /></li>

					<li><label>管理员<b>*</b></label><input id="u_id" name="u_id"
						type="text" class="dfinput" placeholder="请填写管理员"
						style="width: 518px;" /></li>

					<li><label>&nbsp;</label><input onclick="addUser()" name=""
						type="button" class="btn" value="添加" /></li>
				</ul>

			</div>

		</div>

		<script type="text/javascript">
			$("#usual1 ul").idTabs();
		</script>

		<script type="text/javascript">
			$('.tablelist tbody tr:odd').addClass('odd');
			
		       function sele_Change(){
		           var objS = document.getElementById("roomType");
		           var get_map = objS.options[objS.selectedIndex].value;
		           $.get("${pageContext.request.contextPath}/reserveRoom/getRoomNums",
		        	      {"gr_name":get_map},
		                  function(data){ 
		        	    	           
		        	    	 /* var  roomNum = document.getElementById("gr_num"); */
		        	    	  var htmlInfo = "";
		        	    	  for(var i = 0;i<data.length;i++){
		        	    		 var item = data[i]; 
		        	    		htmlInfo+="<option value='"+item.gr_num+"'>"+item.gr_num+"</option>"
		        	    	  }
		        	    	  $("#gr_num").html(htmlInfo);
		        	    	 
		        	      }
		        	   
		           );
		          }
			
		       function rm_moeny_Change(){
		    	   var price = document.getElementById("rm_moeny");
		           var get_map = document.getElementById("gr_num");
		           $.get("${pageContext.request.contextPath}/reserveRoom/getRoomPrice",
		        	      {"gr_name":get_map},
		                  function(data){ 
		        	    	  price.value=data.rm_moeny;
		        	      }
		        	   
		           );
		       }
		</script>





	</div>


</body>

</html>
