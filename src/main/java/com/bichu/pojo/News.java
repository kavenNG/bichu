package com.bichu.pojo;

/**
 * Created by kaven on 2018/10/24.
 */
public class News {
    private Integer id;

    private String title;

    private String content;

    private String introduce;

    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public News(Integer id, String title, String content, String introduce, String img) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.introduce = introduce;
        this.img = img;
    }

    public News() {
        super();
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", introduce='" + introduce + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
