package com.qfedu.pojo;

public class Book {
    private Integer id;

    private Integer typeid;

    private String name;

    private Integer auid;

    private String status;

    private String coverimg;

    private String expense;

    private Integer wordnum;

    private Integer info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAuid() {
        return auid;
    }

    public void setAuid(Integer auid) {
        this.auid = auid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg == null ? null : coverimg.trim();
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense == null ? null : expense.trim();
    }

    public Integer getWordnum() {
        return wordnum;
    }

    public void setWordnum(Integer wordnum) {
        this.wordnum = wordnum;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }
}