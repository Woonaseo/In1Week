class Main {
  public static void main(String[] args) {

    int x,y,z;

    x = 10; y = 5; z =0;
    z= x++ - y-- + 1;//6

    System.out.println("x="+x+",y="+y+",z="+z);
                        //11


    x = 10; y = 5; z =0;
    z= ++x - --y + 1;

    System.out.println("x="+x+",y="+y+",z="+z);




  }
}
