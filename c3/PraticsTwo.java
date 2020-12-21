//Question: Create a Student class with the following class variables - name and ID.
//It should have a constructor that can initialize the class variables from parameters passed.
//The class should also have a method, printInfo that can print the name and ID of a student.
//Finally, create a main method. There, create a student object with your name and ID and invoke the printInfo method.

class Student{
    String name;
    String id;

    void setVal(String name1, String id1){
        name = name1;
        id = id1;

    }
    void printInfo(){
        System.out.println(name);
        System.out.println(id);

    }
}

public class PraticsTwo
{
	public static void main(String[] args) {
	    Student obj = new Student();
	    obj.setVal("JOni","20190000010127");
	    obj.printInfo();
	}
}
