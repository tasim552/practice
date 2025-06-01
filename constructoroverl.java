
package constructoroverl;

/**
 *
 * @author student_user
 */
public class ConstructorOverl {
 int value;


 ConstructorOverl(){

    System.out.println("Defult contructor");



 }

  ConstructorOverl(int num){

      System.out.println("constructor with value"+num);

  }

   ConstructorOverl(   ConstructorOverl obj){

        System.out.println("constructor with reference");

   }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ConstructorOverl obj1 = new  ConstructorOverl();
          ConstructorOverl obj2= new  ConstructorOverl(100);
         ConstructorOverl obj3 = new  ConstructorOverl (obj2);
    }

}

