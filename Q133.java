//=============AbstLine.java=================================

public abstract class AbstLine extends Shape{

    /**
     * 직선의 길이를 나타내는 int형 필드
     */
    private int length;

    /**
     * 직선을 생성하는 생성자이다.
     * 길이를 인수로 받는다.
     * @param length 생성할 직선의 길이
     */
    public AbstLine(int length){
        setLength(length);
    }

    /**
     * 직선의 길이를 반환한다.
     * @return 직선의 길이
     */
    public int getLength() {
        return length;
    }

    /**
     * 직선의 길이를 설정한다.
     * @param length 설정할 직선의 길이
     */
    public void setLength(int length){
        this.length = length;
    }

    /**
     * toString 매서드는 직선에 관련된 도형 정보를 문자열로 변환한다.
     * @return 문자열 "AbstLine(length:3)"을 반환한다.
     * 3 부분은 길이에 해당하는 값이다.
     */
    public String toString(){
        return "AbstLine(length"+length+")";
    }






}



//================Point.java=====================

/**
 * Point 클래스는 점을 나타내는 클래스이다.
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape 으로부터 파생된 클래스이다.
 * 필드는 없다
 * @author 이몽룡
 * @see Shape
 */

public class Point extends Shape {

    /**
     * 점을 생성하는 생성자이다.
     */

    public point(){

    }

    /**
     * toString 매서드는 점에 관련된 도형 정보를 문자열로 변환한다.
     * 반환하는 문자열은 항상 "Point"이다.
     * @return 문자열 "Point"를 반환한다.
     */
    public String toString() {
        return "point";
    }

    /**
     * draw 매서드는 점을 그리는 매서드이다.
     * 플러스 기호 +를 1개만 표시하고 줄 바꿈한다.
     */
    public void draw(){
        System.out.println("+");
    }
    
}

//======================Shape.java=========================
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
    /**
     * 도형 정보를 나타내는 문자열을 반환하는 추상 매서드.
     * Shape 클래스에서 파생되는 클래스에서 이 매서드를 구현한다.
     * 이 메서드는 java.lang.Object 클래스의 매서드를 추상 매서드로
     * 오버라이드한 매서드이다.
     * 
     */

    public abstract String toString();

    /**
     * draw 매서드는 도형을 그리기 위한 추상매서드 이다.
     * Shape 클래스에서 파새외는 클래스에서 이 매서드를 구현한다.
     */
    

    public abstract void draw();

    /**
     * print 매서드는 도형 정보의 정보를 표시하고 도형 자체를 그린
     * 구체적으로 다음 두 단계를 따른다.
     * 1.toString 매서드가 반환하는 문자열을 표시하고 준비 끝
     * 2.draw매서드를 호출해서 도형을 그림
     */

    public void print(){
        System.out.println(toString());
    }
}
