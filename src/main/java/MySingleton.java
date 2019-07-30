package com.singleton;
import java.util.Scanner;
public  class MySingleton {
  private static MySingleton myObj; 
   private  MySingleton(){
     
    }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only integer value(>0) ");
        final int input= sc.nextInt(); 
        int result=nthprime(input);
        System.out.println(result);
        sc.close();
        }
	 static int nthprime(int input) {
	        int output, count,divisor;
	        output=1;
	        count=0;
	        //count is to count the  prime numbers identified
	        while (count < input){
	          output=output+1;
	          for ( divisor = 2; divisor<= output; divisor++){ //Here we will loop from 2 to num
	            if (output % divisor == 0) {
	              break;
	            }
	          }
	          if ( divisor == output){//if it is a prime number
	            count = count+1;
	          }
	        }
	        return output;
	
	 }
    }