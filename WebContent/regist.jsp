<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>百思旅游平台-注册</title>
<!-- 设置bootstarp页面属性值 -->
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />

<!-- 引用全局样式-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/css/style.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/css/headers/header1.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/css/style_responsive.css" />
<!-- 引用网站图标 -->
<link rel="shortcut icon" href="favicon.ico" />
<!-- CSS Implementing Plugins -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/plugins/font-awesome/css/font-awesome.css" />
<!-- 引用网站皮肤 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/css/themes/default.css"
	id="style_color" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/statics/assets/css/themes/headers/default.css"
	id="style_color-header-1" />
<!-- 网页编码 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<style type="text/css">
	.success{
		color:green;
	}
	.error{
		color:red;
	}
</style>
</head>

<body>

	<!-- 导入公用的顶部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/header.jsp"></jsp:include>

	<!--=== 面包屑导航开始 ===-->
	<div class="breadcrumbs margin-bottom-40">
		<div class="container">
			<h1 class="color-green pull-left">注册</h1>
			<ul class="pull-right breadcrumb">
				<li><a href="index.html">首页</a> <span class="divider">/</span></li>
				<li class="active">注册</li>
			</ul>
		</div>
	</div>
	<!--=== 面包屑导航结束 ===-->

	<!--=== 内容开始 ===-->
	<div class="container">
		<div class="row-fluid margin-bottom-10">
			<form id="re"  class="reg-page" action="${pageContext.request.contextPath}/register.htmlx" method="post"/>
			<h3>注册账号</h3>
			<h5><font color="red">${error}</font></h5>
			<div class="controls">
				<label>账号</label>
					<input type="text" name="uname" class="span12" /> 
				<label>密码</label>
					<input type="password" id="upass" name="upass" class="span12" />
			    <label>Email<span class="color-red">*</span></label>
			    	<input type="text" name="email" class="span12" />
			    <label>确认密码<span class="color-red">*</span></label> 
					<input type="password" name="cpass" class="span12" />
				<label class="checkbox"><input type="checkbox" />&nbsp;
					我同意该 <a href="#">协议</a>
					<button class="btn-u pull-right" type="submit">注册</button>
				</label>
					
				
			</div>
			
			<div class="controls form-inline">
				
				
			</div>
			<hr />
			<p>
				已经有账号? 点击 <a href="login.jsp" class="color-green">这里</a> 去登陆.
			</p>
			</form>
		</div>
	</div>
	<!--=== 内容页结束 ===-->
	
	<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>

	<!-- 全局引用的JS -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.validate.min.js"></script>
	<script type="text/javascript">
		$(function () {
			$("#re").validate({
				//校验规则
				rules:{
					uname:{
						required:true,
						minlength:7
					},
					upass:{
						required:true,
						minlength:7
					},
					email:{
						required:true,
						email:true
					},
					cpass:{
						equalTo:"#upass"
					}
				},
				//校验信息
				messages:{
					uname:{
						required:"用户名必须填写！",
						minlength:"用户名长度最小为7位！"
					},
					upass:{
						required:"密码必须填写！",
						minlength:"密码长度最小为7位！"
					},
					email:{
						required:"Email必须填写！",
						email:"Email格式错误！"
					},
					cpass:{
						equalTo:"两次密码不一致"
					}
				},
				//错误提示的样式
				success:"success",//成功样式
				error:"error"//错误样式
			});
		});
	</script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- 返回顶部JS插件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/plugins/back-to-top.js"></script>
	<!-- JS Page Level           
<script type="text/javascript" src="assets/js/app.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
    });
</script>-->
	<!--[if lt IE 9]>
    <script src="assets/js/respond.js"></script>
<![endif]-->
</body>
</html>
