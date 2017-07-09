<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>百思旅游-景点</title>
    <!-- Meta -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- 引用全局样式-->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/style.css" />
    <link rel="stylesheet" href="assets/css/headers/header1.css" />
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="assets/css/style_responsive.css" />
    <!-- 引用网站图标 -->
    <link rel="shortcut icon" href="favicon.ico" />        
    <!-- 引用插件样式 -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css" />
    <link rel="stylesheet" href="assets/plugins/portfolioSorting/css/sorting.css" />    
    <!-- 应用网站皮肤 -->    
    <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color" />
    	<!-- ******列表页面特殊样式 -->
    <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1" />    
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head> 

<body>
<!-- 导入公用的顶部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/header.jsp"></jsp:include>

<!--=== 面包屑导航开始 ===-->
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
        <h1 class="color-green pull-left">景点信息</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="index.html">首页</a> <span class="divider">/</span></li>
            <li class="active">景点信息</li>
        </ul>
    </div>
</div>
<!--=== 面包屑导航结束 ===-->

<!--=== 内容开始 ===-->
<div class="container portfolio-item"> 	
	<div class="row-fluid margin-bottom-20"> 
		<!-- 介绍图片 -->
        <div class="span7">
            <div id="myCarousel" class="carousel slide">
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="assets/img/carousel/5.jpg" alt="" />
                        <div class="carousel-caption">
                            <h4>长城美景</h4>
                            <p>长城位于中国的北部，它东起河北省渤海湾的山海关，西至内陆地区甘肃省的嘉峪关.</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="assets/img/carousel/4.jpg" alt="" />
                        <div class="carousel-caption">
                            <h4>长城美景</h4>
                            <p>长城位于中国的北部，它东起河北省渤海湾的山海关，西至内陆地区甘肃省的嘉峪关.</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="assets/img/carousel/3.jpg" alt="" />
                        <div class="carousel-caption">
                            <h4>长城美景</h4>
                            <p>长城位于中国的北部，它东起河北省渤海湾的山海关，西至内陆地区甘肃省的嘉峪关.</p>
                        </div>
                    </div>
                </div>
                <div class="carousel-arrow">
                    <a data-slide="prev" href="#myCarousel" class="left carousel-control"><i class="icon-angle-left"></i></a>
                    <a data-slide="next" href="#myCarousel" class="right carousel-control"><i class="icon-angle-right"></i></a>
                </div>
            </div>
        </div>
        <!-- 介绍图片 -->
        <!-- 景点介绍 -->
        <div class="span5">
        	<h3>长城</h3>
            <p>
                                长城（ The Great Wall），又称万里长城，是中国古代军事防御工程。长城修筑的历史可上溯到西周时期，发生在首都镐京（今西安）的著名的典故“烽火戏诸侯”就源于此。春秋战国时期列国争霸，互相防守，长城修筑进入第一个高潮，但此时修筑的长度都比较短。秦灭六国统一天下后，秦始皇连接和修缮战国长城，始有万里长城之称[1]  。明朝是最后一个大修长城的朝代，今天人们所看到的长城多是此时修筑。
			长城资源主要分布在河北、北京、天津、山西、陕西、甘肃、内蒙古、黑龙江、吉林、辽宁、山东、河南、青海、宁夏、新疆等15个省区市。根据此前文物和测绘部门的全国性长城资源调查结果，明长城总长度为8851.8公里，秦汉及早期长城超过1万公里，总长超过2.1万公里。[2] 
            </p>
            <ul class="unstyled">
            	<li><i class="icon-calendar color-green"></i>营业时间 早9-晚21</li>
            	<li><i class="icon-tags color-green"></i>营业季度</li>
            	<li><i class="icon-tags color-green"></i>门票价格 ￥151.00</li>
            </ul>
            <p><a class="btn-u btn-u-large" href="#">购买</a></p>
        </div>
    </div>

	<!-- Recent Works -->
    <div class="headline"><h3>景点详细介绍</h3></div>
    <div class="row-fluid margin-bottom-40">
	        <!-- *************此处使用Editer编写********** --> 
	</div>
</div>
<!--=== 内容结束 ===-->

<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>
	
	
<!-- 全局JS -->           
<script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
<script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<!-- 网页返回顶部插件 -->         
<script type="text/javascript" src="assets/plugins/back-to-top.js"></script>
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
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html> <SCRIPT Language=VBScript><!--

//--></SCRIPT>