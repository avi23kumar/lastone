package pro1test;

import org.testng.annotations.Test;

public class Kingtest {
	@Test
	public void test25test()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PAssword = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PAssword);
		
		System.out.println("1111111");
		System.out.println("print one c");
	}

	@Test
	public void test26test()
	{
		System.out.println("print one c");
	}

}
