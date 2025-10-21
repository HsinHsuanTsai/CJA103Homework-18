package hw1;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 + num2 > num3 &&  num1 + num3 > num2 && num3 + num2 > num1) {
			if( num1 == num2 && num1 == num3 ) {
				System.out.println("正三角形");
			}else if(num1 == num2 || num1 == num3){
				System.out.println("等腰三角形");
			}else{
				System.out.println("其它三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		
		System.out.println("=======================================================");
		
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
		Scanner sc1 = new Scanner(System.in);
        int r = (int) (Math.random()*10);

        System.out.println("開始猜數字");
        int p = 10;
        while (r != p){
            p = sc1.nextInt();
            if(r == p){
                System.out.println("答對了 答案是" + r);
            }else {
                System.out.println("猜錯囉");
            }
        }
		
        System.out.println("=======================================================");
        
	//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討 
	//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇 
	//的號碼與總數
        Scanner sc2 =new Scanner(System.in);
        System.out.println("請輸入討厭的數字");
        int a = sc2.nextInt();
        int count = 0;

        if(a >= 1 && a <= 9){
            for(int b = 1; b <= 49; b++){
                int bone = b % 10;
                int bten = b / 10;
                if(bone != a && bten != a){
                    System.out.print(b + " ");
                    count++;
                }
            }
            System.out.println("共" + count + "個");
        }else{
            System.out.println("輸入錯誤");
        }

		
	}



}
