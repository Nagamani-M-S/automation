package groups_testng;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("compose");
	}
@Test(groups= {"sanity","regression"})
public void test2()
{
	System.out.println("sent items");
}
@Test(groups= {"regression"})
public void test3()
{
	System.out.println("trash");
}
}

