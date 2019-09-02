<%--
  Created by IntelliJ IDEA.
  User: whc
  Date: 2019/9/1
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@include file="common/taglib.jsp" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/login/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/login/demo.css"/>
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/login/component.css"/>
    <!--[if IE]>
    <script src="${ctx}/resources/js/login/html5.js"></script>
    <![endif]-->
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>欢迎你</h3>
                <form action="subLogin" name="f" method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="username" class="text" style="color: #FFFFFF !important"
                               type="text" placeholder="请输入账户" autocomplete="off">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="password" class="text"
                               style="color: #FFFFFF !important; position:absolute; z-index:100;"
                               type="password" placeholder="请输入密码" autocomplete="off">
                    </div>
                    <div class="mb2">
                        <input class="act-but submit" type="submit"
                               style="color: #FFFFFF"/>
                        <a class="act-but submit" onclick="login()"
                           href="javascript:void(0);"
                           style="color: #FFFFFF">登录</a></div>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="${ctx}/resources/js/login/TweenLite.min.js"></script>
<script src="${ctx}/resources/js/login/EasePack.min.js"></script>
<script src="${ctx}/resources/js/login/rAF.js"></script>
<script src="${ctx}/resources/js/login/demo-1.js"></script>
</body>
</body>
</html>
