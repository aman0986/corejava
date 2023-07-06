package abstract1;

public class TestShape {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle("Rectangle", 4,5);
		rect.display();
		Circle c = new Circle("c", 3);
		c.display(); 
}

}
