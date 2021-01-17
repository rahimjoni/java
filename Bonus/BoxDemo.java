class Location{

   private int x,y,z;
   private String name,id;
   static int objNumber;

    public Location(int number){
        x=number;
        y=number;
        z=number;
    }

    public Location(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
   public String getCoords(){
        String coords = "(x,y,z):("+x+","+y+","+z+")";
        return coords;
   }
   public void updateCoords(int a,int b,int c){
        x=x+a;
        y=y+b;
        z=z+c;
   }
   public void updateCoords(){
        x=0;
        y=0;
        z=0;
   }

}

public class BoxDemo
{
	public static void main(String[] args) {
		Location location = new Location(5);
		Location l = new Location(0,0,9);
		location.updateCoords(0,0,9);
		location.updateCoords();
		System.out.println(location.getCoords());
		System.out.println(l.getCoords());
	}
}