<%--
  Created by IntelliJ IDEA.
  User: kaven
  Date: 2018/10/24
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>major</title>
    <script src="../../js/basic.js"></script>
    <link rel="stylesheet" href="../../css/reset.css">
    <link rel="stylesheet" href="../../css/major.css">
</head>
<body>
<section class="banner">
    <div class="w">
    </div>
</section>
<section class="content">
    <div class="w">
        <c:forEach items="${categorySet }" var="category">
            <div class="con1">
                <div class="con_title clearfix">
                    <div class="title_img fl" style="background: url('http://localhost:8080/case/downloadFile.do?filename=${category.icon }') no-repeat left top; background-size: contain;">
                    </div>
                    <div class="title_class fl">
                            ${category.categoryName }
                    </div>
                    <div class="title_en fl">
                            ${category.englishName }
                    </div>
                </div>
                <div class="con1_box clearfix">
                <c:forEach items="${majorList }" var="major">
                    <c:if test="${major.category.categoryName eq category.categoryName }">
                            <div class="box clearfix fl" onclick="getMajorDetails('${major.id }')">
                                <div class="box_left fl">
                                    <div class="box_title">
                                        ${major.majorName }
                                    </div>
                                    <div class="box_title_en">
                                        ${major.englishName }
                                    </div>
                                </div>
                                <div class="box_right fl">
                                    <img src="downloadFile.do?filename=${major.img }" alt="">
                                </div>
                            </div>
                    </c:if>
                </c:forEach>
            </div>
            </div>
        </c:forEach>
    </div>
</section>
<script>
    var address = "http://localhost:8080/"
    function getMajorDetails(id) {
        window.location.href = address + "major/getMajorDetails.do?majorId=" + id
    }
</script>
</body>
</html>
