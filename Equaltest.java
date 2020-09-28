class Main {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = new String("Hello");
    String str3 = str1;
    String str4 = str2;

    System.out.println("== 관계");
    System.out.println("str1 == str1 : "+(str1==str1));// 변수가 같으니까 당연히 같다
    System.out.println("str1 == str2 : "+(str1==str2)); // 가리키는 문자열의 내용은 같지만 실제 저장되는 메모리가 다르다
    System.out.println("str1 == str3 : "+(str1==str3)); // str3 은 str1을 복사한 변수
    System.out.println("str1 == str4 : "+(str1==str4));//str4는 str2를 복사한 변수
    System.out.println();

    System.out.println("Equal 관계"); //정말 글자만 비교 
    System.out.println("str1 Equal str1 : "+(str1.equals(str1)));
    System.out.println("str1 Equal str2 : "+(str1.equals(str2)));
    System.out.println("str1 Equal str3 : "+(str1.equals(str3)));
    System.out.println("str1 Equal str4 : "+(str1.equals(str4)));
  }
}
