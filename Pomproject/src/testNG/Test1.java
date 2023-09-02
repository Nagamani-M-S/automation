package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test()
	public void data1(){
		Reporter.log("hello",true);
		
	}
	@Test(dependsOnMethods="data1")
	public void data2(){
		Reporter.log("world",true);
		
	}
	}

