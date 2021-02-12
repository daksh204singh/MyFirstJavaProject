package com.rakuten.training.basics;

public class Bus extends Vehicle{

	
	@Override
	public void start() {
		System.out.println("{{{{{{{{{{ Starting Bus }}}}}}}}}}}}");
	}
	
	@Override
	public void stop() {
		System.out.println("{{{{{{{{{{ Stopping Bus }}}}}}}}}}}}");
	}
	
}
