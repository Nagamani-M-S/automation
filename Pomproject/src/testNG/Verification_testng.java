package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_testng extends Generic
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("nagamani");
	driver.findElement(By.name("pass")).sendKeys("bns123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Forgotten Password | Can't Log In | Facebook");
	System.out.println("1");
}
}
