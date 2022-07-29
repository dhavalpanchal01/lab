import java.util.Scanner;


 class Cube
 {                                 

   public static void main(String args[])

{
    int i,Number,Cube;
    System.out.println("Enter a No  ");
    Scanner Scan = new Scanner(System.in);     
		    Number = Scan.nextInt();

     for(i=1;i<=Number;i++)    
                   
     {
         
         Cube = i*i*i;                		
         System.out.println("Numberss is " +i+ " cube of no = " +i+" is "  +Cube );
         

    }

 }
}
