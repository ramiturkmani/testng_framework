package testng_learning;

import org.testng.annotations.Test;
import utilities.Waiter;

public class _07C_Parallel {

    @Test(priority = 1)
    public void testC1(){
        Waiter.pause(10);
        System.out.println("This is test C1");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void testC2(){
        Waiter.pause(15);
        System.out.println("This is test C2");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void testC3(){
        Waiter.pause(20);
        System.out.println("This is test C3");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }
}
