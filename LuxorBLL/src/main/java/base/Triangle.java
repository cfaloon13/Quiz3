package base;

public abstract class Triangle extends GeometricObject {

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle(){		
	}
	
	public Triangle(double side1, double side2, double side3){
	}
	
	public double setSide1(){
		this.side1 = side1;
		return side1;
	}
	
	public double setSide2(){
		this.side2 = side2;
		return side2;
	}
	
	public double setSide3(){
		this.side3 = side3;
		return side3;
	}
	
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public double getArea(){
		double s = getPerimeter()/2;
		double n = s*(s-side1)*(s-side2)*(s-side3);
		double area = Math.pow(n, .5);
		return area;
	}
	
}