package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/24.
 */
public class Course {
    private Integer id;

    private Integer courseCategoryId;

    private String details;

    private String content;

    private String resultShow;

    private String faceTo;

    private String signUp;

    private String needKnow;

    private String startTime;

    private String courseName;

    private String courseImg;

    private String courseEnglishName;

    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(Integer courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResultShow() {
        return resultShow;
    }

    public void setResultShow(String resultShow) {
        this.resultShow = resultShow;
    }

    public String getFaceTo() {
        return faceTo;
    }

    public void setFaceTo(String faceTo) {
        this.faceTo = faceTo;
    }

    public String getSignUp() {
        return signUp;
    }

    public void setSignUp(String signUp) {
        this.signUp = signUp;
    }

    public String getNeedKnow() {
        return needKnow;
    }

    public void setNeedKnow(String needKnow) {
        this.needKnow = needKnow;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseEnglishName() {
        return courseEnglishName;
    }

    public void setCourseEnglishName(String courseEnglishName) {
        this.courseEnglishName = courseEnglishName;
    }

    public Course() {
        super();
    }

    public Course(Integer id, Integer courseCategoryId, String details, String content, String resultShow, String faceTo, String signUp, String needKnow, String startTime, String courseName, String courseImg, String courseEnglishName) {
        this.id = id;
        this.courseCategoryId = courseCategoryId;
        this.details = details;
        this.content = content;
        this.resultShow = resultShow;
        this.faceTo = faceTo;
        this.signUp = signUp;
        this.needKnow = needKnow;
        this.startTime = startTime;
        this.courseName = courseName;
        this.courseImg = courseImg;
        this.courseEnglishName = courseEnglishName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseCategoryId=" + courseCategoryId +
                ", details='" + details + '\'' +
                ", content='" + content + '\'' +
                ", resultShow='" + resultShow + '\'' +
                ", faceTo='" + faceTo + '\'' +
                ", signUp='" + signUp + '\'' +
                ", needKnow='" + needKnow + '\'' +
                ", startTime='" + startTime + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseImg='" + courseImg + '\'' +
                ", courseEnglishName='" + courseEnglishName + '\'' +
                ", category=" + category +
                '}';
    }
}
