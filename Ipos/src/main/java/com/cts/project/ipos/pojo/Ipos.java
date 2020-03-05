package com.cts.project.ipos.pojo;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="iposplanned")


public class Ipos {
	
	
	
	@Override
	public String toString() {
		return "Ipos [id=" + id + ", companyname=" + companyname + ", opendatetime=" + opendatetime + ", pricepershare="
				+ pricepershare + ", remarks=" + remarks + ", stockexchange=" + stockexchange + ", totalnoofshares="
				+ totalnoofshares + "]";
	}

	@Id
	private int id;
	private String companyname;
	private int opendatetime;
		private int pricepershare;
	private String remarks;
	private String stockexchange;
	private int totalnoofshares;
	
	
	

	public int getTotalnoofshares() {
		return totalnoofshares;
	}

	public void setTotalnoofshares(int totalnoofshares) {
		this.totalnoofshares = totalnoofshares;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}

	public int getPricepershare() {
		return pricepershare;
	}

	public void setPricepershare(int pricepershare) {
		this.pricepershare = pricepershare;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getOpendatetime() {
		return opendatetime;
	}

	public void setOpendatetime(int opendatetime) {
		this.opendatetime = opendatetime;
	}

	
	

}
	
