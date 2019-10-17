package Basic_rav;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testttrr {
	
	
	@BeforeTest
	public void b(){
		
		System.out.println("b");
	}
	@AfterTest
	public void c(){
		System.out.println("c");
	}
	@Test
public void a(){
	
	System.out.println("a");
}
}
