package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_Soft_vs_Hard_Assertions {
/*
    @Test(priority = 1, description = "Practicing hard assertions")
    public void method1(){

        //Hard assertions
        //When there is an error at any line, the program flow will break, and it will not continue.
        Assert.assertTrue(true);
        Assert.assertTrue(false, "===Failure===");

        System.out.println("Hello World");
    }

    @Test(priority = 2, description = "Practicing soft assertions")
    public void method2(){
        //Soft assertions

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(true);
        softAssert.assertTrue(false, "===Failure==="); //AssertionError

        System.out.println("Hello World");
        softAssert.assertAll();
    }
    */
}