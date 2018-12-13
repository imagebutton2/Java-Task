package Test;

import java.util.Scanner;

class Fibonacci{
    private int i;
    private int [] data=null;

    public void fibonacci(int i){
    	this.i=i;
    	if(i>0) {
    	data=new int[i];
    	int t;
        if(i<=1){
        	data[0]=1;
        	}
        else if(i<=2){
        	data[0]=1;
        	data[1]=1;
        	}
        else {   
        	data[0]=1;
        	data[1]=1;
    		t=data[0]+data[1];
        	for(int j=2;j<i;j++) {
        		
        		data[j]=t;
        		t=0;
        		t=data[j-1]+data[j];//前一项+本身=后一项
        		
        		}
        	}
        for(int j=0;j<i;j++) {
    		System.out.println(data[j]);
    	}

        }
    	
    }
   
    public static void main(String[] args)
    {
    	
    	Scanner input =new Scanner(System.in);
    	Fibonacci fibonacci= new Fibonacci();
    	fibonacci.fibonacci(input.nextInt());


    }
 
}