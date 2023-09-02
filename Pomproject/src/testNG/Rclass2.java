package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rclass2 extends Generic{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Nagamani");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("bns123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	
}
	@Test
	public void test2()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}

