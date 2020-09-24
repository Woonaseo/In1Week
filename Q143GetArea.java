//=======================main.java====================
class Main {
  public static void main(String[] args) {
    Plane2D[]a={
      new Rectangle(2,5), // 사각형
      new Parallels(2,5), // 평행사변
    };

    for (int i = 0;i<a.length;i++)
      System.out.println("a["+i+"]의 면적="+a[i].getArea());
  }
}








//=======================Paarallels.java==========================
public class Parallels extends Shape implements Plane2D{

  private int width;
  private int height;

  public Parallels(int width,int height){
    this.width = width;
    this.height = height;
  }

  public String toString(){
    return "Parallels(width:"+width+",height:"+height+")";
  }

  public void draw(){
    for(int i= 1 ; i<=height;i++){
      for(int j=1 ; j<=height-i;j++)
        System.out.print(" ");
        for(int j=1;j<=width;j++)
          System.out.print("#");
        System.out.print("");
      
    } 
  }
  public int getArea(){return width*height;}
}








//============================Plane2D.java============================
public interface Plane2D{

  int getArea();
  

}








//=========================Rectangle.java==============================
public class Rectangle extends Shape implements Plane2D{

  private int width;
  private int height;

  public Rectangle(int width,int height){
    this.width = width; this.height = height;
  }

  public String toString(){
    return "Rectangle(width:"+width + ". height: "+height+")";
  }

  public void draw(){
    for(int i=1;i<=height;i++){
      for(int j=1;i<=height;j++)
        System.out.print("*");
      System.out.println();
    }
  }

  public int getArea(){return width*height;}



}










//====================Shape.java==========================
/**
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
 * 추상 클래스이므로 이 클래스의 인스턴스는 생성될수 없다.
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다.
 * 
 * @author 홍길동
 * @see Object
 * 
 * 
 */
public abstract class Shape{

    public abstract String toString();

    public abstract void draw();

    public void print(){
        System.out.println(toString());
    }
}

