public class reverse{
    public static void main (String []args){
        int number = 1234;
        int reverseno = 0;

        for(;number!=0; number = number/10)
        {
            int remainder = number %10;
            reverseno = reverseno *10 + remainder ;

        }
        System.out.println("reverse number"+reverseno);

    }
}