package testng_learning;

import org.testng.annotations.Test;
import utilities.Waiter;

public class _07A_Parallel {

    @Test(priority = 1)
    public void testA1(){
        Waiter.pause(10);
        System.out.println("This is test A1");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void testA2(){
        Waiter.pause(15);
        System.out.println("This is test A2");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void testA3(){
        Waiter.pause(20);
        System.out.println("This is test A3");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }
}
