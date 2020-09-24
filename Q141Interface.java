//==============main.java===========

class Main {
  public static void main(String[] args) {

    Wearable[] a = new Wearable[2];
    a[0] = new Headphone();
    a[1] = new WearableComputer();

    for (int i=0; i<a.length;i++)
      a[i].putOn();
    
    for (int i=0;i<a.length;i++)
      a[i].putOff();

  }
}

//=================Headphon.java=====================

public class Headphone implements Wearable{

  int volume = 0;
  public void putOn(){
    System.out.println("헤드폰을 착용했습니다.");
  }

  public void putOff(){
    System.out.println("헤드폰을 벗었습니다.");
  }

  public void setVolume(int volume){
    this.volume = volume;
    System.out.println("볼륨을 "+volume+"로 변경 했습니다.");
  }


}

//==================Wearable.java======================
// 인터페이스는 설계도,
// public 과 abstract 개념

public interface Wearable{

  void putOn(); // 킨다
  void putOff(); //끈다


}


//인스턴스는 생성할수 없다.




//=====================WearableComputer.java============================

public class WearableComputer implements Wearable{

  public void putOn(){
    System.out.println("컴퓨터를 실행했습니다.");
  }

  public void putOff(){
    System.out.println("컴퓨터를 껏습니다.");
  }



  public void reset(){
    System.out.println("컴퓨터를 재시작했습니다.");
  }

}
