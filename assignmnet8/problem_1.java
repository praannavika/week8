package com.sapient.week_8.assignmnet8;

public class problem_1 implements problem1interface {

	//@Override
	public boolean checkprime(int x) {
		// TODO Auto-generated method stub
		 boolean flag = false;
	        for(int i = 2; i <= x/2; i++)
	        {
	                       if(x % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            return true;
	        else
		return false;
	}

	//@Override
	public boolean checkarmstrong(int x) {
		// TODO Auto-generated method stub
		int  number, temp, total = 0;

        number = x;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == x)
            return true;
        else
		return false;
	}

	//@Override
	public boolean checkpalindrome(int x) {
		// TODO Auto-generated method stub
		int  ri = 0, rm, oi;

        oi=x;
        while( x != 0 )
        {
            rm = x % 10;
            ri= ri * 10 + rm;
            x /= 10;
        }

       
        if (oi == ri)
           return true;
        else
		return false;
	}

}
