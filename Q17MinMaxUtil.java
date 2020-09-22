=====================main=====================
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("x값:"); int x = stdIn.nextInt();
    System.out.print("y값:"); int y = stdIn.nextInt();
    System.out.print("z값:"); int z = stdIn.nextInt();

    System.out.print("배열a의 요소 수:");
    int num = stdIn.nextInt();
    int[] a = new int[num];
    for (int i = 0 ; i < num ; i++) {
      System.out.print("a[" + i + "]:");
      a[i] = stdIn.nextInt();
    }
 
    System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.min(x,y));
     System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.max(x,y));

    System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.min(x,y,z));
    System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.max(x,y,z));

    System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));


    int xmin[] = MinMax.minIndexArray(a);
    System.out.print("인덱스는{ ");
    for (int i = 0 ; i < xmin.length ; i++)
      System.out.print(xmin[i] + " "); 
      System.out.println("}입니다.");
    


    int xmax[] = MinMax.maxIndexArray(a);
    System.out.print("인덱스는{ ");
    for (int i = 0 ; i < xmax.length ; i++)
      System.out.print(xmax[i] + " "); 
      System.out.println("}입니다.");


  }
}

=============================minmax.java==========================
public class MinMax{

  //인수 2개 중 최솟값
  public static int min(int a,int b){

    return (a<b? a:b);

  }
  //2개 중 최댓값
  public static int max(int a,int b){

    return (a>b? a:b);

  }
  //인수 3개 중 최소값
  public static int min(int a,int b,int c){

    int min = a;
    if(b<min) min =b;
    if(c<min)min = c;

    return min;
  }
  //2개중 최댓값
  public static int max(int a,int b,int c){

    int max = a;
    if(b>max) max =b;
    if(c>max)max = c;

    return max;
  }

  //배열에서 최소값
public static int min(int[] a) {
  int min = a[0];
  for (int i  = 1 ; i < a.length ; i++)
    if (a[i] < min)
      min = a[i];
  return min;
}

  public static int[] minIndexArray(int[] a) {

  int min = min(a);
  int count = 0;

  for (int i = 0 ; i < a.length ; i ++)
    if (a[i] == min)
      count++;

  int[] c = new int[count--];
  for (int i = a.length -1 ; count >= 0 ; i--)
    if (a[i] == min)
      c[count--] = i;
  return c;
}

  //배열에서 최댓값
  public static int[] max(int[] a){
    int max = max(a);
    int count = 0;
    for (int i = 0; i<a.length ; i++)
      if(a[i]>max)
        max = a[i];
    return max;

  }
  public static int[] maxIndexArray(int[] a) {

    int max = max(a);
    int count = 0;

    for (int i = 0 ; i < a.length ; i ++)
      if (a[i] == max)
        count++;

    int[] c = new int[count--];
    for (int i = a.length -1 ; count >= 0 ; i--)
      if (a[i] == max)
        c[count--] = i;
    return c;
  }
}















}
