class Main {
  public static void main(String[] args) {

    String num = "11";

    try{
      int bin = Integer.parseInt(num,2);
      int oct = Integer.parseInt(num,8);
      int dec = Integer.parseInt(num,10);
      int hex = Integer.parseInt(num, 16);

      
      System.out.println("주어진 값 : " + num);
      System.out.println("2진수로 봤을때 : " + bin);
      System.out.println("8진수로 봤을때 : " + oct);
      System.out.println("10진수로 봤을때 : " + dec);
      System.out.println("16진수로 봤들때 : " + hex);

    }catch(NumberFormatException e){
      System.out.println("ERROR: "+e);
    }
  }
}
