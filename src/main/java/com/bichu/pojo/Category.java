package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/24.
 */
public class Category {
    private Integer id;

    private String categoryName;

    private String icon;

    private String englishName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Category(Integer id, String categoryName, String icon, String englishName) {
        this.id = id;
        this.categoryName = categoryName;
        this.icon = icon;
        this.englishName = englishName;
    }

    public Category() {
        super();
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", icon='" + icon + '\'' +
                ", englishName='" + englishName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }else {
            if(obj instanceof Category) {
                Category category = (Category) obj;
                if(category.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
