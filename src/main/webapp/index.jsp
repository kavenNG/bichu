<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="css/default.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="css/demo-2.css">
    <link rel="stylesheet" href="css/reset.css">
    <link  rel="stylesheet" href="css/swiper.min.css">
    <link rel="stylesheet" href="css/style.css">
    <style>
        .swiper-container img {
            height:100% !important;
        }
    </style>
</head>
<body>
<div class="header">
    <div class="nav burger"><img src="images/nav_bar.png"> </div>
    <div>
        <img src="images/logo.png" class="logo">
        <h2>彼初艺术留学</h2>
    </div>
</div>
<div class="swiper-container" style="height: 6.2rem;">
    <div class="swiper-wrapper" id="swiper-wrapper">
        <div class="swiper-slide"><img src=""></div>
        <div class="swiper-slide"><img src=""></div>
        <div class="swiper-slide"><img src=""></div>
        <div class="swiper-slide"><img src=""></div>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
</div>
<div class="menu">
    <ul class="clearfix">
        <li>
            <a href="javascript:toCourse()">
                <div><img src="images/culum.png"> </div>
                <span>课程</span>
            </a>
        </li>
        <li>
            <a href="javascript:toMajor()">
                <div><img src="images/major.png"> </div>
                <span>专业</span>
            </a>
        </li>
        <li>
            <a href="javascript:toCollege()">
                <div><img src="images/Univer.png"> </div>
                <span>院校</span>
            </a>
        </li>
        <li>
            <a href="#">
                <div><img src="images/case.png"> </div>
                <span>案例</span>
            </a>
        </li>
    </ul>
</div>
<div class="hot_clum">
    <h2>热门课程</h2>
    <div class="hot_con">
        <div class="work_jx">
            <a href="#">
                <div>
                    <img src="images/work_09.png">
                </div>
                <div>
                    <p>完善合理教学体系</p>
                    <p>培养个人核心能力</p>
                </div>
            </a>
        </div>
        <div class="work_jx">
            <a href="#">
                <div>
                    <img src="images/work_09.png">
                </div>
                <div>
                    <p>海外名师倾力辅导</p>
                    <p>VIP梦想名校直通车</p>
                </div>
            </a>
        </div>
    </div>
</div>
<div class="stic">
    <div class="stic_con">
        <div>
            <h3>金牌师资团队</h3>
            <h4>全职导师</h4>
            <h4>覆盖艺术设计全专业</h4>
        </div>
        <div>
            <h3>海外名校资源</h3>
            <h4>与数十所海外名校</h4>
            <h4>有官方合作关系</h4>
        </div>
        <div>
            <h3>5T教学体系</h3>
            <h4>全程教务    教学引导</h4>
            <h4>提升把关  最终文案</h4>
            <h4>提交申请</h4>
        </div>
        <div>
            <h3>国际体验课程</h3>
            <h4>体验纯正海外艺</h4>
            <h4>术课程，直击真</h4>
            <h4>实的设计流程</h4>
        </div>
    </div>
</div>
<div class="swiper-container1">
    <h2>热门专业推荐</h2>
    <div id="focus_Box">
        <span class="prev">&nbsp;</span>
        <span class="next">&nbsp;</span>
        <ul>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
            <li>
                <a href="#"><img  src="images/ue.png" /></a>
            </li>
        </ul>
    </div>
</div>
<div class="art_tea">
    <div>
        <H2>艺术导师</H2>
        <div class="teah_con">
            <ul id="teachers">
                <%--<li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <div><img src="images/teacher_03.png"> </div>
                        <h4>VIVI</h4>
                        <p>意大利多莫斯设计学院
                            时尚视觉设计</p>
                    </a>
                </li>--%>
            </ul>
            <div class="more">
                <a href="#">
                    更多导师
                </a>
            </div>
        </div>
    </div>
</div>
<div class="art_tea secss_case">
    <div>
        <H2>成功案例</H2>
        <div class="teah_con" id="successImg">
            <%--<img src="images/case1.png" style="width:100%">--%>
            <div class="more">
                <a href="#">
                    更多案例
                </a>
            </div>
        </div>
    </div>
</div>
<div class="news">
    <h2>留学资讯</h2>
    <ul id="news">
        <%--<li>
            <div class="left_img"><img src="images/news_10.png"> </div>
            <div class="right_con">
                <h5>帕森斯设计学院2019年招生简章</h5>
                <p>帕森斯设计学院2019年招生简章帕森斯设计学院
                    2019年招生简章帕森斯设计...</p>
            </div>
        </li>
        <li>
            <div class="left_img"><img src="images/news_10.png"> </div>
            <div class="right_con">
                <h5>帕森斯设计学院2019年招生简章</h5>
                <p>帕森斯设计学院2019年招生简章帕森斯设计学院
                    2019年招生简章帕森斯设计...</p>
            </div>
        </li>
        <li>
            <div class="left_img"><img src="images/news_10.png"> </div>
            <div class="right_con">
                <h5>帕森斯设计学院2019年招生简章</h5>
                <p>帕森斯设计学院2019年招生简章帕森斯设计学院
                    2019年招生简章帕森斯设计...</p>
            </div>
        </li>--%>
    </ul>
    <div class="more">
        <a href="#">
            更多案例
        </a>
    </div>
