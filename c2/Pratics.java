//Write a class called Rectangle. Declare two integer variables there - length and width.
//Create a main method. In the main method create an object of Rectangle class.
//Then assign the values 5 and 10 to the length  and width variables respectively.
//Then calculate the area of that Rectangle using the assigned variables and print the value.

class Rectangle{
    int length,width,area;
}

public class Pratics
{
	public static void main(String[] args) {
	    Rectangle obj = new Rectangle();
	    obj.length = 5;
	    obj.width = 10;
	    obj.area = obj.length*obj.width;
		System.out.println(obj.area);
	}
}