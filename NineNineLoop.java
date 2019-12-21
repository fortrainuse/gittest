package ch05;





/*
 * 巢狀迴圈應用，寫九九乘法表傳
 */
public class NineNineLoop {
	public static void print99() {
		
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println("================");
		}
	}

	public static void main(String[] args) {
		print99();
	}

}


