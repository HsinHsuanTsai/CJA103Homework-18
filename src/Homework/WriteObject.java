package Homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) {
		try {
			File dir = new File("C:\\data");
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			
			
			File file = new File("C:\\data\\Object.ser");
			Speak[] animal = new Speak[4];
			animal[0] = new Dog("Kitty");
			animal[1] = new Dog("Black Kitty");
			animal[2] = new Cat("Luka");
			animal[3] = new Cat("Black Luka");
			
	        FileOutputStream fos = new FileOutputStream(file);
	 		ObjectOutputStream oos = new ObjectOutputStream(fos);
	 		
	 		for (int i = 0; i < animal.length; i++)
				oos.writeObject(animal[i]);
	 		
	 		oos.close();
			fos.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
