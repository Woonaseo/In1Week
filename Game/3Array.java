class Main {
  public static void main(String[] args) {
    int[] array1 = {1,3,5,7,9};
    int[] array2;

    //array2를 array1에 복사
    array2 = new int[array1.length];
    for(int i=0; i<array1.length;i++){
      array2[i] = array1[i];
    }

    //array1 출력
    for(int i=0;i<array1.length;i++){
      System.out.println("array1["+i+"] = "+array1[i]);
    }
    System.out.println();

    for(int i=0;i<array2.length;i++){
      System.out.println("array2["+i+"] = "+array2[i]);
    }
  }
}
