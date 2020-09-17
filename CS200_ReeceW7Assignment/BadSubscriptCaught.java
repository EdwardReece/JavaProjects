import java.util.*;
public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
      String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
        "Fred", "Gina", "Henry"};
      Scanner keyboard = new Scanner(System.in);
      int number;

      System.out.println("Enter name's position to request: ");

      number=keyboard.nextInt();

      try {
        System.out.println("Name: " + names[number]);
      }

      catch(ArrayIndexOutOfBoundsException error) {
            System.out.println("Subscript out of range");
        }
    }
}
