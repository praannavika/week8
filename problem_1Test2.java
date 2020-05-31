package com.sapient.week_8.assignmnet8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class problem_1Test2 {

	@Test
	void testchechprimeforprime() {
	problem1interface ob=new problem_1();
	 //Scanner in = new Scanner(System.in);
      // System.out.println("Input any number");
      // int n = Integer.parseInt(in.nextLine().trim());
       boolean result=ob.checkprime(2);
       assertNotNull(result);
       assertEquals(true, result);
	}
	@Test
	void testchechprimefornotprime() {
	problem1interface ob=new problem_1();
	 //Scanner in = new Scanner(System.in);
      // System.out.println("Input any number");
      // int n = Integer.parseInt(in.nextLine().trim());
       boolean result=ob.checkprime(3);
       assertNotNull(result);
       assertEquals(false, result);
	}
	@Test
	void testchecharmstrongforarmstrong() {
		problem1interface ob1=new problem_1();
		boolean r=ob1.checkarmstrong(370);
		assertEquals(true, r);}
	@Test
	void testchecharmstrongfornotarmstrong() {
		problem1interface ob1=new problem_1();
		boolean r=ob1.checkarmstrong(12);
		assertEquals(false, r);}
	
	
	@Test
	void testpalindromeforpalindrome() {
		problem1interface ob1=new problem_1();
		boolean r=ob1.checkpalindrome(12);
		assertEquals(false, r);}
		@Test
		void testpalindromefornotpalindrome() {
			problem1interface ob1=new problem_1();
			boolean r=ob1.checkpalindrome(11233211);
			assertEquals(true, r);
	}
	
	
	

}
