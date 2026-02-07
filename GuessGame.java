import java.util.*;
class GuessGame {
  static Scanner input = new Scanner(System.in);
  static Random N = new Random();
  static int Secret = N.nextInt();
  static int Guess = 0;

public static void main(string[] sandra) {
  do {
    System.out.print("Enter you Guess(1 - 100: ");
    Guess = input.nextInt();
    if(Guess > Secret)
      System.out.println("Too High!");
    else if(Guess < Secret)
      Sytem.out.println("Too Low!");
    else
      System.out.println("CONGRATULATIONS!");
  } while (Guess != Secret);
}
}
