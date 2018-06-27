package com.lyf.model;

public class Company {
    private Integer cid;

    private String cname;

    private String typename;

    private String cintroduce;

    private String cphotopath;

    private String position;

    private String place;

    private String skillneed;

    private String others;

    private Integer uid;

    private String username;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getCintroduce() {
        return cintroduce;
    }

    public void setCintroduce(String cintroduce) {
        this.cintroduce = cintroduce == null ? null : cintroduce.trim();
    }

    public String getCphotopath() {
        return cphotopath;
    }

    public void setCphotopath(String cphotopath) {
        this.cphotopath = cphotopath == null ? null : cphotopath.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getSkillneed() {
        return skillneed;
    }

    public void setSkillneed(String skillneed) {
        this.skillneed = skillneed == null ? null : skillneed.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}