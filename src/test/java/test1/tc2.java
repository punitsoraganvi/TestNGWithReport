package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tc2 {
	 @Test
	  public void b() {
		  System.out.println("testcase3");
	  }
	  
	  @Test
	  public void c() {
		  Assert.assertEquals(true, false);
		  System.out.println("testcase2");
	  }
}
