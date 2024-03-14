package com.app.pravin.chartservice.bean;

import lombok.Data;

@Data
public class CartInfo 
{
	private String id;
	private Double amt;
	public CartInfo(String id, Double amt) {
		super();
		this.id = id;
		this.amt = amt;
	}
	
	
	
}
