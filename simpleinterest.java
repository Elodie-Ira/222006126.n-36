public class simpleinterest{
    public static double interest(double p,double r,int t){
        double result=(p*r*t)/100;
        return result;

    }
    public static void main(String [] args){
        simpleinterest a2=new simpleinterest();
        double interest = a2.interest(100000,5,5);
        System.out.println("The Interest is:"+" "+ interest);
    }
}