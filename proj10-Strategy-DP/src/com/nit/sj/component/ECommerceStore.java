package com.nit.sj.component;

import java.util.Arrays;
import java.util.Random;

public class ECommerceStore {
	//Has-A Property 
	ICourier courier;
	
	
	
	public ECommerceStore() {
		System.out.println("ECommerceStore.ECommerceStore()");
	}
	
	public void setCourier (ICourier courier) {
		this.courier = courier;
	}
	
	public String shopping (String [] items, double [] price) {
		System.out.println("ECommerceStore.shopping()");
		
		// Calculate Bill
		double billAmt = 0.0;
		
		for (double  b : price) {
			billAmt = billAmt+b;
		}
		
		
		// Generate Order ID
		int oid = new Random().nextInt(10000);
		
		// used Courier for deliverd
		
		String msg = courier.deliverd(oid);
		
		return Arrays.toString(items) + " are Perchesed having prices are " + Arrays.toString(price) + " with bill amount " + billAmt +" "+ msg;
	}
}
