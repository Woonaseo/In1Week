//====================main.java===============
class Main {
  public static void main(String[] args) {

    HeadMounted hmd = new HeadMounted();
    hmd.putOn();
    hmd.putOff();
    hmd.changeSkin(Skinnable.YELLOW);
    hmd.putSkin();

    Wearable w =  hmd;
    w.putOn();
    w.putOff();

    Skinnable s = hmd;
    s.changeSkin(Skinnable.BLACK);

    hmd.putSkin();

  }
}

//클래스형 인스턴스
//HeadMounted 클래스형의 변수 hmd , Wearable 형의 변수 w, Skinnable형의 변수 s는 모두 생성된 동일 인스턴스를 참조한다. 변수 hmd,w,s의 형이 각각 다르기 때문에 해당 형에서 호출 가능한 메서드만 호출한다









//===================HeadMounted.java=========================
public class HeadMounted implements Wearable,Skinnable{

  private int skin;

  public void putOn(){
    System.out.println("디스플레이를 착용했습니다.");
  }

  public void putOff(){
    System.out.println("디스플레이를 벗었습니다.");
  }

  public void changeSkin(int skin){
    this.skin = skin;
  }

  public void putSkin(){
    switch(skin){
      case BLACK: System.out.println("BLACK DISPLAY"); break;
      case RED: System.out.println("RED DISPLAY"); break;
      case GREEN: System.out.println("GREEN DISPLAY"); break;
      case BLUE: System.out.println("BLUE DISPLAY"); break;
      case YELLOW: System.out.println("YELLOW DISPLAY"); break;
    }
  }


}








//============================================Skinnable.java=============
public interface Skinnable{

  int BLACK = 0;
  int RED = 1;
  int GREEN = 2;
  int BLUE = 3;
  int YELLOW = 4;
  void changeSkin(int skin);

}






//======================Wearable.java==============
public interface Wearable{

  void putOn(); // 킨다
  void putOff(); //끈다


}
