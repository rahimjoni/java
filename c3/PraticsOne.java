class Box{
    int l,h,w;
    void setDim(int n1, int n2, int n3){
        l = n1;
        h = n2;
        w = n3;
    }
    void printDim(){
        System.out.println(l*h*w);
    }
    int getVol(){
        return l*h*w;
    }
}

public class PraticsOne
{
	public static void main(String[] args) {
	    Box obj = new Box();
	    obj.setDim(10,20,5);
		System.out.println(obj.l);
		System.out.println(obj.h);
		System.out.println(obj.w);
		obj.printDim();
		System.out.println(obj.getVol()+2);
	}
}
