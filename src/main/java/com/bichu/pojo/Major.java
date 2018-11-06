package com.bichu.pojo;

import java.util.Locale;

/**
 * Created by kaven on 2018/10/21.
 */
public class Major {
    private Integer id;

    private String majorName;

    private Integer categoryId;

    private String englishName;

    private String img;

    private String icon;

    private String introduce;

    private String careerProspect;

    private String direction;

    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }



    public Major(Integer id, String name, Integer categoryId, String englishName, String img, String icon, String introduce, String careerProspect, String direction) {
        this.id = id;
        this.majorName = name;
        this.categoryId = categoryId;
        this.englishName = englishName;
        this.img = img;
        this.icon = icon;
        this.introduce = introduce;
        this.careerProspect = careerProspect;
        this.direction = direction;
    }

    public Major() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String name) {
        this.majorName = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCareerProspect() {
        return careerProspect;
    }

    public void setCareerProspect(String careerProspect) {
        this.careerProspect = careerProspect;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", majorName='" + majorName + '\'' +
                ", categoryId=" + categoryId +
                ", englishName='" + englishName + '\'' +
                ", img='" + img + '\'' +
                ", icon='" + icon + '\'' +
                ", introduce='" + introduce + '\'' +
                ", careerProspect='" + careerProspect + '\'' +
                ", direction='" + direction + '\'' +
                ", category=" + category +
                '}';
    }
}
