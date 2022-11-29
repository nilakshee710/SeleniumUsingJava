package sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class secondtc {
	@BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }
	 
	 @Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test 2");
	 }
	 
	 @Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test 2");
	 }


}
