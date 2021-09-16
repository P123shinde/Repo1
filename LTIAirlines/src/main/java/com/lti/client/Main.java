package com.lti.client;

import com.lti.model.Filght;

public class Main {

	public static void main(String[] args) {
		
		Filght f=new Filght(1001,"Mumbai","Pune");
		System.out.println(f.getFlightId()+ " "+f.getSource()+" "+f.getDestination());
	  
		//test data
		int num1=10;int num2=20;
		if(add(num1,num2)==30) {   //add(num1,num2):returned output
			                      //30             :expected output
			System.out.println("Test Passed.");
		}
		else
		{
			System.out.println("Test Failed.");
		}
	}
	
	
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		return false;
	}
	
	

}
