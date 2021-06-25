package com.springRestAPI.springRestAPIEntities;

public class Course {

    private int id;
    private String title;
    private String descreption;

    public Course(){
    }
    public Course(int id, String title, String descreption){
        this.id=id;
        this.title=title;
        this.descreption=descreption;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public String getDescreption() {
        return descreption;
    }
}
