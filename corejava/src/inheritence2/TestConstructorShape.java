package inheritence2;

public class TestConstructorShape {
	public static void main(String[] args) {
		ConstructorRectangle r = new ConstructorRectangle(10, 5);
		
		ConstructorCircle c = new ConstructorCircle(5);
		c.area();
	}

}
