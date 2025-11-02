package Homework;

public class MyRectangleMain extends MyRectangle{
//	• 請另外建立一個MyRectangleMain類別，此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
		MyRectangle rect = new MyRectangle();
		rect.setWidth (10);
		rect.setDepth (20);
		
		System.out.println("width: " + rect.getWidth());
		System.out.println("depth: " + rect.getDepth());
		System.out.println("面積" + rect.getArea());
		
		
		MyRectangle rect1 = new MyRectangle(10, 20);
		
		System.out.println("width: " + rect1.getWidth());
		System.out.println("depth: " + rect1.getDepth());	
		System.out.println("面積" + rect1.getArea());
		
		
	}
}
