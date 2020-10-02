import java.util.Scanner;
/**
 * while loop example
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What number to count to?");
    int upTo = input.nextInt();
    // create a variable to keep track of the number
    int count = 1;
    // uding a loop to count up to 5
    while(count <= 5){
      // print the number we are at
      System.out.println(count);
      // increase the value of count by 1
      count = count + 1;
    }
    System.out.println("All done");



    // do while loop
    int count2 = 1;
    // do ehile loop to count
    do{
      // print the number
      System.out.println(count2);
      // increment the counter
      count2 = count2 + 1;
    }while(count2 <= upTo);
    System.out.println("All done again");
  }
}
