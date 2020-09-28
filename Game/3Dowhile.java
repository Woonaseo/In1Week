class Main {
  public static void main(String[] args) {
    int i,j;

    i = 10;
    do{
      j = 0;
      do{
        System.out.print("*");
        j++;
      }while(j<i);
      System.out.println();
      i--;
    }while(i>0);
  }
}

//do while 은 조건을 나중에 검사한다
//while 문은 조건이 false인 경우에는 한번도 실행을 하지 않는다.
//do while은 어떠한 경우에서라도 한번은 실행한다
