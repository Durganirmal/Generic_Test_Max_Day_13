package com.Generic_max;

public class Maximum{
	 public static void main(String[] args) {
	        System.out.println("Welcome to Generic Program.");
	        Integer a = 2, b = 4, c =6;
	        Float x =3.4f, y = 4.5f, z = 6.7f;
	        FindMaximum (a,b,c);

	        FindMaximumF(x, y, z);
	    }

	    public static void FindMaximumF(Float a, Float b, Float c) {
	        Float max = a;
	        if(b.compareTo(a)>0){
	            max = b;
	        }
	        if(c.compareTo(max)>0){
	            max = c;
	        }
	        System.out.println("Float Maximum Number is::"+max);

	    }
	    private static void FindMaximum(Integer a, Integer b, Integer c) {
	        Integer max = a;
	        if(b.compareTo(a)>0){
	            max = b;
	        }
	        if(c.compareTo(max)>0){
	            max = c;
	        }
	        System.out.println("Integer Maximum Number is::"+max);
	    }
	}