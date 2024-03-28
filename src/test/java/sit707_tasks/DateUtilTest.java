package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Gayani Abewickrama
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s2233986848";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Gayani Abewickrama";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    DateUtil date = new DateUtil(1, 1, 2024);
	    date.decrement();
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	//tests for rest months of year 2024

	@Test
	public void testFebruary() {
	    // Test February with 28 days
	    DateUtil date = new DateUtil(28, 2, 2024);
	    date.increment();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMarch() {
	    // Test March with 31 days
	    DateUtil date = new DateUtil(31, 3, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testApril() {
	    // Test April with 30 days
	    DateUtil date = new DateUtil(30, 4, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMay() {
	    // Test May with 31 days
	    DateUtil date = new DateUtil(31, 5, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testJune() {
	    // Test June with 30 days
	    DateUtil date = new DateUtil(30, 6, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testJuly() {
	    // Test July with 31 days
	    DateUtil date = new DateUtil(31, 7, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testAugust() {
	    // Test August with 31 days
	    DateUtil date = new DateUtil(31, 8, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testSeptember() {
	    // Test September with 30 days
	    DateUtil date = new DateUtil(30, 9, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testOctober() {
	    // Test October with 31 days
	    DateUtil date = new DateUtil(31, 10, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNovember() {
	    // Test November with 30 days
	    DateUtil date = new DateUtil(30, 11, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testDecember() {
	    // Test December with 31 days
	    DateUtil date = new DateUtil(31, 12, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2025, date.getYear());
	}
	//Test cases for the second table
	@Test
	public void testNextJune1() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextJune2() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.increment();
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextJune15() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextJune30() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	/*@Test
	public void testNextJuneInvalid() {
	    DateUtil date = new DateUtil(31, 6, 1994); // June 31st is an invalid date
	    Assert.assertEquals(null, date.increment()); // Incrementing should return null
	}*/

	@Test
	public void testNextJanuary15() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextFebruary15() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextNovember15() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDecember15() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextJune1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testNextJune1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testNextJune2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testNextJune2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	
	
	
	//Test cases for the leap and non-leap year
	@Test
	public void testFebruaryLeapYear() {
	    // Test February in a leap year with 29 days
	    DateUtil date = new DateUtil(28, 2, 2020);
	    date.increment();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test
	public void testFebruaryNonLeapYear() {
	    // Test February in a non-leap year with 28 days
	    DateUtil date = new DateUtil(28, 2, 2021);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2021, date.getYear());
	}


}
