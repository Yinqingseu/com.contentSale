package com.contentsale.pojo;

public class Contents {
    private Integer contentId;

    private Integer contentPrice;

    private String contentTitle;

    private String contentAbstract;

    private String contentAll;

    private String contentPicture;

    private Integer saleCount;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getContentPrice() {
        return contentPrice;
    }

    public void setContentPrice(Integer contentPrice) {
        this.contentPrice = contentPrice;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    public String getContentAbstract() {
        return contentAbstract;
    }

    public void setContentAbstract(String contentAbstract) {
        this.contentAbstract = contentAbstract == null ? null : contentAbstract.trim();
    }

    public String getContentAll() {
        return contentAll;
    }

    public void setContentAll(String contentAll) {
        this.contentAll = contentAll == null ? null : contentAll.trim();
    }

    public String getContentPicture() {
        return contentPicture;
    }

    public void setContentPicture(String contentPicture) {
        this.contentPicture = contentPicture == null ? null : contentPicture.trim();
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }
}