//The program that asks the user to calculate simple interest
public class simpleinterest{//The class name
    public static double interest(double p,double r,int t){
        double result=(p*r*t)/100;//Formula 
        return result;

    }
    public static void main(String [] args){
        simpleinterest a2=new simpleinterest();//Calling the function name
        double interest = a2.interest(100000,5,5);// Calling the object name
        System.out.println("The Interest is:"+" "+ interest);//The output
    }
}
