package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/21.
 */
public class College {
    private Integer id;

    private String collegeName;

    private String englishName;

    private String img;

    private String icon;

    private String difficulty;

    private String details;

    private String property;

    private String country;

    public College(Integer id, String name, String englishName, String img, String icon, String difficulty, String details, String property, String country) {
        this.id = id;
        this.collegeName = name;
        this.englishName = englishName;
        this.img = img;
        this.icon = icon;
        this.difficulty = difficulty;
        this.details = details;
        this.property = property;
        this.country = country;
    }
    public College() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String name) {
        this.collegeName = name;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", img='" + img + '\'' +
                ", icon='" + icon + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", details='" + details + '\'' +
                ", property='" + property + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
