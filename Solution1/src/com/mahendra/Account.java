package com.mahendra;

import java.util.Date;

public abstract class Account {
	
	private String accNumber;
	private String holderName;
	private Date openingDate;
	
	public Account(String accNumber, String holderName, Date openingDate) {
		super();
		this.accNumber = accNumber;
		this.holderName = holderName;
		this.openingDate = openingDate;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	
}
