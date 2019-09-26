package com.Shopnow.entity;

public class CartItemByCustomer_Id {
	

	int UserId = 0;
	String search;
	


	public void setUserId(int UserId) {
		this.UserId = UserId;
	}


	public int getUserId() {
		return UserId;
	}


	public String getSearch() {
		return search;
	}
	
	public void setSearch(String search) {
		this.search = search;
		
		
	}

}
