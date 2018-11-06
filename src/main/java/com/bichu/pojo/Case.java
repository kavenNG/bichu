package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/17.
 */
public class Case {
    private Integer id;

    private Integer studentId;

    private Integer majorId;

    private Integer collegeId;

    private String comment;

    private Integer isSuccess;

    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(int isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String image) {
        this.img = image;
    }

    public Case(Integer id, Integer studentId, Integer majorId, Integer collegeId, String comment, Integer isSuccess, String image) {
        this.id = id;
        this.studentId = studentId;
        this.majorId = majorId;
        this.collegeId = collegeId;
        this.comment = comment;
        this.isSuccess = isSuccess;
        this.img = image;
    }
    public Case() {
        super();
    }

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", majorId=" + majorId +
                ", collegeId=" + collegeId +
                ", comment='" + comment + '\'' +
                ", isSuccess=" + isSuccess +
                ", img='" + img + '\'' +
                '}';
    }

}
