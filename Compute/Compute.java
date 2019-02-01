package Day1;


interface ICompute{

	int computer(int n, int m);
}
class Add implements ICompute{

	@Override
	public int computer(int n, int m) {
		// TODO Auto-generated method stub
		return n+m;
	}
	
}

class Sub implements ICompute{

	@Override
	public int computer(int n, int m) {
		// TODO Auto-generated method stub
		return n-m;
	}
	
}
class Mul implements ICompute{

	@Override
	public int computer(int n, int m) {
		// TODO Auto-generated method stub
		return n*m;
	}
	
}
class Div implements ICompute{

	@Override
	public int computer(int n, int m) {
		// TODO Auto-generated method stub
	if(m==0) {
		System.out.println("除0错误");
		return 0;
	}
		return n/m;
	}
	
}
class UseCompute{
    public void useCom(ICompute com, int n, int m){
        System.out.println(com.computer(n,m));
    }
}

public class Compute {
	
	
	
	public static void main(String[] args) {
		  UseCompute uc=new UseCompute();       
		  Add a1=new Add();       
		  Sub a2=new Sub();       
		  Mul a3=new Mul();       
		  Div a4=new Div();       
		  System.out.println("加法:");uc.useCom(a1,2,3);       
		  System.out.println("减法:");uc.useCom(a2,2,3);       
		  System.out.println("乘法:");uc.useCom(a3,1,2);      
		  System.out.println("除法:");uc.useCom(a4,1,1);

		
	}
}
