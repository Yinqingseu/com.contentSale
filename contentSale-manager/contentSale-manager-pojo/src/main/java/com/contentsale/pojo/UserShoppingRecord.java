package com.contentsale.pojo;

public class UserShoppingRecord extends UserShoppingRecordKey {
    private Integer userid;

    private Double buyprice;

    private int buynum;

    private String buytime;

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

	public int getBuynum() {
		return buynum;
	}

	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

	public String getBuytime() {
		return buytime;
	}

	public void setBuytime(String buytime) {
		this.buytime = buytime;
	}


}