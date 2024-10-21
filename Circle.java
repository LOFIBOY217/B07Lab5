package lab4;

public class Circle {
	Point x;
	Double r;

	public Circle(Point x, Double r){
		this.x = x;
		this.r = r;
	}

	public double perimeter(){
		return 2 * Math.PI * r;
	}

	public double area(){
		return Math.PI * r * r;
	}

	public boolean isCircle(){
		return r > 0;
	}
}