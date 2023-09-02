package testNG;

import org.testng.annotations.Test;

public class Runner_class2 extends Generic{
	@Test
	public void test2()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

}
}


