<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>百思旅游平台-加入我们</title>
    <!-- 设置bootstarp页面属性值 -->
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
    <!-- 引用网站皮肤 -->    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/default.css" id="style_color" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/assets/css/themes/headers/default.css" id="style_color-header-1" />    
	<!-- 网页编码 -->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head> 

<body>

<!-- 导入公用的顶部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/header.jsp"></jsp:include>

<!--=== 面包屑导航开始 ===-->
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
        <h1 class="color-green pull-left">加入我们</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="index.html">首页</a> <span class="divider">/</span></li>
            <li class="active">加入我们</li>
        </ul>
    </div>
</div>
<!--=== 面包屑导航结束 ===-->

<!--=== 内容开始 ===-->
<div class="container">		
	<div class="row-fluid">            
        <div class="span9">
			<!-- 岗位需求信息 -->
            <div class="headline"><h3>岗位需求信息</h3></div>
            <!-- 具体岗位列表 -->
            <div class="accordion acc-home margin-bottom-40" id="accordion2">
                <div class="accordion-group">
                  <div class="accordion-heading">
                    <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                      	Android开发工程师
                    </a>
                  </div>
                  <div id="collapseOne" class="accordion-body in collapse" style="height: auto;">
                    <div class="accordion-inner">
                      <p>
                      	职位描述：<br/>
						岗位职责：<br/>
						1、负责移动客户端相关项目的需求分析、详细设计及开发工作；<br/>
						2、根据公司要求基于Android系统平台进行应用模块程序开发；<br/>
						3、根据项目任务计划按时完成软件编码和单元测试工作；<br/>
						4、对所开发的APP、SDK进行版本更新及维护。<br/>
						
						任职要求：
						1、计算机相关专业大专以上学历，3年以上Android平台开发经验；<br/>
						2、熟悉Android应用开发框架及Activity生命周期、熟练进行Android UI/Framework开发技能、熟练使用Android SDK、 熟练进行基于数据库的手机应用开发；<br/>
						3、熟悉Android下网络通信机制，对Socket通信、TCP/IP、Http有一定理解和经验。
					</p>
                    </div>
                  </div>
                </div>
            </div>
 			<div class="accordion acc-home margin-bottom-40" id="accordion2">
                <div class="accordion-group">
                  <div class="accordion-heading">
                    <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                      	J2ee工程师
                    </a>
                  </div>
                  <div id="collapseOne" class="accordion-body in collapse" style="height: auto;">
                    <div class="accordion-inner">
                      <p>
						职位要求：<br/>
						1、3年以上从事java web开发经验，熟悉J2EE相应开发；<br/>
						2、熟悉MVC开发技术框架，具有开发struts2、spring、hibernate经验；<br/>
						3、具有丰富的数据库使用经验，MYSQL经验尤佳；<br/>
						4、具备较强的DEBUG能力、单体测试及集成测试的能力；<br/>
						5、熟练HTML、CSS、javascript优先；<br/>
						6、熟练AJAX开发经验者优先；<br/>
						7、要求985院校毕业，本科以上，硕士优先。
					</p>
                    </div>
                  </div>
                </div>
            </div>
		</div>
        
		<div class="span3">
        	<!-- 联系我们 -->
            <div class="headline"><h3>联系我们</h3></div>
            <ul class="unstyled who margin-bottom-20">
                <li><a href="#"><i class="icon-home"></i>中国河北省-邯郸市启信大厦26层</a></li>
                <li><a href="#"><i class="icon-envelope-alt"></i>info@baisee.cn</a></li>
                <li><a href="#"><i class="icon-phone-sign"></i>0310-6178883</a></li>
                <li><a href="#"><i class="icon-globe"></i>http://www.baisiedu.cn</a></li>
            </ul>

        	<!-- 工作时间 -->
            <div class="headline"><h3>工作时间</h3></div>
            <ul class="unstyled">
            	<li><strong>周一到周五:</strong> am 9- pm18</li>
            	<li><strong>周六:</strong>休息</li>
            	<li><strong>周日:</strong>休息</li>
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