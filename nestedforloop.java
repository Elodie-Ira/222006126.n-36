//The program that asks the user to display the numbers from 1 up to 5 using the nested for loop
public class nestedforloop {//class name
     public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){//initial and final initialization for the rows 
            for(int j=1; j<=i; j++){//initial and final initialization for the columns
                System.out.print (i);//the ouput
            } 
            System.out.println(); //The space that comes between the numbers          
        }
     }
}
