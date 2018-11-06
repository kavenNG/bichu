<%--
  Created by IntelliJ IDEA.
  User: kaven
  Date: 2018/10/24
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>courseDetail</title>
    <script src="../../js/basic.js"></script>
    <link rel="stylesheet" href="../../css/reset.css">
    <link rel="stylesheet" href="../../css/workshopCourse_detail.css">
</head>
<body>
<section class="banner">
    <div class="w">
        <div class="title_box">
            <h1 class="banner_title1">
                彼初工坊
            </h1>
            <p class="title_sub1">
                Workshop教学工坊
            </p>
            <p class="title_sub2">
                国外教学生被+原生教学系统
            </p>
        </div>
    </div>
</section>
<section class="content">
    <div class="w">
        <div class="sub_con1">
            <%--平面裁剪结合立体裁剪，系统整理服装制版变化的精髓，
            课程连贯清晰。经典的教材是经过老师不断的钻研，推敲
            ，并且一直在不断的提高，即使是零基础学者也好学易懂。
            服装造型基础是一个系统的制作过程，同时也是服装设计师
            必须具备的基本技能。维欧服装培训开发国内最全面的制作课
            程结合服装工艺，让学生最大程度的掌握服装制作技术。经验
            丰富技艺超群的师资团队，保证学生收获扎实过硬的服装制作本
            领与工艺技巧--%>
            ${course.details }
        </div>
        <div class="sub_con2">
            <div class="con2_box clearfix">
                <div class="left_img fl">
                </div>
                <div class="right_con fl">
                    <div class="right_con_title">
                        招生对象
                    </div>
                    <div class="right_con_content">
                        <%--1. 服装设计相关专业的在校生<br>
                        2. 零基础的服装设计制作爱好者<br>
                        3. 其他专业想跨专业申请国内研究生的在校生。<br>
                        4. 有计划服装设计留学深造的学员。--%>
                        ${course.faceTo }
                    </div>
                </div>
            </div>
            <div class="con2_box clearfix">
                <div class="left_img fl">
                </div>
                <div class="right_con fl">
                    <div class="right_con_title">
                        网上报名及缴费
                    </div>
                    <div class="right_con_content">
                       <%-- 1、学生自行登录彼初国际教育机构官方网站（http://BETURE.com）浏览报名须知。<br>
                        2、为了及时安排老师授课，保证授课质量，如有意报名者需提前一个月预定课程并缴纳报名费1500元，正式入学后该报名费可转为学费。<br>
                        3、 入学三天内需缴纳剩余费用--%>
                        ${course.signUp }
                    </div>
                </div>
            </div>
            <div class="con2_box clearfix">
                <div class="left_img fl">
                </div>
                <div class="right_con fl">
                    <div class="right_con_title">
                        报名须知
                    </div>
                    <div class="right_con_content">
                        <%--1、如学员因个人原因请办理退学，三天内只退学费不退报名费，超过三天均不予办理。<br>
                        2、维欧国际教育机构，绝对保证教学质量，课程结束后保证学员能够自己独立操作所学习内容。<br>
                        3、课程结束后可以随时电话或远程协助，就职后遇到疑难问题为学员无偿解答。--%>
                        ${course.needKnow }
                    </div>
                </div>
            </div>
            <div class="con2_box clearfix">
                <div class="left_img fl">
                </div>
                <div class="right_con fl">
                    <div class="right_con_title">
                        上课时间
                    </div>
                    <div class="right_con_content">
                        <%--平日班：周一至周五<br>
                        周末班：周六至周日<br>
                        10：00-17：30。--%>
                        ${course.startTime }
                    </div>
                </div>
            </div>
        </div>
        <div class="sub_con3">
            <div class="sub_con_title">
                授课内容
            </div>
           <%-- <div class="sub_con3_con">
                <div class="con3_box clearfix">
                    <div class="con3_left fl">
                        NO.1
                    </div>
                    <div class="con3_right fl">
                        <div class="con3_right_title">
                            基本知识
                        </div>
                        <div class="con3_right_con">
                            1.制版所需工具介绍，如版纸、打孔器、压轮、刀口嵌等。2.人体膜片讲解，人体立体结构平面分析（领圈、袖笼、肩膀、腰、胸、的平面构成）3.缝纫机的结构和使用。
                        </div>
                    </div>
                </div>
                <div class="con3_box clearfix">
                    <div class="con3_left fl">
                        NO.1
                    </div>
                    <div class="con3_right fl">
                        <div class="con3_right_title">
                            基本知识
                        </div>
                        <div class="con3_right_con">
                            1.制版所需工具介绍，如版纸、打孔器、压轮、刀口嵌等。2.人体膜片讲解，人体立体结构平面分析（领圈、袖笼、肩膀、腰、胸、的平面构成）3.缝纫机的结构和使用。
                        </div>
                    </div>
                </div>
                <div class="con3_box clearfix">
                    <div class="con3_left fl">
                        NO.1
                    </div>
                    <div class="con3_right fl">
                        <div class="con3_right_title">
                            基本知识
                        </div>
                        <div class="con3_right_con">
                            1.制版所需工具介绍，如版纸、打孔器、压轮、刀口嵌等。2.人体膜片讲解，人体立体结构平面分析（领圈、袖笼、肩膀、腰、胸、的平面构成）3.缝纫机的结构和使用。
                        </div>
                    </div>
                </div>
                <div class="con3_box clearfix">
                    <div class="con3_left fl">
                        NO.1
                    </div>
                    <div class="con3_right fl">
                        <div class="con3_right_title">
                            基本知识
                        </div>
                        <div class="con3_right_con">
                            1.制版所需工具介绍，如版纸、打孔器、压轮、刀口嵌等。2.人体膜片讲解，人体立体结构平面分析（领圈、袖笼、肩膀、腰、胸、的平面构成）3.缝纫机的结构和使用。
                        </div>
                    </div>
                </div>

            </div>--%>
            <img style="width:100%;" src="downloadFile.do?filename=${course.content }" alt=""/>

        </div>
        <div class="sub_con4">
            <div class="sub_con_title">
                成果展示
            </div>
            <%--<div class="sub_con4_con clearfix">
                <div class="sub_con4_img fl">
                    <img src="#" alt="">
                </div>
                <div class="sub_con4_img fl">
                    <img src="#" alt="">
                </div>
                <div class="sub_con4_img fl">
                    <img src="#" alt="">
                </div>
                <div class="sub_con4_img fl">
                    <img src="#" alt="">
                </div>
            </div>--%>
            <img style="width:100%;" src="downloadFile.do?filename=${course.resultShow }" alt=""/>
        </div>
    </div>



</section>
</body>
</html>
