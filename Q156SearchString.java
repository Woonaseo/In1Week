import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("문자열 s1:");
    String s1 = stdIn.next();

    System.out.print("문자열 s2:");
    String s2 = stdIn.next();

    int idx = s1.indexOf(s2);
    if(idx == -1)
      System.out.println("s1안에 s2가 포함돼 있지 않습니다.");
    else{
      System.out.println(s1);
      for (int i =0 ; i<idx;i++)
        System.out.println(' ');
      System.out.println(s2);

    }

  }
}

//indexOf 매서드 문자열내에서 포함 문자열을 탐색한다.
//변수명. indexOf(s)
//위치를 반환한다.
