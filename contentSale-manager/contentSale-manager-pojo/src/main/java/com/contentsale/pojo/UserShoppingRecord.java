package com.contentsale.pojo;

public class UserShoppingRecord {
    private Integer id;

    private Integer contentid;

    private Integer userid;

    private Double buyprice;

    private String buynum;

    private Long buytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(Double buyprice) {
        this.buyprice = buyprice;
    }

    public String getBuynum() {
        return buynum;
    }

    public void setBuynum(String buynum) {
        this.buynum = buynum == null ? null : buynum.trim();
    }

    public Long getBuytime() {
        return buytime;
    }

    public void setBuytime(Long buytime) {
        this.buytime = buytime;
    }
}