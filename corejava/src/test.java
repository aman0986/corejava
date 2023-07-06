
public class test {
	
	public static void main(String[]args ) {
		int amount = 8985;
		int a =0;
	    int b =0;
	    int c =0;
	    int e =0;
	    int f =0;
	    int g = 0;
	    int h = 0;
	    while(amount>=2000) {
	    	a = amount/2000;
	    	amount = amount%2000;
	    	System.out.println("total no 2000 R=" +a);
	    	break;
	    	
	    }
	    while(amount>= 500) {
	    	b= amount/500;
	    	amount= amount%500;
	    	System.out.println("total no 500 R=" +b);
	    	break;
	    }
	    while(amount>= 100) {
	    	c= amount/100;
	    	amount = amount%100;
	    	System.out.println("total no 100 R="+c);
	    	break;
	    }
	    while(amount>= 50) {
	    	e = amount/50;
	    	amount =amount%50;
	    	System.out.println("total no 50 R=" +e);
	    	break;
	    }
	    while(amount>= 20) {
	    	f = amount/20;
	    	amount =amount%20;
	    	System.out.println("total no 20 R=" +f);
	    	break;
		
	}
	    while(amount>= 10) {
	    	g = amount/10;
	    	amount =amount%10;
	    	System.out.println("total no 10 R=" +g);
	    	break;
	    }	
	    while(amount>= 5) {
	    	h = amount/5;
	    	amount =amount%5;
	    	System.out.println("total no 5 R=" +h);
	    	break;
	    }		
	
	}
	}
