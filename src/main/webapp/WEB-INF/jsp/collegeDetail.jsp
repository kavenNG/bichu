<%--
  Created by IntelliJ IDEA.
  User: kaven
  Date: 2018/10/24
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>college_detail</title>
    <script src="../../js/basic.js"></script>
    <script src="../../js/college_detail.js"></script>
    <link rel="stylesheet" href="../../css/reset.css">
    <link rel="stylesheet" href="../../css/college_detail.css">
</head>
<body>

<section class="banner" style="background: url('http://localhost:8080/case/downloadFile.do?filename=${college.img }') no-repeat 100%; background-size: cover;">
    <div class="w">
        <div class="logo" ></div>
    </div>
</section>

<section class="content">
    <div class="w">
        <div class="main_info">
            <p>${college.collegeName }</p>
            <p>${college.englishName }</p>
            <p><i class="pointer"></i>${college.country }</p>
        </div>
        <div id="bigbox">
            <div class="box extend_box">
                <div class="content_box clearfix">
                    <div class="left">
                        院校性质
                    </div>
                    <div class="right">
                        ${college.property }
                    </div>
                </div>

            </div>
            <div class="box ">
                <div class="box_title">
                    <span class="title_cn">院校概况</span>
                    <span class="title_en">INTRODUCTION</span>
                    <p style="font-size:0.3rem;line-height:0.8rem;">
                        ${college.details }
                    </p>
                </div>
            </div>
            <%--<div class="box ">
                <div class="box_title">
                    <span class="title_cn">院校概况</span>
                    <span class="title_en">INTRODUCTION</span>
                </div>
            </div>
            <div class="box ">
                <div class="box_title">
                    <span class="title_cn">院校概况</span>
                    <span class="title_en">INTRODUCTION</span>
                </div>
            </div>--%>

        </div>
    </div>
</section>
</body>
</html>
