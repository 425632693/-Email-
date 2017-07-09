<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<body>
		<!--=== 顶部Html ===-->
	<div class="top">
		<div class="container">
			<ul class="loginbar pull-right">
				<li><i class="icon-globe"></i><a>语言 <i class="icon-sort-up"></i></a>
					<ul class="nav-list">
						<li class="active"><a href="#">简体中文</a> <i class="icon-ok"></i></li>
					</ul></li>
				<li class="devider">&nbsp;</li>
				<li><a href="page_faq.html" class="login-btn">帮助</a></li>
				<li class="devider">&nbsp;</li>
				<li><a href="login.jsp" class="login-btn">登录</a></li>
				
			</ul>
		</div>
	</div>
	<!--/顶部Html-->

	<!--=== 头部标签 ===-->
	<div class="header">
		<div class="container">
			<!-- Logo -->
			<div class="logo">
				<a href="index.html"><img id="logo-header"
					src="${pageContext.request.contextPath}/statics/assets/img/logo1-default.png" alt="Logo" /></a>
			</div>
			<!-- /logo -->
			<!-- Menu -->
			<div class="navbar">
				<div class="navbar-inner">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a>
					<!-- /nav-collapse -->
					<div class="nav-collapse collapse">
						<ul class="nav top-2">
							<li class="active"><a href="index.jsp"
								class="dropdown-toggle">首页 <b class="caret"></b>
							</a> <b class="caret-out"></b></li>
							<li><a href="scenic_spots.jsp" class="dropdown-toggle">景点
									<b class="caret"></b>
							</a> <b class="caret-out"></b></li>
							<li><a href="join_us.jsp" class="dropdown-toggle">加入我们
									<b class="caret"></b>
							</a> <b class="caret-out"></b></li>
							<li><a href="contact.jsp" class="dropdown-toggle">联系我们
									<b class="caret"></b>
							</a> <b class="caret-out"></b></li>
							<li><a href="about.jsp" class="dropdown-toggle">关于我们
									<b class="caret"></b>
							</a> <b class="caret-out"></b></li>
						</ul>
						<div class="search-open">
							<div class="input-append">
								<form />
								<input type="text" class="span3" placeholder="Search" />
								<button type="submit" class="btn-u">Go</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--=== 头部结束 ===-->

</body>
</html>