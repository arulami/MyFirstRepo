package com;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class Sample {
	
	
	String userName;
	
	//constructors
	public Sample(String userName){
		
		this.userName = userName;
		
	}
	
	@Parameters
	public static Collection testData(){
		return Arrays.asList(
				
		new Object[][]	{{"arul"},{"anand"}}	);
				
	}

	@Test
	public void test() {
		
		System.out.println(userName);
		//fail("Not yet implemented");
	}

}
