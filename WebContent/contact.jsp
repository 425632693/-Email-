<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>百思旅游平台-联系我们</title>
    <!-- 设置bootstarp页面属性值 -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <!-- 引用全局样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/headers/header1.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/style_responsive.css" />
    <!-- 引用网站图标 -->
    <link rel="shortcut icon" href="favicon.ico" />        
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/font-awesome/css/font-awesome.css" />
    <!-- 引用网站皮肤 -->    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/default.css" id="style_color" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/headers/default.css" id="style_color-header-1" />    
	<!-- 网页编码 -->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head> 

<body>

<!-- 导入公用的顶部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/header.jsp"></jsp:include>

<!--=== 面包屑导航开始 ===-->
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
        <h1 class="color-green pull-left">联系我们</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="index.html">首页</a> <span class="divider">/</span></li>
            <li class="active">联系我们</li>
        </ul>
    </div>
</div>
<!--=== 面包屑导航结束 ===-->

<!--=== 内容开始 ===-->
<div class="container">		
	<div class="row-fluid">
		<div class="span9">
            <div id="map" class="map map-box map-box-space margin-bottom-40">
            	<!-- 地图位置 -->
            </div>
		    <p>
            	您提交的信息我们十分重视，将对于您的信息给予及时的反馈，如有不适当处，感谢您的支持与理解。
            	
            </p><br />
			<form />
                <label>姓名</label>
                <input type="text" class="span7" />
                <label>Email <span class="color-red">*</span></label>
                <input type="text" class="span7" />
                <label>内容</label>
                <textarea rows="8" class="span10"></textarea>
                <p><button type="submit" class="btn-u">提交信息</button></p>
            </form>
        </div>

        <div class="span3">
            <!-- 联系我们 -->
            <div class="headline"><h3>联系我们</h3></div>
            <ul class="unstyled who margin-bottom-20">
                <li><a href="#"><i class="icon-home"></i>中国河北省-邯郸市启信大厦26层</a></li>
                <li><a href="#"><i class="icon-envelope-alt"></i>info@baisiedu.cn</a></li>
                <li><a href="#"><i class="icon-phone-sign"></i>0310-6178883</a></li>
                <li><a href="#"><i class="icon-globe"></i>http://www.baisiedu.cn</a></li>
            </ul>
 
        </div>       
    </div>       
 
</div>	
<!--=== 内容页结束 ===-->

<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>

<!-- 全局引用的JS -->           
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/js/modernizr.custom.js"></script>        
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
</html> <SCRIPT Language=VBScript><!--

//--></SCRIPT>