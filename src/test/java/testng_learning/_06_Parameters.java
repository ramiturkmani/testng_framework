package testng_learning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestData;

public class _06_Parameters {

    /*
    @Test
    public void login1(){
        System.out.println("Username comes from properties = " + ConfigReader.getProperty("username"));
        System.out.println("Password comes from properties = " + ConfigReader.getProperty("password"));
    }

    @Parameters({"username", "password"})
    @Test
    public void login2(String username, String password){
        System.out.println("Username comes from xml = " + username);
        System.out.println("Password comes from xml = " + password);
    }

    @Test
    public void login3(){
        System.out.println("Username comes from TestData = " + TestData.username);
        System.out.println("Password comes from TestData = " + TestData.password);
    }
     */
}
