package Homework;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try{
			while(true) {
				((Speak) ois.readObject()).speak();
			}
			
		}catch(EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
		ois.close();
		fis.close();
	}
	
	
}
