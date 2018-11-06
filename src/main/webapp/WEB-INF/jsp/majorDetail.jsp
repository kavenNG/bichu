<%--
  Created by IntelliJ IDEA.
  User: kaven
  Date: 2018/10/31
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>major_detail</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <script>
        (function(){
            document.documentElement.style.fontSize=document.documentElement.clientWidth/12+'px';
        })()
    </script>
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="../../css/reset.css">
    <link  rel="stylesheet" href="../../css/swiper.min.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/pro_detail.css">
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
</head>
<body>
<div class="pro_tit">
    <div class="pro_in">
        <h1>${major.majorName }</h1>
        <h3>${major.englishName }</h3>
    </div>
</div>
<div class="pro_in pro_detail">
    <div class="pro_model">
        <h2>专业简介</h2>
        <h3>INTRODUCTION</h3>
        <p>${major.introduce }</p>
    </div>
    <div class="pro_model">
        <h2>就业前景</h2>
        <h3>INTRODUCTION</h3>
        <p>${major.careerProspect }</p>
    </div>
    <div class="pro_model">
        <h2>职业方向</h2>
        <h3>INTRODUCTION</h3>
        <p>${major.direction }</p>
    </div>
</div>
<div class="pro_in">
    <h4 class="yxpm">
        院校排名
    </h4>
    <ul class="nav nav-pills" id="myTab">
        <li class="active"><a href="#" data-toggle="tab" onclick="changeToUSA()">美国</a></li>
        <li><a href="#" data-toggle="tab" onclick="changeToEngland()">英国</a></li>
        <li><a href="#" data-toggle="tab" onclick="changeToOther()">其他</a></li>
    </ul>
    <div class="tab-content">
        <!--1-->
        <div class="tab-pane active" id="divstyle">
            <div class="tabbable" style="margin: 3px;">
                <ul class="nav nav-pills divstyletab">
                    <li class="active"><a href="#" data-toggle="tab" onclick="changeToUnder()">本科</a></li>
                    <li><a href="#" data-toggle="tab" onclick="changeToPost()">研究生</a></li>
                </ul>
                <div class="tab-content">
                    <!-- 第一个tab -->
                    <div class="tab-pane fade active in" id="tab11">

                    </div>
                    <!-- 第二个tab -->
                    <%--<div class="tab-pane fade" id="tab12">--%>
                        <%--b--%>
                    <%--</div>--%>
                    <!-- 中间图表结束 -->
                </div>
            </div>
        </div>
        <!-- 2 -->
        <div class="tab-pane" id="divmystyle">
            <div class="tabbable" style="margin: 3px;">
                <ul class="nav nav-pills divstyletab">
                    <li class="active"><a href="#tab11" data-toggle="tab">本科</a></li>
                    <li><a href="#tab12" data-toggle="tab">研究生</a></li>
                </ul>
                <div class="tab-content">
                    <!-- 第一个tab -->
                    <div class="tab-pane fade active in" id="tab21">
                        aa
                    </div>
                    <!-- 第二个tab -->
                    <div class="tab-pane fade" id="tab22">
                        bb
                    </div>
                    <!-- 第三个tab -->

                    <!-- 中间图表结束 -->
                </div>
            </div>
        </div>
        <!-- 3 -->
        <div class="tab-pane" id="divbanshi">
            <div class="tabbable" style="margin: 3px;">
                <ul class="nav nav-pills divstyletab">
                    <li class="active"><a href="#tab11" data-toggle="tab">本科</a></li>
                    <li><a href="#tab12" data-toggle="tab">研究生</a></li>
                </ul>
                <div class="tab-content">
                    <!-- 第一个tab -->
                    <div class="tab-pane fade active in" id="tab31">
                        aaa
                    </div>
                    <!-- 第二个tab -->
                    <div class="tab-pane fade" id="tab32">
                        bbb
                    </div>
                    <!-- 第三个tab -->
                    <!-- 中间图表结束 -->
                </div>
            </div>
        </div>
        <!-- tab end -->
    </div>
</div>
<script type="text/javascript">
    var address = "http://localhost:8080/"
    var country = "美国"
    var order = "underScore"
    var majorId = ${major.id }
    $(function() {
        $('#myTab a').click(function(e) {
            e.preventDefault();
            console.log("mytab")
            $(this).tab('show');
        });
        $('.divstyletab a').click(function(e) {
            e.preventDefault();
            $(this).tab('show');
        })})

    function changeToPost() {
        console.log("post")
        order = "postScore"
        sendRankInfo(country, order, majorId)
        return false;
    }

    function changeToUnder() {
        console.log("under")
        order = "underScore"
        sendRankInfo(country, order, majorId)
        return false;
    }

    function changeToEngland(){
        console.log("england")
        country = "英国"
        sendRankInfo(country, order, majorId)
        return false;
    }

    function changeToOther() {
        console.log("other")
        country = "other"
        sendRankInfo(country, order, majorId)
        return false;
    }

    function changeToUSA(){
        console.log("USA")
        country = "美国"
        sendRankInfo(country, order, majorId)
        return false;
    }
    function sendRankInfo(country, order, majorId) {

        $.ajax({
            url:address + "college/getCollegeByOrder.do?country=" + country + "&order=" + order + "&majorId=" + majorId,
            dataType:"json",
            success: function (data, textStatus) {
                console.log(data);
                setRank(data)
            }
        })
    }


    function setRank(data){
        $("#tab11").find(".zy_list").remove()
        var collegeRankList = data
        for(var i = 0; i < collegeRankList.length; i++) {
            var item = i + 1
            $("#tab11").append("<div class='zy_list'>" +
                                "<div class='left'></div>" +
                                "<div class='right'>" +
                                    "<h2>" + item + "." + collegeRankList[i].collegeName + "</h2>" +
                                    "<p>" + collegeRankList[i].englishName + "</p></div></div>")
        }

    }

    sendRankInfo(country, order, majorId)

</script>
</body>
</html>
