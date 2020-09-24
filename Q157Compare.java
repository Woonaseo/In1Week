import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);


    System.out.print("문자열s1:");
    String s1 = stdIn.next();
    System.out.print("문자열s2:");
    String s2 = stdIn.next();

    if(s1==s2)
      System.out.println("s1==s2입니다.");
    else
      System.out.println("s1 != s2 입니다.");
    
    if(s1.equals(s2))
      System.out.println("s1==s2입니다.");
    else
      System.out.println("s1 != s2입니다.");
    
    System.out.println((s1 == s2)?"같습니다.":"다릅니다.");
  }
}
