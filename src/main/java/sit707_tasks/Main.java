package sit707_tasks;

import java.util.Random;

/**

 * @author Gayani Abewickrama
 */
public class Main 
{
    public static void main( String[] args )
    {   
        /*
         * Testing January max boundary area: max-1, max+1
         */
        System.out.println("Testing January max: Incrementing should move to February.");
        DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("Initial date: " + date);
        date.increment();
        System.out.println("After increment: " + date);
        
        System.out.println("Testing January max: Decrementing should result in 30 January.");
        date = new DateUtil(31, 1, 2024);
        System.out.println("Initial date: " + date);
        date.decrement();
        System.out.println("After decrement: " + date);
        
        /*
         * Testing January nominal (somewhere between min and max)
         */
        System.out.println("Testing random day in January: Incrementing should move to the next day.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("Initial date: " + date);
        date.increment();
        System.out.println("After increment: " + date);
        
        /*
         * Testing January min boundary area: min+1, min-1
         */
        System.out.println("Testing January min: Incrementing should result in 2 January.");
        date = new DateUtil(1, 1, 2024);
        System.out.println("Initial date: " + date);
        date.increment();
        System.out.println("After increment: " + date);
        
        System.out.println("Testing January min: Decrementing should result in 31 December of the previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println("Initial date: " + date);
        date.decrement();
        System.out.println("After decrement: " + date);        
    }
}
