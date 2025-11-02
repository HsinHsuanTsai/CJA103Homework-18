package Homework;

public class homework5 {
//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

//	 public static void starSquare(int width, int height){
//	       for(int i = 0; i < height; i++){
//	           for(int j = 0; j < width; j++){
//	               System.out.print("*");
//	           }
//	           System.out.println();
//	       }
//	   }
//
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("請輸入寬度");
//	        int width = sc.nextInt();
//	        System.out.println("請輸入高度");
//	        int height = sc.nextInt();
//
//	        starSquare(width, height);
//	    }

//	請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	    
//	    public static void randAvg(){
//
//	        System.out.print("本次亂數結果: ");
//
//	        int sum = 0;
//	        for(int i = 0; i < 10; i++) {
//	            int num = (int) (Math.random() * 101);
//	            System.out.print(num + " ");
//	            sum += num;
//	        }
//	        double ave = (double) sum / 10;
//	         System.out.println("平均值：" + ave);
//	     }
//
//	     public static void main(String[] args) {
//	         randAvg();
//	     }
	
//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳
	
	     public static int maxElement(int x[][]){
	         int max = x [0][0];
	         for(int i = 0; i < x.length; i++){
	             for(int j = 0; j < x[i].length; j++) {
	                 if (x[i][j] > max) {
	                     max = x[i][j];
	                 }
	             }
	         }
	         return max;
	     }

	     public static double maxElement(double x[][]){
	         double max = x [0][0];
	         for(int a = 0; a < x.length; a++){
	             for(int b = 0; b < x[a].length; b++) {
	                 if (x[a][b] > max) {
	                     max = x[a][b];
	                 }
	             }
	         }
	         return max;
	     }

	     public static void main(String[] args) {
	         int [][] intArray = {
	                 {10, 35, 40},
	                 {37, 75, 77}
	         };

	         double [][] doubleArray = {
	                 {10.6, 35.8, 40.9},
	                 {37.8, 75.5, 77.2}
	         };
	         System.out.println("intArray最大值：" + maxElement(intArray));
	         System.out.println("doubleArray最大值：" + maxElement(doubleArray));
	     }
	     
//	     身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法 
//	     genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	     與數字的亂數組合
	     public static String genAuthCode(){
	         
	     }
	
	
}
