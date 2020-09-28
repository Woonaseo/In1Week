class Main {
  public static void main(String[] args) {
    int[][] arr = {{10,20,30,40},{50,60},{70,80,90}};
    System.out.println("배열의 행수: "+arr.length);

    for(int i=0;i<arr.length;i++){
      System.out.println((i+1)+"행의 열수 : "+arr[i].length);
      for(int j=0; j<arr[i].length;j++){
        System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
      }
    }
  }
}
