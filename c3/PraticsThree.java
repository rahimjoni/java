class Student{
    int l;
    int h;
    int w;

    Student(int l, int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Student(){

    }
    void printInfo(){
        System.out.println("l: "+l+",h: "+h+",w: "+w);

    }
}

public class PraticsThree
{
	public static void main(String[] args) {
	    Student obj = new Student(2,20,50);
	    obj.printInfo();
	}
}
