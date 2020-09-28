class Main {
  public static void main(String[] args) {
    int i,j;

    i = 10;
    while(i>0){
      j =0;
      while(j<i){
        System.out.print("*");
        j++;
      }
      System.out.println();
      i--;
    }
  }
}

//자바에서는 반복문으로 3가지가 있다. while, do-while , for
//c와의 차이점은 자바에서의 반복문은 조건에 반드시 boolean 형을 사용
//whille에서 주의할 점은 무한루프에 빠질수 있다는 점이다.
