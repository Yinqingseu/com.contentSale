package com.contentsale.pojo;

public class Product extends Contents {
	private boolean isBuy = false;
	private boolean isSell = false;
    private int buyNum = 0;
    private Double buyPrice;
    private String buyTime;
    private int sellNum = 0; //出售数量

    
	public int getSellNum() {
		return sellNum;
	}
	public void setSellNum(int sellNum) {
		this.sellNum = sellNum;
	}
	public boolean getIsBuy() {
		return isBuy;
	}
	public void setIsBuy(boolean isBuy) {
		this.isBuy = isBuy;
	}
	public boolean getIsSell() {
		return isSell;
	}
	public void setIsSell(boolean isSell) {
		this.isSell = isSell;
	}
	public int getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	public Double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}
	
}
