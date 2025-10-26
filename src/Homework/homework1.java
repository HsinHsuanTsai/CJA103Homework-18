package Homework;

public class homework1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println("======================================");
		
//		2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int c = 200 / 12;
		int d = 200 % 12;
		System.out.println(c + "打" + d +"顆");
		System.out.println("======================================");
		
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec = 256559;
		int day = sec / (60 * 60 * 24);
		int hour = (sec % (60 * 60 * 24)) / (60 * 60);
		int min = (sec % (60 * 60)) / 60;
		int sec2 = sec % 60;
		
		System.out.println(day + "天" + hour + "小時" + min + "分" + sec2 +"秒");
		System.out.println("======================================");
		
//		4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double e = 3.1415;
		double r = 5;
		
		double area = r * r * e;
		double cirf = r * 2 * e;
				
		
		System.out.printf("圓面積: %.2f%n", area);
		System.out.printf("圓周長: %.2f%n", cirf);
		System.out.println("======================================");
		
		
//		5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
//		FV=PV(1+i)^n
//		FV（Future Value）是指財富在未來的價值；PV（Present Value）是指現值，亦即指本金；i（interest）是指週期內的固定利率或固定回報率，n則是累計的週期。
		//次方運算: Math.pow(height, 2)
		
		int p = 1500000 ;
		double rate = 0.02;
		int n = 10;
		
		double FV = p * Math.pow(( 1 + rate), n);
		
		System.out.printf("10年後本金加利息: %,.1f元 %n", FV);
		// %, java自動用,分格，千位1個
		System.out.println("======================================");
		
//		6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);  //兩項皆為數值, 數值相加為10
		System.out.println(5 +'5'); //5為數值,'5'為char轉換成數值, '5'對照ASCII是53, 故結果為58
		System.out.println(5 + "5"); //5為數值, "5"為字串符, 運算式中有string會作連接字句, 結果為55

	}
	

}
