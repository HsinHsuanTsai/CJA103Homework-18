package Homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFile {
//	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	
	public void copyFile(String source, String destination) throws IOException{
		try {
			FileReader in = new FileReader(source);
			FileWriter out = new FileWriter(destination);
			int c;
			
			while ((c = in.read()) != -1) { 
				out.write(c);
				System.out.print((char) c);
				System.out.flush();

				}
			in.close();
			out.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
