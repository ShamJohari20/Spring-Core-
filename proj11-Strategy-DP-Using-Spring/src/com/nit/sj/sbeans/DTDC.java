package com.nit.sj.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier {

	@Override
	public String deliverd(int oid) {
		System.out.println("DTDC.deliverd()");
		
		return " having order id " + oid + ", items are kept for deliverd by DTDC ";
	}

}
