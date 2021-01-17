class Employee{
    String name;
    double salary;
    //using method
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    Employee(){

    }
    //method overloaded
    void printInfo(){
        System.out.println(name+" "+salary);
    }
    void printInfo(String msg){
        System.out.println(msg);
    }
}
class Engineer extends Employee{
    String engType;
    Engineer(String name, double salary, String engType){
        super(name,salary);
        this.engType=engType;
    }
    Engineer(){

    }
}

public class Tester
{
	public static void main(String[] args) {
	    Employee obj = new Employee();
	    obj.name="from employee";
	    obj.salary=500;
		System.out.println(obj.name+" "+obj.salary);

		Engineer obj1 = new Engineer();
		obj1.name="From Engineer";
		obj1.salary=700;
		obj1.engType="Junior";
		System.out.println(obj1.name+" "+obj1.salary+" "+obj1.engType);

        //Employee method overloaded
        Employee obj2 = new Employee("From Method super",600);
        System.out.println(obj2.name+" "+obj2.salary);

        //Engineer method overloaded
        Engineer obj3 = new Engineer("From Method Sub",600,"data");
        System.out.println(obj3.name+" "+obj3.salary+" "+obj3.engType);

        // Method overloaded
	    Employee obj4 = new Employee();
	    obj4.printInfo();
	    obj4.printInfo("Message");

	}
}