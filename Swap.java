package com.thursdaylab;

public class SwapNumber {
         public static void main(String [] args) {
        	 int x=50 , y=60;
        	 System.out.println("before swap"+x+","+y);
             x=x+y;
             y=x-y;
             x=x-y;
        	 System.out.println("after swap"+x+","+y);

         }
}
