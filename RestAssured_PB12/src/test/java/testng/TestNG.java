package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {
  @Test(dataProvider = "dp")
  
  public void test1(Integer n,String  S )
  {
	  System.out.println(n+""+S);
  }
  public void f(Integer n, String s) {
	  System.out.println(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeMethod");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeMethod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" @AfterTest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
