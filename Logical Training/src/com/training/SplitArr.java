package com.training;
import java.util.*;
public class SplitArr {
	public static void main(String[] args) 
	{
        Character []a = {'3' ,'2','*','#','7','8','$','5','$','9'};
        ArrayList<Character> digits = new ArrayList<Character>();
        ArrayList<Character> specials = new ArrayList<Character>();
        for(int i=0;i<a.length;i++)
	        {
				if(Character.isDigit(a[i]))
	            {
	                digits.add((a[i]));
	            }
	            else
	                specials.add(a[i]);
	        }
	        System.out.println("digits : "  + digits);
	        System.out.println("specials : " + specials);
	            }
	}