 //The java program that implements beside graph
 public class  inheritance{ //class name
    public static void main(String args[]) {
        Aisha myobj=new Aisha();//creation of an object
        myobj.show();
        myobj.display();
        myobj.calculate();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class Dina {//class name
    int a=15;//first initialisation
    int b=25;//second initialisation
    
    public void add(){
        int result=a+b;
        System.out.println(result);//the output message

    }
}
class Celine extends Dina{//class name extends another class name
    public static void display(){
        System.out.println("this class is Bea");//the output message
    }
}
class Bea extends Celine{//class name extends another class name
    public static void calculate(){
        int c=10;//initialistion
        int d=55;//initialistion
        int result=d-c;
        System.out.println(result);//the output message
    }
}

    interface Eva {//interface name
   void interfacetest();
} 

class Aisha extends Bea implements Eva{//class name extends another class name  and also implements interface name 
    public  void show() {
        System.out.println(a+b);//the output message
        
    }
    
    public void interfacetest(){
    
    System.out.println("VERY GOOD");//the output message
}
}
