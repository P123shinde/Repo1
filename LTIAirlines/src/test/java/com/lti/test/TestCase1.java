package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Filght;

public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10;int num2=10;
		
		assertEquals(20,Main.add(num1, num2));
		
	}
	@Test
	public void testNums() {
		int num1=10;int num2=20;
		//assertTrue(Main.compare(num1, num2));
		assertFalse(Main.compare(num1, num2));
	}
	@Test
	public void testobjects() {
		Filght f1=new Filght(1001,"Mumbai","Delhi");
		Filght f2=new Filght(1001,"Mumbai","Delhi");
		//Filght f2=f1;
		Filght f3=null;
		//assertEquals("Objects are not equal",f1,f2);
		assertSame("Objects are not equal",f1,f2);
		assertNotNull(f2);
	}
	
}