</div>
<div class="footer">
    <div class="footer_in">
        <div class="contact">
            <h2><span>彼初</span>专业艺术留学作品集辅导</h2>
            <h3>tel:400-880-8800</h3>
            <h4>email:bichuart@163.com</h4>
            <h4>address:北京市朝阳区中心广场b座2222</h4>
        </div>
        <div class="wx">
            <div></div>
            <P>彼初公众微信</P>
        </div>
    </div>
</div>
<script src="js/swiper.min.js"></script>
<script src="js/ZoomPic.js"></script>
<script>
    var swiper = new Swiper('.swiper-container', {
        pagination: {
            el: '.swiper-pagination',
        }
    });

</script>
<script src="js/stopExecutionOnTimeout.js?t=1"></script>
<script src="js/jquery-2.1.1.min.js"></script>
<script>
    var address = "http://localhost:8080/";
    if ('ontouchstart' in window) {
        var click = 'touchstart';
    } else {
        var click = 'click';
    }
    $('div.burger').on(click, function () {
        if (!$(this).hasClass('open')) {
            openMenu();
        } else {
            closeMenu();
        }
    });
    /*$('div.menu ul li a').on(click, function (e) {
        e.preventDefault();
        closeMenu();
    });*/
    function openMenu() {
        $('div.circle').addClass('expand');
        $('div.burger').addClass('open');
        $('div.x, div.y, div.z').addClass('collapse');
        $('.menu li').addClass('animate');
        setTimeout(function () {
            $('div.y').hide();
            $('div.x').addClass('rotate30');
            $('div.z').addClass('rotate150');
        }, 70);
        setTimeout(function () {
            $('div.x').addClass('rotate45');
            $('div.z').addClass('rotate135');
        }, 120);
        $(".menu").css("z-index", "999");

    }
    function closeMenu() {
        $('div.burger').removeClass('open');
        $('div.x').removeClass('rotate45').addClass('rotate30');
        $('div.z').removeClass('rotate135').addClass('rotate150');
        $('div.circle').removeClass('expand');
        $('.menu li').removeClass('animate');
        setTimeout(function () {
            $('div.x').removeClass('rotate30');
            $('div.z').removeClass('rotate150');
        }, 50);
        setTimeout(function () {
            $('div.y').show();
            $('div.x, div.y, div.z').removeClass('collapse');
        }, 70);
        $(".menu").css("z-index", "-1");
    }

    (function() {
        $.ajax({
            url:address + "case/getSuccess.do",
            dataType:"json",
            success:function(data, textStatus) {
             console.log(data);
                setSuccessImg(data.data[0].img)
            }
        })

        $.ajax({
            url:address + "teacher/getTeacherDetails.do",
            dataType:"json",
            success: function (data, textStatus) {
                console.log(data);
                setTeachers(data);
            }
        })

        $.ajax({
            url:address + "case/getBannerImg.do",
            dataType:"json",
            success: function (data, textStatus) {
                console.log(data);
                setBanner(data);
            }
        })

        $.ajax({
            url:address + "news/getNews.do",
            dataType:"json",
            success: function (data, textStatus) {
                console.log(data);
                setNews(data);
            }
        })
    })()
    function setSuccessImg(filename) {
        $("#successImg").prepend("<img src=case/downloadFile.do?filename=" + filename + "/>");
        $("#successImg img").css("width", "100%");
    }

    function setTeachers(data) {
        var teachers = data.data;
        for(var i =  0;i < teachers.length; i++) {
            $("#teachers").append("<li><a style='display:block;' href='" + address + "teacher/getTeacherMoreDetails.do?id="+ teachers[i].id +"'> <div><img src=case/downloadFile.do?filename="+ teachers[i].avatar + "/></div> <h4>"+ teachers[i].teacherName +"</h4> <p style='overflow: hidden;text-overflow:ellipsis;white-space: nowrap;'>"+ teachers[i].details +"</p></a></li>")
        }
    }

    function setBanner(data) {
        var imgList = data.data;
        for(var i = 0; i < imgList.length; i++) {
            $("#swiper-wrapper").find("img").eq(i).attr("src", "case/downloadFile.do?filename=" + imgList[i])
        }
    }

    function setNews(data) {
        var newsList = data.data
        for(var i = 0; i < newsList.length; i++) {
            $("#news").append("<li><div class='left_img'><img src='case/downloadFile.do?filename="+ newsList[i].img +"'></div>" +
                    "<div class='right_con'><h5>"+ newsList[i].title +"</h5><p>"+ newsList[i].introduce +"</p></div></li>")
        }

    }

    function toCollege() {
        window.location.href = address + "college/getCollegeList.do";
    }

    function toMajor() {
        window.location.href = address + "major/getMajors.do"
    }

    function toCourse() {
        window.location.href = address + "course/getCourses.do"
    }
</script>
<script>
    (function(){
        document.documentElement.style.fontSize=document.documentElement.clientWidth/12+'px';
    })()
</script>
</body>
</html>
