package com.lbrce.devops;

import org.testng.annotations.Test;

import org.testng.Assert;

public class UserValidationTest {
	@Test
	public void testCase1()
	{
		UserValidationTest uv=new UserValidationTest();
		Assert.assertEquals(false,uv.check("",""));
	}
	@Test
	public void testCase2()
	{
		UserValidationTest uv=new UserValidationTest();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
	@Test
	public void testCase3()
	{
		UserValidationTest uv=new UserValidationTest();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}
	@Test
	public void testCase5()
	{
		UserValidationTest uv=new UserValidationTest();
		Assert.assertEquals(true,uv.check("srinu", "srinu212345"));
	}

}
