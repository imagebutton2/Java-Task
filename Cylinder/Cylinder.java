package Day1;

interface IA{
	final double PI=3.14;
	double area();
}

interface IB{
	void setColor(String c);
}

interface IC extends IA,IB{
	void volume();
}

public class Cylinder implements IC{
	 private double radius;
	 private double height;
	 private String color; 
	 Cylinder(double radius,double height,String color){
		 this.radius=radius;
		 this.height=height;
		 setColor(color);		 
	 }
	public static void main(String[] args) {
		Cylinder a=new Cylinder(1, 1, "blue");
		System.out.println(a.area());
		a.volume();
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius*2+2*PI*radius*height;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color=color;
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("volume is "+(PI*radius*radius*height));
	} 

}
