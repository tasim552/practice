/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practice;
import java.util.Scanner;
 
public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String name,address,InputName;
        int x = 0;
        
        System.out.println("Option 1: Enter the nnumber:");
        num = input.nextInt(); 
        input.nextLine(); 
        
        System.out.println("Option 2: Enter the  name:");
        name = input.nextLine();  
        
        
        System.out.println("Option 3&&4 :Enter the address:");
        address = input.nextLine();
         
        System.out.println("Number = " + num);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
          
          
         System.out.println("  Choose option/number :");
         x = input.nextInt(); 
         input.nextLine();
         
         System.out.println("  Write your name:");
         InputName = input.nextLine(); 
         
        if(x==1){
            
            System.out.println("Number = \n" + num);
        }
        
        else if(x==2){
            
             System.out.println("Name = \n" + name);
        }
       
        
      else  if(x==17 && InputName.equals("saharia")){
            
           System.out.println("Contuct Number = \n" + x);
           System.out.println("Name =" + name);
        
            
        }
       else  if(x==3|| x==4){
             
               System.out.println("Address = \n" + address);
          
         }
        
        else{
            
             System.out.println(" Your Choose option not match:");
        } 
        
        
        
    }
}
