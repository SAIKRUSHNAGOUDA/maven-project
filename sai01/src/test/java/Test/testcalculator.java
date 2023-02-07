package Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sai01.calculator;



public class testcalculator {
	public static calculator objCalculator;

	@Before

	public void setup() throws Exception {
		objCalculator=new calculator();
	}

	@After
    public void tearDown() throws Exception {

	System.out.println("closing ");
	}

	@Test

	public void additionTest() {

	assertEquals(25, objCalculator.addition(12, 13));
	}

	


	

	

}
