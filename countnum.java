public class number{

     public static void main(String []args){
         int count = 0, a = 548;

        for(; a != 0; a/=10, ++count);
         
        System.out.println("Number of digits:" + count);
     }
}
