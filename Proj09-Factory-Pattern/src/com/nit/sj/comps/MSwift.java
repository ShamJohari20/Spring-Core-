package com.nit.sj.comps;

public class MSwift implements ICar {
	
	

	public MSwift() {
		System.out.println("MSwift.MSwift()");
	}

	@Override
	public void carOrder() {
		System.out.println("MSwift.carOrder() Order MSwift");

	}
	
	@Override
	public void carDrive() {
		System.out.println("MSwift.carDrive() Driving MSwift");
	}

}

