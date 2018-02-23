<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>java</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body>
<div class="n-head">
    <div class="g-doc f-cb">
        <div class="user">
            卖家你好，<span class="name">mmmmm</span>！<a href="">[退出]</a>
            请<a href="login.html">[登录]</a>
        </div>
        <ul class="nav">
            <li><a href="index.html">首页</a></li>
            <li><a href="account.html">账务</a></li>
            <li><a href="./public.html">发布</a></li>
        </ul>
    </div>
</div>
<div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>内容发布</h2>
    </div>
    <div class="n-public">
        <form class="m-form m-form-ht" id="form" method="post" action="publicSubmit.html" onsubmit="return false;" autocomplete="off">
            <div class="fmitem">
                <label class="fmlab">标题：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="title" autofocus placeholder="2-80字符"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">摘要：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="summary" placeholder="2-140字符"/> 
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">图片：</label>
                <input name="pic" type="radio" value="图片地址" /> 
				<input name="pic" type="radio" value="本地上传" />
                <div class="fmipt">
                    <input class="u-ipt ipt" name="image" placeholder="图片地址"/>
                </div>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="image" type="file"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">正文：</label>
                <div class="fmipt">
                    <textarea class="u-ipt" name="detail" rows="10" placeholder="2-1000个字符"></textarea> 
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">价格：</label>
                <div class="fmipt">
                    <input class="u-ipt price" name="price"/>元
                </div>
            </div>
            <div class="fmitem fmitem-nolab fmitem-btn">
                <div class="fmipt">
                    <button type="submit" class="u-btn u-btn-primary u-btn-lg">发 布</button>
                </div>
            </div>
        </form>
        <span class="imgpre"><img src="http://nec.netease.com/img/l/1.jpg" alt="" id="imgpre"></span>
    </div>
</div>
<div class="n-foot">
    <p>版权所有：网易云课堂<a href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队</p>
</div>
<script type="text/javascript" src="../js/global.js"></script>
<script type="text/javascript" src="../js/public.js"></script>
</body>
</html>