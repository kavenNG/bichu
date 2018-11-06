<%--
  Created by IntelliJ IDEA.
  User: kaven
  Date: 2018/10/24
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>course</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="../../css/reset.css">
    <link  rel="style sheet" href="../../css/swiper.min.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/teachers.css">
    <link rel="stylesheet" href="../../css/workshop.css">
    <script src="../../js/swiper.min.js"></script>
    <script>
        (function(){
            document.documentElement.style.fontSize=document.documentElement.clientWidth/12+'px';
            console.log( document.documentElement)
        })()
    </script>
</head>
<body>
<div class="swiper-container">
    <div class="swiper-wrapper">
        <div class="swiper-slide"><img src="../../images/workshop_02.png"></div>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
</div>
<div class="ts">
    <div class="ts_in">
        <h2>我们的特色</h2>
        <h4>WHAT CAN WE GIVE YOU?</h4>
        <div class="ts_list">
            <h3><span>1</span>特色课程</h3>
            <p>面向大众的情怀与信念<br>
                短时间的高效体验<br>
                职业进阶、学历提升、迈向专业的第一步<br></p>
        </div>
        <div class="ts_list">
            <h3><span>2</span>独具匠心</h3>
            <p>彼初Workshop，让你用手作去沟通，用情怀去表达，用信念去支持，用态度去证明——任何人都有一颗匠人之心。
                一笔一画，一针一线，一创一造，建于精诚，工于品质，让我们一起，以匠人之心，琢时光之影。</p>
        </div>
    </div>
</div>
<div class="zy_mes">
    <c:forEach items="${courseCategorySet }" var="category">
        <div class="fz_zy">
            <div class="tit">
                <h2><img src="downloadFile.do?filename=${category.icon }"> ${category.categoryName }<span>${category.englishName }</span></h2>
            </div>
            <ul>
                <c:forEach items="${courseList }" var="course">
                    <c:if test="${course.category.categoryName eq category.categoryName }">
                        <li onclick="getCourseDetail('${course.id }')">
                            <div class="tx"><img src="downloadFile.do?filename=${course.courseImg }"> </div>
                            <span>${course.courseName }</span>
                        </li>
                    </c:if>
                </c:forEach>
            </ul>
        </div>
    </c:forEach>

</div>
<script>
    var address = "http://localhost:8080/"
    var swiper = new Swiper('.swiper-container', {
        pagination: {
            el: '.swiper-pagination',
        },
    });

    function getCourseDetail(id) {
        window.location.href = address + "course/getCourseDetail.do?id=" + id
    }
</script>
</body>
</html>
