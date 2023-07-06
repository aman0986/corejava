package inheritence;

public class Shape {
	private String color; 
	private int borderwidth = 0;
	
    public String getColor() { 
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) { 
		this.borderwidth = borderwidth;
	}
public void area() {
 String s = getColor();
 int i =getBorderwidth();
 System.out.println("Shap area color="+s);
System.out.println("Shap area color="+i);	
} 
}