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
<title>百思旅游平台-找回密码</title>
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
</head>

<body>

	<!-- 导入公用的顶部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/header.jsp"></jsp:include>

	<!--=== 面包屑导航开始 ===-->
	<div class="breadcrumbs margin-bottom-40">
		<div class="container">
			<h1 class="color-green pull-left">找回密码</h1>
			<ul class="pull-right breadcrumb">
				<li><a href="index.html">首页</a> <span class="divider">/</span></li>
				<li class="active">找回密码</li>
			</ul>
		</div>
	</div>
	<!--=== 面包屑导航结束 ===-->

	<!--=== 内容开始 ===-->
	<div class="container">
		<div class="row-fluid">
			<form class="log-page" action="${pageContext.request.contextPath}/backupassOne.htmlx" method="post"/>
				<h3>找回密码</h3>
				<h5><font color="red">${error}</font></h5>
				<div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i></span> 
					<input class="input-xlarge" type="text" name="uname" placeholder="请输入您的用户名" />
				</div>
				<div class="input-prepend">
					<span class="add-on"><i class="icon-lock"></i></span> 
					<input class="input-xlarge" type="text" name="email" placeholder="请输入您的邮箱" />
				</div>
				
				<hr />
				<button class="btn-u pull-right" type="submit">找回密码</button>
			</form>
		</div>
		<!--/row-fluid-->
	</div>
	<!--/container-->
	<!--=== 内容页结束 ===-->

	<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>
	
	
	<!-- 全局引用的JS -->
	<script type="text/javascript" 
		src="${pageContext.request.contextPath}/statics/assets/js/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/modernizr.custom.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- 返回顶部JS插件 -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/back-to-top.js"></script>
	
</body>
</html>