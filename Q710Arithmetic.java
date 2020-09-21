import java.util.Scanner;
import java.util.Random;

class Main {
  static Scanner stdIn= new Scanner(System.in);
  static boolean Retry(){ 
    int c;
    do{
      System.out.print("다시 한 번? <Yes...1/No...0 : ");
      c = stdIn.nextInt();
    }while(c!=0||c!=1);
    return c==1;
      
  }

  public static void main(String[] args) {
    Random rand = new Random(); 

    System.out.println("암산 훈련!!!");
    do{
      int x = rand.nextInt(900)+100;
      int y = rand.nextInt(900)+100;
      int z = rand.nextInt(900)+100;

      int p = rand.nextInt(4);

      int answer;

      switch(p){
        case 0 : answer = x+y+z; break;
        case 1 : answer = x+y-z; break;
        case 2 : answer = x-y+z; break;
        case 3 : answer = x-y-z; break;
      }
      while (true){
        System.out.print(x+((p<2)?"+":"-")+y+((p%2==0)?"+":"-")+" = ");
        int k= stdIn.nextInt();
        if(k==answer)
          break;
        System.out.println("틀렸습니다!");
      }
    }while(Retry());
  }
}
