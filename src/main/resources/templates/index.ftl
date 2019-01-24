<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Hilox's Resume</title>
    <meta name="viewport" content="initial-scale=1.0,width=device-width" />
    <link rel="stylesheet" href="${request.contextPath}/static/css/style.css" media="screen"/>
    <link rel="stylesheet" href="${request.contextPath}/static/css/prettyPhoto.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${request.contextPath}/static/css/print.css" media="print"/>
</head>
<body>

<#-- 简历贴纸内容 -->
<div id="sticker"></div>

<#-- 简历主体内容 -->
<div id="wrapper">
    <#include "freemarker/bio.ftl"> <#-- 个人信息 -->
    <#include "freemarker/skills.ftl"> <#-- 技能清单 -->
    <#include "freemarker/experience.ftl"> <#-- 工作经历 -->
    <#include "freemarker/education.ftl"> <#-- 教育经历 -->
    <#include "freemarker/honors_awards.ftl"> <#-- 个人荣誉/技能证书 -->
    <#include "freemarker/personal_projects.ftl"> <#-- 个人项目 -->
    <#include "freemarker/contact.ftl"> <#-- 联系我 -->
</div>

<#-- 版权信息 -->
<div id="copyright">
    <a href="http://hilox.top">Hilox's Blog</a> &copy; ${.now?string("yyyy")} <br />
    <a href="http://www.miitbeian.gov.cn" target="_blank">浙ICP备18055264号</a>
</div>

<#-- script -->
<script src="${request.contextPath}/static/js/jquery.js"></script>
<script src="${request.contextPath}/static/js/prettyPhoto.js"></script>
<script src="${request.contextPath}/static/js/backPosition.js"></script>
<script src="${request.contextPath}/static/js/custom.js"></script>

</body>
</html>