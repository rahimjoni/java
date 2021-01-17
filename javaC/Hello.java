class Rectangle{
    int length;
    int width;
    int area;
}

public class Hello{

     public static void main(String []args){
         Rectangle obj = new Rectangle();
         obj.length=34;
         obj.width=67;
         obj.area=obj.length*obj.width;
        System.out.println(obj.area);
     }
}