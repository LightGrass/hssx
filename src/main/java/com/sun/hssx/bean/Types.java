package com.sun.hssx.bean;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/3 15:00
 * description:分类对应的实体类
 */
public class Types {
    private int tId;
    private String tName;
    private String tDes;//描述
    private String tNote;//备注
    private String tWeight;//权重

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDes() {
        return tDes;
    }

    public void settDes(String tDes) {
        this.tDes = tDes;
    }

    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote;
    }

    public String gettWeight() {
        return tWeight;
    }

    public void settWeight(String tWeight) {
        this.tWeight = tWeight;
    }
}
