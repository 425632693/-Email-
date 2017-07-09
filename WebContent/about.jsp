<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>百思旅游平台-关于我们</title>
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
        <h1 class="color-green pull-left">关于我们</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="index.html">首页</a> <span class="divider">/</span></li>
            <li class="active">关于我们</li>
        </ul>
    </div>
</div>
<!--=== 面包屑导航结束 ===-->

<!--=== 内容开始 ===-->
<div class="container">		
	<div class="row-fluid margin-bottom-30">
    	<div class="span6">
            <p>北京京赫科技有限公司是一家专注于移动互联网、APP应用、软件定制研发等全方位服务。
京赫提供的不仅仅是可靠的软件系统，更重要的是能提供企业软件系统从定位到推广的全套方案，使您更快的受惠于科技变革带来的广阔空间。
每个项目，无论大小，我们一视同仁，实时把控监督，实时与客户沟通，使整个过程可见、可控。
我们相信，一个软件系统的交付不是合作的完成，其实是合作的真正开始，所以我们的服务是一个持续的过程，我们后期为客户提供完善的培训、维护、升级以及再次开发等服务。</p>
            <ul class="unstyled">
                <li><i class="icon-ok color-green"></i> 软件外包</li>
                <li><i class="icon-ok color-green"></i> 软件维护</li>
                <li><i class="icon-ok color-green"></i> 人员外包</li>
                <li><i class="icon-ok color-green"></i> 团队外包</li>
                <li><i class="icon-ok color-green"></i> 入住开发</li>
            </ul><br />

            <!-- 格言 -->
            <blockquote>
                <p>客户的需要高于一切，客户是上帝。</p>
                <small>CEO 谷先生</small>
            </blockquote>
        </div>
    	<div class="span6">
            <iframe src="http://player.vimeo.com/video/9679622" width="100%" height="327" frameborder="0" webkitallowfullscreen="" mozallowfullscreen="" allowfullscreen=""></iframe> 
        </div>
    </div><!--/row-fluid-->

	<!-- 教师团队 -->
	<div class="headline"><h3>教师团队</h3></div>
    <ul class="thumbnails team">
        <li class="span3">
            <div class="thumbnail-style">
                <img src="assets/img/others/2.jpg" alt="" />
                <h3><a>Jack Bour</a> <small>Chief Executive Officer / CEO</small></h3>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                <ul class="unstyled inline">
                	<li><a href="#"><i class="icon-facebook"></i></a></li>
                	<li><a href="#"><i class="icon-twitter"></i></a></li>
                	<li><a href="#"><i class="icon-google-plus"></i></a></li>
                </ul>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style">
                <img src="${pageContext.request.contextPath}/statics/assets/img/others/7.jpg" alt="" />
                <h3><a>Kate Metus</a> <small>Project Manager</small></h3>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                <ul class="unstyled inline team">
                	<li><a href="#"><i class="icon-facebook"></i></a></li>
                	<li><a href="#"><i class="icon-twitter"></i></a></li>
                	<li><a href="#"><i class="icon-google-plus"></i></a></li>
                </ul>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style">
                <img src="${pageContext.request.contextPath}/statics/assets/img/others/3.jpg" alt="" />
                <h3><a>Porta Gravida</a> <small>VP of Operations</small></h3>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                <ul class="unstyled inline team">
                	<li><a href="#"><i class="icon-facebook"></i></a></li>
                	<li><a href="#"><i class="icon-twitter"></i></a></li>
                	<li><a href="#"><i class="icon-google-plus"></i></a></li>
                </ul>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style">
                <img src="${pageContext.request.contextPath}/statics/assets/img/others/6.jpg" alt="" />
                <h3><a>Donec Elit</a> <small>Director, R &amp; D Talent</small></h3>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                <ul class="unstyled inline team">
                	<li><a href="#"><i class="icon-facebook"></i></a></li>
                	<li><a href="#"><i class="icon-twitter"></i></a></li>
                	<li><a href="#"><i class="icon-google-plus"></i></a></li>
                </ul>
            </div>
        </li>
    </ul>
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