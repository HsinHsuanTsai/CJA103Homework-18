package hw1;

public class homework2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for(int a = 1; a <= 1000; a++) {
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println("1～1000的偶數和: " + sum);
		System.out.println("==============================================");
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for(int b = 1; b <= 10; b++) {
			sum2 *= b;
		}
		System.out.println("1～10的連乘積: " + sum2);
		System.out.println("==============================================");
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈) 
		
		int c = 1;
		int sum3 = 1;
		while ( c <= 10 ) {
			sum3 *= c;
			c++;
		}
		System.out.println("1～10的連乘積: " + sum3);
		System.out.println("==============================================");
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		
		for(int d = 1; d <= 10; d++) {
			System.out.print((int)Math.pow(d, 2) + " ");
		}
		System.out.println();
		System.out.println("==============================================");
		
//		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？ 
		
		int count = 0;
		for(int e = 1; e <= 49; e++) {
			int eTen = e / 10;
			int eOne = e % 10;
			if (eOne != 4 && eTen != 4) {
				System.out.print(e + " ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("總共" + count + "個");
		System.out.println("==============================================");
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10 
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		
		for (int j = 10; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC 
//		DDDD 
//		EEEEE 
//		FFFFFF
		
		for(char l1 = 'A'; l1 <= 'F'; l1++) {
			for (int l2 = 1; l2 <= (l1 - 'A' + 1 ); l2++ ) {
				System.out.print(l1);
			}
			System.out.println();
		}
		
	}
	

}
