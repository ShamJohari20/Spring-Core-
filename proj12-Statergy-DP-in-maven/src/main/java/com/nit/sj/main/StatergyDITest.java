package com.nit.sj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sj.config.AppConfig;
import com.nit.sj.sbeans.Vehicle;

public class StatergyDITest {

	public static void main(String[] args) {
		System.out.println("StatergyDITest.main()");
		try(
				AnnotationConfigApplicationContext cfg = new AnnotationConfigApplicationContext(AppConfig.class);
				){
			Vehicle v = cfg.getBean("v",Vehicle.class);
			
			String r = v.jounery("Pune","HYD");
			System.out.println(r);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
