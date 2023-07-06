package Contructor;
public class B extends A{
	private int a = 0;
	private int b = 0; 
	public B(int i) {
		
	}
	public B(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public B(int a,int b,String color,int borderb) {
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a = a;
	}public void setB(int b) {
		this.b = b;
	}
	public void area() {
		int area = getA()* getA();
		System.out.println("b area="+area);
	}
	
	}


