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
<title>百思旅游平台-用户中心</title>
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

	<!--=== 内容开始 ===-->
		<div class="container">
			<div class="row-fluid blog-page blog-item">
				<!-- 左部分菜单 -->
				<div class="span3">
		            <div class="posts margin-bottom-20">
		                <div class="headline"><h3>用户中心</h3></div>
		                <dl class="dl-horizontal">
		                    <dt><a href="#"><img src="${pageContext.request.contextPath}/statics/assets/img/sliders/elastislide/6.jpg" alt="" /></a></dt>
		                    <dd>
		                        <p><a href="#">用户信息</a></p> 
		                    </dd>
		                </dl>
		                <dl class="dl-horizontal">
		                    <dt><a href="#"><img src="${pageContext.request.contextPath}/statics/assets/img/sliders/elastislide/10.jpg" alt="" /></a></dt>
		                    <dd>
		                        <p><a href="#">订单中心.</a></p> 
		                    </dd>
		                </dl> 
		                <dl class="dl-horizontal">
		                    <dt><a href="#"><img src="${pageContext.request.contextPath}/statics/assets/img/sliders/elastislide/9.jpg" alt="" /></a></dt>
		                    <dd>
		                        <p><a href="#">设置中心.</a></p> 
		                    </dd>
		                </dl>
		            </div>
				</div>

				<!-- 右边内容部分 -->
				<div class="span9">
					<hr />
					<div class="media">
						<h3 class="color-green">修改用户</h3>
					</div>
					<div class="row-fluid servive-block">
		                <div class="span4" onclick="openWin()">
		                    <h4>修改登录密码</h4>
		                    <p><i class="icon-bell"></i></p>
		                </div>
		                <div class="span4" onclick="updateEmail()">
		                    <h4>修改Email地址</h4>
		                    <p><i class="icon-bullhorn"></i></p>
		                </div>
		                <div class="span4">
		                    <h4>修改支付密码</h4>
		                    <p><i class="icon-lightbulb"></i></p>
		                </div>
		            </div>
				</div>
			</div>
		</div>
		<!--=== 内容页结束 ===-->

	<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>
	
	<!-- 全局引用的JS -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/jquery-1.8.2.min.js"></script>
	<!-- layer插件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/layer/layer.js"></script>
	<script type="text/javascript">
		function openWin(){
			//iframe层
			layer.open({
			  type: 2,
			  title: '修改登录密码',
			  shadeClose: true,
			  shade: 0.8,
			  area: ['60%', '90%'],
			  content: ['http://127.0.0.1:8080/zuoye_05/xgupass.htmlx','no'] //iframe的url
			  
			}); 
		}
	</script>
	<script type="text/javascript">
		function updateEmail(){
			//iframe层
			layer.open({
			  type: 2,
			  title: '修改Email邮箱',
			  shadeClose: true,
			  shade: 0.8,
			  area: ['60%', '90%'],
			  content: ['http://127.0.0.1:8080/zuoye_05/xgemail.htmlx','no'] //iframe的url
			  
			}); 
		}
	</script>
		
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/modernizr.custom.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- 返回顶部JS插件 -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/back-to-top.js"></script>
	
</body>
</html>