<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fighting In Life</title>

<!-- 
 ${pageContext.request.contextPath}/static/css/default.css
 -->
 
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.easyui.min.js"></script>
<link href="${pageContext.request.contextPath}/static/css/index/easyui.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/static/css/index/skin-redlight.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/static/css/index/Site.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/static/css/index/font-awesome.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/static/js/index/home.js"></script>
<script src="${pageContext.request.contextPath}/static/js/index/common.js"></script>

</head>
<body class="easyui-layout" id="easyLayout">

	<div id="modalwindow" class="easyui-window"
		data-options="closed:true,minimizable:false,shadow:false,collapsible:true">
	</div>

	<div id="north" data-options="region:'north',border:false,split:false"
		style="height: 50px; padding: 0; margin: 0">
		<table class="banner" style="border-spacing: 0px;">
			<tr>
				<td class="webname"><span class="fa fa-yelp"
					style="font-size: 26px; padding-right: 8px;"></span>Fighting In Life
					</td>
				<td></td>
				<td style="width: 180px; overflow: hidden;"><a
					id="showUserInfo" style="display: inline-block;"
					class="fa bannerbtn" href="javascript:void()"> <img
						src="${pageContext.request.contextPath}/static/images/index/photo.jpg" class="user-image"
						alt="User Image"> <span class="user-name">Fight</span>
				</a></td>
			</tr>
		</table>
	</div>

	<div id="west"
		data-options="region:'west',split:true,title:'MAIN NAVIGATION',collapsible:false"
		style="width: 220px; height: 100%; overflow: auto; border-bottom: 0px;">

		<div id="RightAccordion" class="easyui-accordion" data-options="fit:true,border:false">
			<div class="easyui-accordion" style="width: 500px; height: 300px;">
				<div title="TreeMenu" data-options="iconCls:'fa fa-search'"
					style="padding: 10px;">
					<ul class="easyui-tree">
						<li><span>Foods</span>
							<ul>
								<li><span>Fruits</span>
									<ul>
										<li><a style="color: #000"
											href="javascript:addTab('apple','Datagrid.html','fa fa-plus')">apple</a></li>
										<li><a style="color: #000"
											href="javascript:addTab('orange','Datagrid.html','fa fa-plus')">orange</a></li>
									</ul></li>
							</ul></li>
					</ul>
				</div>
				
				<div title="About" data-options="iconCls:'fa fa-arrow-right'"
					style="overflow: auto; padding: 10px;">
					<h3 style="color: #0099FF;">Accordion for jQuery</h3>
					<p>Accordion is a part of easyui framework for jQuery. It lets
						you define your accordion component on web page more easily.</p>
				</div>
				
				<div title="Help" data-options="iconCls:'fa fa-question-circle'"
					style="padding: 10px;">
					<p>Users can define a panel to be selected. If it is not
						specified, then the first panel is taken by default.</p>
				</div>

			</div>
		</div>
		<div id="RightTree" class="easyui-tree"></div>
	</div>

	<div id="center" data-options="region:'center',border:false">
		<div id="mainTab" class="easyui-tabs" data-options="fit:true">
			<!--  <div title="我的桌面" data-options="closable:true,iconCls:'fa fa-tachometer'">
                <iframe scrolling="auto" frameborder="0" src="Desktop.html" style="width: 100%; height: 100%;"></iframe>
            </div>
            <div title="表格样例" data-options="closable:true,iconCls:'fa fa-table'">
                <iframe scrolling="auto" frameborder="0" src="DataGrid.html" style="width: 100%; height: 100%;"></iframe>
            </div>-->
		</div>
	</div>

	<div id="tab_menu" class="easyui-menu" style="width: 150px;">
		<div id="tab_menu-tabrefresh" data-options="iconCls:'icon-reload'">
			刷新</div>
		<div id="tab_menu-openFrame">在新的窗体打开</div>
		<div id="tab_menu-tabcloseall">关闭所有</div>
		<div id="tab_menu-tabcloseother">关闭其他标签页</div>
		<div class="menu-sep"></div>
		<div id="tab_menu-tabcloseright">关闭右边</div>
		<div id="tab_menu-tabcloseleft">关闭左边</div>
		<div id="tab_menu-tabclose" data-options="iconCls:'fa fa-trash'">
			关闭</div>
		<div id="menu" class="easyui-menu" style="width: 150px;"></div>
	</div>
</body>
</html>