
public class Smaller1 {

	public static void main(String[] args) {
	if(args.length < 2) {
		System.out.println();
		return;
		
	}
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int smaller = (num1<num2)? num1:num2;
	System.out.println("The smaller of"+num1+"and"+ num2+"is"+smaller);
	

	}

}
