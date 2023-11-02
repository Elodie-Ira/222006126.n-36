public class compound{
    public static int interest(int p,int r,int t){
        int result=p*(1+r)^t;
        return result;

    }
    public static void main( String[] args){
        compound q1= new compound();
        double interest= q1.interest(50000,18,3);
        System.out.println("The compound interest of Mr Bob is:" +" " +interest);
    }
}