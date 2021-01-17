class Box{
    int id;
    int name;

Box(int a, int b){
    id=a;
    name=b;

} 
    void setDim(int a, int b){
        id=a;
        name=b;
    }
}

public class Main{

     public static void main(String []args){
        Box obj = new Box(2,3);
        System.out.println(obj.id);
     }
}
