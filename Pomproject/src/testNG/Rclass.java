package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rclass extends Generic {
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Nagamani");
		driver.findElement(By.name("pass")).sendKeys("bns123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}
	}

