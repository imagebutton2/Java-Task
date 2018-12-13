package Test;

import java.util.Scanner;

public class HelloConstructor {
	
	HelloConstructor(){
		System.out.println("Hello Constructor");
	}
	
	HelloConstructor(String str){
		System.out.println("Hello Constructor"+" "+str);
	}
	 
	public static void main(String[] args)
	    {
	    	
	    	Scanner input =new Scanner(System.in);
	    	HelloConstructor helloconstructor1=new HelloConstructor();
	    	HelloConstructor helloconstructor2=new HelloConstructor("welcome to you ");
	    }
}
