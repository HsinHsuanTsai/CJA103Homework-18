package Homework;

import java.io.FileWriter;
import java.io.IOException;


public class homework7 {
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息： 
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

	public static void main(String[] args) {
//		int byteCount = 0;
//		int lineCount = 0;
//		int charCount = 0;
//		try {
//			File f1 = new File("C:\\Users\\HsinHsuan\\Desktop\\CJA103\\JAVA資料\\homeworks\\Sample.txt");
//			byteCount = (int)f1.length();
//			
//			
//			FileReader fr = new FileReader(f1);
//			BufferedReader br = new BufferedReader(fr);
//			
//			
//			String line; //宣告字串	
//			while ((line = br.readLine()) != null) {
//				lineCount++;
//				charCount += line.length(); // 同時統計字元
//			}
//			
//			fr.close();
//			br.close();
//			
//		}catch(IOException e) {
//			
//		}
//		
//		
//	  System.out.println( byteCount + "個位元組" + charCount + "個字元" + lineCount +"列資料");

		
	
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)
	 try {
         FileWriter fw = new FileWriter("./Data.txt", true);
         
         for(int i = 0; i < 10; i++) {
        	 int num =(int) (Math.random()* 1000) + 1;
        	 fw.write(num + "\n");
        	 }
         		
         		fw.write("======================="+ "\n");
         		
         		fw.close();
         
         }catch(IOException e){
        	 e.printStackTrace();
         }
		 
	}
	
}
