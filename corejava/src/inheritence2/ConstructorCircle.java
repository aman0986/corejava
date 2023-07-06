package inheritence2;

public class ConstructorCircle extends ConstructorShape {
	public ConstructorCircle() {
	}
	public static final double PI = 3.14;
	
		
		int radius = 0;
		public ConstructorCircle(int radius) {
			this.radius = radius;
			
		}
		public void satRadius(int radius) {
			this.radius = radius;
		}
		public int  getRadius() {
			return radius;
			
		}
		public void area() {
			double carea = PI*getRadius()*getRadius();
			System.out.println("radius circle ="+ carea);
		}
	}


