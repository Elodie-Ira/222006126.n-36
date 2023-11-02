public class Interest {
        public static double compound(double p, double r, double t, double n){
            double result=p*Math.pow(1+(r/n),n*t);
            return result;
        }
        public static void main(String[] args){
            Interest f1=new Interest();
            double compound=f1.compound(500000,0.18,3,12);
            System.out.println("The compound interest of Mr Bob is"+" " +compound); 
        }
    }

    
