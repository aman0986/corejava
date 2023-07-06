
public class DImension3 {
	public static void main(String[] args) {
		int R = 3;
		int C = 4;
		int D = 2;
		int[][][] array = new int[R][C][D];
		array[0][2][1]= 10;
		for(int i = 0; i<R; i++) {
			for(int j = 0;j<C; j++) {
				for(int g = 0; g<D; g++) {
					System.out.print(array[i][j][g]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}


}
