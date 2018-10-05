public class leapyear{

     public static void main(String []args){
     int y = 2015;
        boolean leap =false;

        if(y % 4 == 0)
        {
            if( y % 100 == 0)
            {
           if( y % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println( " yes");
        else
            System.out.println(" no");

     }
}
