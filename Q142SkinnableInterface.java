//========================main.java==================

class Main {
  public static void main(String[] args) {



    SkinnableSoftware x = new SkinnableSoftware();
    SkinnableSoftware y = new SkinnableSoftware();

    x.changeSkin(Skinnable.YELLOW);

    System.out.println("x의 스킨은 "+x.getSkinString()+"입니다.");
    System.out.println("y의 스킨은 "+y.getSkinString()+"입니다.");
  }
}


//이름 부여 방법은 클래스와 같다. 관용적** ...able 을 사용한다.
//접근성도 클래스와 같다. public 의 특성이 기본, public 없이 선언하면 패키지 접근성을 가지게 된다.








//===========================Skinnable.java===================================

public interface Skinnable{

  int BLACK = 0;
  int RED = 1;
  int GREEN = 2;
  int BLUE = 3;
  int YELLOW = 4;
  void changeSkin(int skin);

}

//인터페이스는 상수를 가질수 있다.
// 모두 public static final 의 속성을 가지고 있다.
// 인터페이스 내의 상수는 모두 '인터페이스명.필드명'으로 접근한다.
// 인터페이스가 가질 수 있는 멤버
//1.클래스 2.상수 3.인터페이스 4.추상메서드




//==============SkinnableSoftware.java======================
class SkinnableSoftware implements Skinnable{

  int skin;

  //생성자
  public SkinnableSoftware(){this.skin = BLACK;}
  public SkinnableSoftware(int skin){this.skin = skin;}

  public void changeSkin(int skin){this.skin = skin;}
  public int getSkin() {return skin;}

  public String getSkinString(){
    switch(skin){
      case BLACK: return "BLACK";
      case RED: return "RED";
      case GREEN: return "GREEN";
      case BLUE: return "BLUE";
      case YELLOW: return "YELLOW";
    }
    return "";
  }


}

