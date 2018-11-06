<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>college</title>
    <script src="../../js/basic.js"></script>

    <link rel="stylesheet" href="../../css/reset.css">
    <link rel="stylesheet" href="../../css/school.css"/>
</head>
<body>
<section class="banner">
    <div class="w">
    </div>
</section>
<section class="content">
    <div class="w">
        <div class="flag">
            <img src="../../images/国旗.png" alt="">
        </div>
        <div class="school_list" id="collegeList">
            <c:forEach items="${collegeList }" var="college">
                <div class="card" onclick="getCollegeDetails('${college.id }')">
                    <div class="top" style="background: url('http://localhost:8080/case/downloadFile.do?filename=${college.img }') no-repeat top left; background-size:100% 100%;">
                        <div class="mask"></div>
                        <div class="top_info">
                            <div class="card_title">
                                ${college.collegeName }
                            </div>
                            <div class="card_title_en">
                                    ${college.englishName }
                            </div>
                            <div class="card_otherinfo">
                                <span class="card_type">${college.property }</span><span class="pointer"></span><span class="card_position">${college.country }</span>
                            </div>
                            <div class="card_logo">
                                <img src="downloadFile.do?filename=${college.icon }" alt="">
                            </div>
                        </div>
                    </div>
                    <div class="bottom">
                        <div class="content_box clearfix">
                            <div class="left">
                                申请难度
                            </div>
                            <div class="right">
                                困难
                            </div>
                        </div>
                        <%--<div class="content_box clearfix">
                            <div class="left">
                                申请难度
                            </div>
                            <div class="right">
                                困难
                            </div>
                        </div>
                        <div class="content_box clearfix">
                            <div class="left">
                                申请难度
                            </div>
                            <div class="right">
                                困难
                            </div>
                        </div>
                        <div class="content_box clearfix">
                            <div class="left">
                                申请难度
                            </div>
                            <div class="right">
                                困难
                            </div>
                        </div>--%>
                        <div class="btnbox clearfix">

                            <div class="btn">
                                在线咨询
                            </div>
                            <div class="btn">
                                预约报名
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
           <%-- <div class="card">
                <div class="top">
                    <div class="mask"></div>
                    <div class="top_info">
                        <div class="card_title">
                            罗德岛设计学院
                        </div>
                        <div class="card_title_en">
                            Rhode Island School of Design
                        </div>
                        <div class="card_otherinfo">
                            <span class="card_type">私立艺术类</span><span class="pointer"></span><span class="card_position">Providence,Rhode Island, US</span>
                        </div>
                        <div class="card_logo">
                            <img src="${pageContext.request.contextPath }/images/logo.png" alt="">
                        </div>
                    </div>

                </div>
                <div class="bottom">
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="btnbox clearfix">

                        <div class="btn">
                            在线咨询
                        </div>
                        <div class="btn">
                            预约报名
                        </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="top">
                    <div class="mask"></div>
                    <div class="top_info">
                        <div class="card_title">
                            罗德岛设计学院
                        </div>
                        <div class="card_title_en">
                            Rhode Island School of Design
                        </div>
                        <div class="card_otherinfo">
                            <span class="card_type">私立艺术类</span><span class="pointer"></span><span class="card_position">Providence,Rhode Island, US</span>
                        </div>
                        <div class="card_logo">
                            <img src="${pageContext.request.contextPath }/images/logo.png" alt="">
                        </div>
                    </div>

                </div>
                <div class="bottom">
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="btnbox clearfix">

                        <div class="btn">
                            在线咨询
                        </div>
                        <div class="btn">
                            预约报名
                        </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="top">
                    <div class="mask"></div>
                    <div class="top_info">
                        <div class="card_title">
                            罗德岛设计学院
                        </div>
                        <div class="card_title_en">
                            Rhode Island School of Design
                        </div>
                        <div class="card_otherinfo">
                            <span class="card_type">私立艺术类</span><span class="pointer"></span><span class="card_position">Providence,Rhode Island, US</span>
                        </div>
                        <div class="card_logo">
                            <img src="${pageContext.request.contextPath }/images/logo.png" alt="">
                        </div>
                    </div>

                </div>
                <div class="bottom">
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="content_box clearfix">
                        <div class="left">
                            申请难度
                        </div>
                        <div class="right">
                            困难
                        </div>
                    </div>
                    <div class="btnbox clearfix">

                        <div class="btn">
                            在线咨询
                        </div>
                        <div class="btn">
                            预约报名
                        </div>
                    </div>
                </div>
            </div>--%>
        </div>
    </div>
</section>
<script src="../../js/jquery-2.1.1.min.js"></script>

<script>
    var address = "http://localhost:8080/"
    function getCollegeDetails(id){

        window.location.href = address + "college/getCollegeDetails.do?id=" + id
    }
</script>
</body>
</html>

