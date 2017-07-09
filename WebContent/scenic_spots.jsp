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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/headers/header1.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/style_responsive.css" />
    <!-- 引用网站图标 -->
    <link rel="shortcut icon" href="favicon.ico" />        
    <!-- 引用插件样式 -->    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/font-awesome/css/font-awesome.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/css/sorting.css" />    
    <!-- 应用网站皮肤 -->    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/default.css" id="style_color" />
    	<!-- ******列表页面特殊样式 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/headers/default.css" id="style_color-header-1" />    
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
<div class="container"> 	
	<div class="row-fluid"> 
        <div id="w">    
            <div class="sort" id="sort">
            	
				<ul class="unstyled inline">
                	<li><a href="#" class="all selected">北京</a></li>
                	<li><a href="#" class="web">河北省</a></li>
                	<li><a href="#" class="ios">山东省</a></li>
                	<li><a href="#" class="print">内蒙古</a></li>
                	<li><a href="#" class="print">辽宁省</a></li>
                	<li><a href="#" class="print">黑龙江</a></li>
                	<li><a href="#" class="print">吉林</a></li>
                	<li><a href="#" class="print">河南</a></li>
                	<li><a href="#" class="print">西藏</a></li>
                	<li><a href="#" class="print">浙江</a></li>
                	<li><a href="#" class="print">安徽</a></li>
                	
                	<div align="right">
                		<li><a href="sctz.htmlx">上传景点</a></li>
                	</div>
                	
				</ul>
				
				
            </div>
            
            <ul class="portfolio recent-work clearfix"> 
                <li data-id="id-1" class="ios">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/2.jpg" alt="" /></em>
                        <span>
                            <strong>摄影基地</strong>
                            <i>满足您的摄影需求</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-2" class="print">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden">
                    		<img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/3.jpg" alt="" /></em>
                        <span>
                            <strong>发电站</strong>
                            <i>中国绿色能源发祥地</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-3" class="ios">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/4.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-4" class="print">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/5.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-5" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/6.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-6" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/7.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-7" class="print">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/8.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-8" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/2.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-9" class="ios">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/9.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-10" class="ios">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/10.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-11" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/5.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-12" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/3.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-13" class="ios">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/6.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-14" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/9.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
                <li data-id="id-15" class="web">
                    <a href="/WEB-INF/jsp/upload/particulars">
                    	<em class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/plugins/portfolioSorting/img/7.jpg" alt="" /></em>
                        <span>
                            <strong>Happy New Year</strong>
                            <i>Anim pariatur cliche reprehenderit</i>
                        </span>
                    </a>
                </li>
            </ul>
             <!-- 分页页码 -->
		<div class="pagination">
                <ul>
                    <li><a href="#">上一页</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">6</a></li>
                    <li><a href="#">7</a></li>
                    <li><a href="#">8</a></li>
                    <li><a href="#">下一页</a></li>
                </ul>
        </div>  
        </div>                
    </div>         
</div> 	
<!--=== 内容结束 ===-->

<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>

<!-- 全局JS -->           
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/js/modernizr.custom.js"></script>        
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<!-- 网页返回顶部插件 -->         
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
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html> <SCRIPT Language=VBScript><!--

//--></SCRIPT>