package ncs.test8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	public Inventory() {}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) throws AmountNotEnough {
		this.getAmount = getAmount;
		if(inventoryAmount < getAmount) {
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		}
		inventoryAmount -= getAmount;
	}
	

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		String putDate = this.putDate == null ? null + ", " : sdf.format(this.putDate) + " 입고, ";
		String getDate = this.getDate == null ? null + ", ": sdf.format(this.getDate) + " 출고, "; 
		
		return productName + ", " + putDate + putAmount + "개, " 
		+ getDate + getAmount +"개, 재고 " + inventoryAmount + "개";
	}
	
}
