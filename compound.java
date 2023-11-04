//The program that asks the user to enter the compound interest annually
public class compound{
    public static int interest(int p,int r,int t){
        int result=p*(1+r)^t;//The formula of the compound interest
        return result;

    }
    public static void main( String[] args){
        compound q1= new compound();//Calling the function name
        double interest= q1.interest(50000,18,3);//Calling the object name
        System.out.println("The compound interest of Mr Bob is:" +" " +interest);//The output
    }
}
