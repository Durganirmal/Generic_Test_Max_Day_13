package com.Generic_max;

public class Maximum {
<<<<<<< HEAD
	public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c =6;
        Float x =3.4f, y = 4.5f, z = 6.7f;
        String l="apple",m="banana",n="orange";

        Maximum.getMaximum(a, b, c);
        Maximum.getMaximum(x, y, z);
        Maximum.getMaximum(l, m, n);

    }
    private static<T extends Comparable> void getMaximum(T a, T b, T c ){
        T max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum::"+max); max = a;

    }

}
=======
	
		  public static Float getmaximum(Float a,Float b,Float c)
		    {
		        Float max=a;
		        if(b.compareTo(max) > 0 && b.compareTo(c) > 0)
		            max=b;
		        else if(c.compareTo(max) > 0)
		            max=c;


		        //System.out.println(max);
		        return max;
		    }

		}
	  
>>>>>>> Refactor_1
