import java.util.Scanner;


class Main {


  static int linearSearch(int[] a,int key){
    for(int i =0;i<a.length;i++)
      if(key==a[i])
        return i;
      return -1; //값이 없음
  }

  static int linearSearchr(int[] a,int key){
    for(int i =a.length-1;i>=0;i--)
      if(key==a[i])
        return i;
     return -1; //값이 없음
  }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수:"); int n = stdIn.nextInt();
    int[] x = new int[n];

    for(int i=0;i<n;i++){
      System.out.print("x["+i+"]:");
      x[i]=stdIn.nextInt();
    }

      
    System.out.print("찾는 값:"); int key=stdIn.nextInt();
    int idxTop=linearSearch(x,key);
    int idxBtm=linearSearchr(x,key);

    if(idxTop==-1)
      System.out.println("해당 값은 존재하지 않습니다.");
    else if (idxTop==idxBtm)
      System.out.println("가장 앞에 위치한 같은 x["+idxTop+"]에 있습니다");
    else{
      System.out.println("해당 값의 요소가 여러개 존재합니다.");
      System.out.println("가장 앞에 위치한 같은 x["+idxTop+"]에 있습니다");
      System.out.println("가장 앞에 위치한 같은 x["+idxBtm+"]에 있습니다");
    }
    
    
  }
}
