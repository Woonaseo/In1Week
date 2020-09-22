=================main======================
class Main {
  public static void main(String[] args) {
    ExId a = new ExId();
    ExId b = new ExId();
    ExId c = new ExId();
    ExId.getStep(4);
    ExId d = new ExId();
    ExId e = new ExId();
    ExId f = new ExId();
    
    System.out.println("a의 식별 번호 : "+a.getId);
    System.out.println("b의 식별 번호 : "+b.getId);
    System.out.println("c의 식별 번호 : "+c.getId);
    System.out.println("d의 식별 번호 : "+d.getId);
    System.out.println("e의 식별 번호 : "+e.getId);
    System.out.println("f의 식별 번호 : "+f.getId);

    int max = ExId.getMaxId();
    System.out.println("마지막에 부여한 식별 번호 = "+max);
    System.out.println("다음에 부여할 식별 번호 : "+(max+ExId.getStep()));
  }
}
 
 =====================ExId==========================
 class ExId{
  static int counter = 0;
  private static int step=1;
  private int Id;

  public ExId(){
    Id = counter+=step;
    }

  public int getId(){return Id;}

  public static int getStep(){return step;}

  public static int setStep(int s){
    step = (s>=1) ? s: 1;
    return step;
  }

  public static int getMaxId(){
    return counter;
  }



}
