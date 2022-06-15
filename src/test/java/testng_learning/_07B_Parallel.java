package testng_learning;

import org.testng.annotations.Test;
import utilities.Waiter;

public class _07B_Parallel {

    @Test(priority = 1)
    public void testB1(){
        Waiter.pause(10);
        System.out.println("This is test B1");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void testB2(){
        Waiter.pause(15);
        System.out.println("This is test B2");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void testB3(){
        Waiter.pause(20);
        System.out.println("This is test B3");
        System.out.println("Thread id = " + Thread.currentThread().getId());
    }
}
