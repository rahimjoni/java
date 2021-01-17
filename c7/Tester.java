class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    Employee(){

    }
}

class Engineer extends Employee{
    String position;
    //Engineer(String name, double salary, String position){
        //super.name=name;
        //super.salary=salary;
        //this.position=position;
    //}
    Engineer(String name, double salary, String position){
            super(name,salary);
            this.position=position;
        }
    Engineer(){

    }
}
class Secratary extends Employee{
    String title;
}
public class Tester
{
	public static void main(String[] args) {
	    Employee obj = new Employee();
	    obj.name ="Joni";
	    obj.salary = 500;
		System.out.println(obj.name +" "+ obj.salary);

		Engineer obj1 = new Engineer();
		obj1.name="Rahim";
		obj1.salary=8900;
		obj1.position="CSE";
		System.out.println(obj1.name +" "+ obj1.salary+" "+obj1.position);

		Employee obj2 = new Employee("Testing",5500);
		System.out.println(obj2.name +" "+ obj2.salary);

		Engineer obj3 = new Engineer("last",8537,"Mech");
        System.out.println(obj3.name +" "+ obj3.salary+" "+ obj3.position);
	}
}