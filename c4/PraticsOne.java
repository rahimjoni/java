class Test{
    int sum;
    public int y;
    public void methodA(){
        int x=0, y=0;
        y = this.y - 9;
        x = this.y + 10;
        sum = x + y;
        System.out.println(x + " " + y+ " " + sum);

        }
        public void methodB(){
        int x = 0;
        y = y - 11;
        x = x + 45 + y;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
        }
        }

 public class PraticsOne{
    public static void main(String[] args) {
    	Test obj = new Test();
    	obj.methodA();
    	obj.methodB();
    	}
    	}