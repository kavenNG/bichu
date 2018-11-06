package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/21.
 */
public class Teacher {
    private Integer id;

    private String teacherName;

    private Integer collegeId;

    private String avatar;

    private String details;

    private Integer age;

    private Integer majorId;

    private String img;

    private Major major;

    private College college;

    public void setCollege(College college) {
        this.college = college;
    }

    public College getCollege() {
        return college;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Major getMajor() {
        return major;
    }

    public Teacher(Integer id, String name, Integer collegeId, String avatar, String details, Integer age, Integer majorId, Major major, College college) {
        this.id = id;
        this.teacherName = name;
        this.collegeId = collegeId;
        this.avatar = avatar;
        this.details = details;
        this.age = age;
        this.majorId = majorId;
        this.major = major;
        this.college = college;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String name) {
        this.teacherName = name;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorid) {
        this.majorId = majorid;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public Teacher(Integer id, String teacherName, Integer majorId, Integer collegeId, String avatar, String details, Integer age,String img) {
        this.id = id;
        this.teacherName = teacherName;
        this.collegeId = collegeId;
        this.avatar = avatar;
        this.details = details;
        this.age = age;
        this.majorId = majorId;
        this.img = img;
    }


    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", collegeId=" + collegeId +
                ", avatar='" + avatar + '\'' +
                ", details='" + details + '\'' +
                ", age=" + age +
                ", majorId=" + majorId +
                ", major=" + major +
                ", college=" + college +
                '}';
    }
}
