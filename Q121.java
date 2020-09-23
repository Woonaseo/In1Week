//==================main.java=======================
class Main {
  public static void main(String[] args) {
    //Q122
    //ExCar myCar = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");
    
    // System.out.printf("차 이 름:%s\n",myCar.getName());
    // System.out.printf("현재위치: (%.2f,%.2f)\n",myCar.getX(),myCar.getY());
    // System.out.printf("남은연료:%.2f리터\n",myCar.getFuel());
    // System.out.printf("구 입 일:%s\n",myCar.getPurchaseDay());



    //Q123
   // ExCar myCar = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");
   // myCar.putSpec();

    //파생 클래스에 상속되지 않는 자원 -> 생성자
    //슈퍼 클래스에 생성자는 super.호출 가능
    //생성자를 하라도 정의하지 않으면 빈 생성자가 컴파일러를 통해 자동으로 정의 된다.
    //X(){}

    //매서드 덮어쓰기 super(부모클라스명을 의미).멤버명

    //상속의 장점 중 하나는 기존 프로그램을 최소환으로 추가 및 수정만 해서 새로운 프로그램을 완성한다.(충분 프로그래밍, incremental programing),프로그램 개발시 효율성을 높이고 유지관리 보수를 용이하게 한다. 상속이 더 큰 효과를 발휘하는 것은 다형성이다.

    //Q124
    // Car Car1 = new Car("w140",1885,1490,5220,95.0,"2018,10,13");
    // ExCar Car2 = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");

    // Car x;    // 클래스형 변수
    // x = Car1; // 자기자신의 형 인스턴스를 참조할 수 있다.
    // x = Car2; // 하위 클래스형의 인서턴스도 참조할 수 있다.

    // System.out.println("x구입일 : " + x.getPurchaseDay());

    //is-A 관계 : ExCar는 Car의 자식으로 Car 가족의 일원이라고 볼수 있다.
    //ExCar는 Car의 일종이다.
    //관계의 반대는 성립하지 않는다, 즉 , Car는 ExCar의 일종이 아니다.
    //Car1 자동차 클래스 Car의 인스턴스
    //Car2 ExCar형의 인스턴스 (총주행거리가 있는 인스턴스)

  //   ExCar y; // 클래스형 변수
  //  // y = Car1; //상위 클래스 형의 인스턴스는 참조할 수 없다!!!
  //   y = Car2; // 자기 자신의 형 인스턴스는 참조할수 있다.
  //   System.out.println("y구입일 : " +  y.getPurchaseDay());
  //   System.out.println("y의 총 주행 거리: : " + y.getTotalMileage());

    //ExCar 형의 변수 y는 슈퍼 클래스 Car형의 Car1인스턴스를 참조할 수 없다.
    //상위 클래스 형의 변수는 하위클래스의 인스턴스를 참조할 수 있지만 하위 클래스 형의 변수 상위 클래스의 인스턴스를 참조할 수 없다.(우회방법 있음)


  //Q125

    //Car car1 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

    //Car1.putSpec();

    //매서드 putSpec 와 move 같은 상위클래스의 매서드를 하위 클래스에서 새롭게 정의하는 것을 오버라이드 라고 
    //Car형의 클래스형 변수 Car1 이 Excar형의 인스턴스를 참조한다. 따라서 변수와 참조 대상의 형이 다르다.
    // 참조 대상의 인스턴스가 ExCar형이 때문에 ExCar형의 putSpec을 호출한다.
    //호출해야 할 메서드가 실행 시에 결정되므로 이러한 방식을 동적결합 또는 지연결합(결속)
    //클래스 형 변수가 파생관계에 있는 다양한 클래스형의 인스턴스를 참조하는것을 다형성이라고 한다. (폴리 다양한 많은 모ㅗ피즘 형태),다양성,다상성...
    //다형성이 있는 메서드 호출은 프로그램 실행시에 호출할 매서드가 결정된다.

    //Annotation(사람과 컴퓨터가 모두 볼수 있는 주석)

    //Q126
    Car car1 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

    car1.move(10,10);
    //System.out.println("총 주행 거리:"+car1.getTotalMileage());
    System.out.println("총 주행 거리:"+((ExCar)car1).getTotalMileage());

    //ExCar 클래스의 인스턴스 자동차가 이동 총주행거리 TotalMileage + @
    //상속하지 않고 override
    //매써드 호출 시 ExCar의 move가 호출 된다.
    //캐스트를 사용해서 ExCar형의 매서드를 호출

    //객체 지향 프로그래밍의 3대 요소
    //1.클래스 2.상속 3.다형성




  }
}

//=============================Car.java==========================
public class Car{
  
  private String name;//이름
  private int width;//폭
  private int height;//높이
  private int length;//길이

  private double x;//현재 위치 x
  private double y;//현재 위치 y

  private double fuel; //남은 연료
  private String purchaseDay; // 구입일(글자로 처리)


  //생성자//
  Car(String name,int width,int height,int length , double fuel, String purchaseDay){
    this.name = name;
    this.width = width;
    this.height = height;
    this.length = length;
    this.fuel = fuel;
    x=y=0.0;
    this.purchaseDay = purchaseDay;
  }

  public String getName() {return name;}
  public double getX() {return x;}
  public double getY() {return y;}
  public double getFuel() {return fuel;}
  public String getPurchaseDay() {return purchaseDay;}
  //private 로 선언한 변수는 접근이 불가능하다.
  //그래서 퍼블릭으로 선언한 변수를 통해 간접적으로 가져오는것.

  public void putSpec() {
    System.out.println("이름:"+name);
    System.out.println("전폭:"+width+"mm");
    System.out.println("전고:"+height+"mm");
    System.out.println("전장:"+length+"mm");
  }

  //이동 x방향 y방향

  public boolean move (double dx, double dy){
    double dist = Math.sqrt(dx * dx + dy * dy);

    if(dist > fuel)
      return false;
    else{
      fuel -= dist;
      x += dx;
      y += dy;
      return true;
    }
  }



}

//===========================================ExCar.java===================================
class ExCar extends Car{ // extends 클래스 이름 -> 이 클래스를 상속 받는다
//Car Class : 보모, 상위, 기본, 슈퍼
//ExCar Class : 자식, 하위, 파생, 서브

  private double totalMileage;

  //생성자
  public ExCar(String name, int width, int height, int length, double fuel,String purchaseDay){
    super(name,width,height,length,fuel,purchaseDay);
    totalMileage=0.0;
  }

  public double getTotalMileage(){
    return totalMileage;
  }

  public void putSpec(){
    super.putSpec();
    System.out.printf("총 주행 거리: %.2fkm\n",totalMileage);
  }

  public boolean move (double dx, double dy){
    double dist = Math.sqrt(dx * dx + dy * dy);

    if(!super.move(dx,dy))
      return false;
    else{
      totalMileage += dist;
      return true;
    }
  }

}
//자바에서는 여러 클래스로부터 다중 상속은 지원하지 않는다.
//서브 클래스는 슈퍼 클래스를 알고 있지만, 슈퍼 클래스는 서브 클래스를 모른다.
