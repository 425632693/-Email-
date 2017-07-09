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
<title>百思旅游平台-首页</title>
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

	<!--=== Banner切换图片 ===-->
<div id="myCarousel" class="carousel slide" >
                <div class="carousel-inner">
                  <div class="item active">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/1.jpg" />
                    <div class="carousel-caption">
                      <p>在长城领队100团.</p>
                    </div>
                  </div>
                  <div class="item">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/2.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在日本领队101团</p>
                    </div>
                  </div>
                  <div class="item">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/3.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在美国西雅图领队102团</p>
                    </div>
                  </div>
                  <div class="item">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/4.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在美国西雅图领队102团</p>
                    </div>
                  </div>
                  <div class="item">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/5.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在美国西雅图领队102团</p>
                    </div>
                  </div>
                   <div class="item">
                    <img style="height:500px;" src="${pageContext.request.contextPath}/statics/images/banner/6.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在美国西雅图领队102团</p>
                    </div>
                  </div>
                </div>
                
                <div class="carousel-arrow">
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev"><i class="icon-angle-left"></i></a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next"><i class="icon-angle-right"></i></a>
                </div>
			</div>
<!--切换图片结束-->
 
<!--=== 内容开始 ===-->
<div class="container">	
	<!-- 服务优势 -->
	<div class="row-fluid">
    	<div class="span4">
    		<div class="service clearfix">
                <i class="icon-resize-small"></i>
    			<div class="desc">
    				<h4>专注来自于专业</h4>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus etiam sem...</p>
    			</div>
    		</div>	
    	</div>
    	<div class="span4">
    		<div class="service clearfix">
                <i class="icon-cogs"></i>
    			<div class="desc">
    				<h4>优质来自于用心</h4>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus etiam sem...</p>
    			</div>
    		</div>	
    	</div>
    	<div class="span4">
    		<div class="service clearfix">
                <i class="icon-plane"></i>
    			<div class="desc">
    				<h4>给您一个安心的旅行</h4>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus etiam sem...</p>
    			</div>
    		</div>	
    	</div>			    
	</div>
	<!-- //服务优势结束 -->

	<!-- 优先推荐的景点 -->
	<div class="headline"><h3>推荐景点</h3></div>
    <ul class="thumbnails">
        <li class="span3">
            <div class="thumbnail-style thumbnail-kenburn">
            	<div class="thumbnail-img">
                    <div class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/img/carousel/2.jpg" alt="" /></div>
                    <a class="btn-more hover-effect" href="#">更多 +</a>					
                </div>
                <h3>
                	<a class="hover-effect" href="#">
						景点一
                	</a></h3>
                <p>
                	景点一的简介及景点一的，详细介绍，线路，住宿，餐饮等内容。
				</p>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style thumbnail-kenburn">
            	<div class="thumbnail-img">
                    <div class="overflow-hidden">
                    	<img src="${pageContext.request.contextPath}/statics/assets/img/carousel/3.jpg" alt="" /></div>
                    <a class="btn-more hover-effect" href="#">更多+</a>					
                </div>
                <h3>
                	<a class="hover-effect" href="#">
						景点二
                	</a>
               	</h3>
                <p>
					景点一的简介及景点一的，详细介绍，线路，住宿，餐饮等内容。
                </p>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style thumbnail-kenburn">
            	<div class="thumbnail-img">
                    <div class="overflow-hidden">
                    	<img src="${pageContext.request.contextPath}/statics/assets/img/carousel/9.jpg" alt="" />
                    </div>
                    <a class="btn-more hover-effect" href="#">更多 +</a>					
                </div>
                <h3>
                	<a class="hover-effect" href="#">
						景点二
                	</a>
               	</h3>
                <p>
					景点一的简介及景点一的，详细介绍，线路，住宿，餐饮等内容。
                </p>
            </div>
        </li>
        <li class="span3">
            <div class="thumbnail-style thumbnail-kenburn">
            	<div class="thumbnail-img">
                    <div class="overflow-hidden"><img src="${pageContext.request.contextPath}/statics/assets/img/carousel/10.jpg" alt="" /></div>
                    <a class="btn-more hover-effect" href="#">更多 +</a>					
                </div>
                <h3>
                	<a class="hover-effect" href="#">
						景点二
                	</a>
               	</h3>
                <p>
					景点一的简介及景点一的，详细介绍，线路，住宿，餐饮等内容。
                </p>
            </div>
        </li>
    </ul>
	<!-- //推荐景点结束 -->
    
	<!-- 导游推荐 -->
	<div class="row-fluid margin-bottom-20">
		<div class="span8">
			<div class="headline"><h3>导游简介</h3></div>
			<p>
				<img class="pull-left lft-img-margin img-width-200" src="${pageContext.request.contextPath}/statics/assets/img/carousel/6.jpg" alt="" />
				导游主要分为中文导游和外语导游。其主要工作内容为引导游客感受山水之美，解决旅途中可能出现的突发事件，并给予游客食、宿、行等方面的帮助。
			</p>	
            <ul class="unstyled">
            	<li><i class="icon-ok color-green"></i> 专业的服务</li>
            	<li><i class="icon-ok color-green"></i> 专业的意见</li>
            	<li><i class="icon-ok color-green"></i> 专业的推荐</li>
            	<li><i class="icon-ok color-green"></i> 专一的路线</li>
            </ul><br />

            <blockquote class="hero-unify">
                <p>客户的需要高于一切，客户是上帝。</p>
                <small>CEO, 谷先生</small>
            </blockquote>
        </div><!--/span8-->        

        <!-- Latest Shots -->
        <div class="span4">
			<div class="headline"><h3>导游相册</h3></div>
			<div id="myCarousel" class="carousel slide">
                <div class="carousel-inner">
                  <div class="item active">
                    <img src="${pageContext.request.contextPath}/statics/assets/img/carousel/5.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在长城领队100团.</p>
                    </div>
                  </div>
                  <div class="item">
                    <img src="${pageContext.request.contextPath}/statics/assets/img/carousel/4.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在日本领队101团</p>
                    </div>
                  </div>
                  <div class="item">
                    <img src="${pageContext.request.contextPath}/statics/assets/img/carousel/3.jpg" alt="" />
                    <div class="carousel-caption">
                      <p>在美国西雅图领队102团</p>
                    </div>
                  </div>
                </div>
                
                <div class="carousel-arrow">
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev"><i class="icon-angle-left"></i></a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next"><i class="icon-angle-right"></i></a>
                </div>
			</div>
        </div><!--/span4-->
	</div><!--/row-fluid-->	
</div>	
<!-- 内容结束 -->

	<!-- 导入公用的底部 -->
	<jsp:include page="/WEB-INF/jsp/common-incloud/bottom.jsp"></jsp:include>
	
	
	<!-- 全局引用的JS -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/js/modernizr.custom.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- 返回顶部JS插件 -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/assets/plugins/back-to-top.js"></script>
	<div id="topcontrol" style="position:fixed; bottom: 5px; right: 5px; opacity:1;cursor: pointer;" title="Scroll Back to Top">
		<img alt="图片加载失败" src="${pageContext.request.contextPath}/statics/assets/img/up.png" style="width: 51px; height: 42px">
	</div>
</body>
</html>