class Details {

   private String name;
   private String id;
   private String address;
   private double cgpa;

   public Details(String name, String id, String address, double cgpa) {
       this.name = name;
       this.id = id;
       this.address = address;
       this.cgpa=cgpa;
   }

   public Details() {

   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getID() {
       return id;
   }

   public void setID(String id) {
       this.id = id;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

    public double getCGPA() {
       return cgpa;
   }

   public void setCGPA(double cgpa) {
       this.cgpa = cgpa;
   }
}

public class Students {

   public static void main(String[] args) {

       Details obj = new Details("Abdur Rahim", "2019000010127", "Shymoli Dhaka",3.77);
       String objName = obj.getName();
       String objID = obj.getID();
       String objAddress = obj.getAddress();
       double objCGPA = obj.getCGPA();

       System.out.println("Name : " + objName);
       System.out.println("ID : " + objID);
       System.out.println("Address: " + objAddress);
       System.out.println("CGPA : " + objCGPA);
   }
}