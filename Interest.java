//This program asks the user to calculate  the compound interest using objects and methods  
public class Interest {//class name
        public static double compound(double p, double r, double t, double n){
            double result=p*Math.pow(1+(r/n),n*t);//Formula of calculating the compound interest
            return result;
        }
        public static void main(String[] args){
            Interest f1=new Interest();
            double compound=f1.compound(500000,0.18,3,12);//Calling the object name
            System.out.println("The compound interest of Mr Bob is"+" " +compound);//The output of compound interest 
        }
    }

    
