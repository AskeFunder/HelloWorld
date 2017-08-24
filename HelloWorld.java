

public class HelloWorld
{
   public static void main(String[] args) 
   {
      IsItAlive();
      HW("Virker det?","shiiet");
   }
   
   
   
   public static void IsItAlive()
   
   {
      int x = 0;
      while (x<3)
         {
            System.out.println("It's alive!");
            x=x+1;
         }
      System.out.println("It's dead");
   }
   
   public static void HW(String text, String text2){
      System.out.println(text + " " + 1 + " " + text2);
   }
}