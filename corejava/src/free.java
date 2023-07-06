
public class free {
	public static void main(String[] args) {
		int R = 3;
		int C = 4;
		int[][] array = new int[R][C];
		array[2][2]= 5;
		for(int i =0; i<R; i++) {
			for(int j =0; j<C; j++) {
				System.out.print(array[i][j]+"");
			}
			System.out.println();
		}
	}

}
