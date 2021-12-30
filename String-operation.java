import java.util.Scanner; 

public class MyClass {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);  
      System.out.println("Input: ");
      String word  = scan.nextLine();
      String result = "";
      int len = word.length();
      int iter = 0;
      int index = len/2;
      while(iter != len) {
          result = result+word.charAt(index);
          System.out.println(String.format("%" + len + "s", result));
          if (index == len-1) {
              index = 0;
          }
          else {
              index++;
          }
          iter++;
      }
      
    }
}
