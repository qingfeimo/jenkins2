package com.liu.commodity.pojo;

public class Commodity {

	private Integer commId;
	private String commName;
	public Integer getCommId() {
		return commId;
	}
	public void setCommId(Integer commId) {
		this.commId = commId;
	}
	public String getCommName() {
		return commName;
	}
	public void setCommName(String commName) {
		this.commName = commName;
	}
	@Override
	public String toString() {
		return "Commodity [commId=" + commId + ", commName=" + commName + "]";
	}
	
	 
}
