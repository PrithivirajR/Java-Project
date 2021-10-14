package com.java_july_10am_class;

public class Interface3 implements Interface2,Interface1 {

	@Override
	public void emi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cod() {
System.out.println("bike");		
	}

	@Override
	public void car() {
System.out.println("emi");		
	}

	@Override
	public void bike() {
System.out.println("cod");		
	}
	
	private void bus() {
		System.out.println("gov bus");
	}
		public static void main(String[] args) {
			Interface3 i = new Interface3();
			i.bus();
			i.bike();
			i.cod();
			i.car();
			i.emi();
		}
	}

