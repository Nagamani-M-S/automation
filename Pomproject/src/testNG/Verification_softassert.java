package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_softassert extends Generic{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("nagamani");
	driver.findElement(By.name("pass")).sendKeys("bns123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, "hello");
	System.out.println("1");
	sa.assertAll();
	
}
}
