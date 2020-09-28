class Main {
  public static void main(String[] args) {
    int myInt;
    float myFloat = (float) 3.0;
    double myDouble;

    myInt = (int) myFloat;
    myDouble = myInt;
  
    System.out.println("myInt = "+myInt+ ",myFloat = "+myFloat+ ",myDouble = "+myDouble);
  }
}

//형변환

//자바가 c와 구별되는 큰 특징 중의 하나가 데이터형에 대한 검사가 철저하다.

//명령어를 사용할때 미리 정해놓은 데이터 형을 사용해야만 한다. 다른형으로 사용하고자 할때는 명시적으로 데이터형을 변환해주어야 한다.

//의도적으로 형변환하는 방법은 두가지가 있다. 1.casting  2.wrapper
