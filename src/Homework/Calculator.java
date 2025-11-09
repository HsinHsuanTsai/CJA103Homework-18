package Homework;

public class Calculator {
	
	//在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
	
	public int powerXY(int x, int y) throws CalException{
		
		//1. x與y同時為0，(產生自訂的CalException例外物件)
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		
		//2. y為負值，而導致x的y次方結果不為整數
		if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		}
		
		//x與y皆正確情況下，會顯示運算後結果
		int result;
	    result = (int)Math.pow(x, y);
		return result;
	}
	
}
