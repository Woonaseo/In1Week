// ================main.java=========

class Main {
  public static void main(String[] args) {
    Animal[] a = new Animal[2];
    a[0]= new Dog("뭉치","치와와");
    a[1] = new Cat("마이클",7);

    for(int i = 0; i<a.length; i++){
      System.out.println("a["+i+"] = "+a[i]);
    }
    for(int i=0;i<a.length;i++){
      System.out.print("a["+i+"] = ");
      a[i].introduce();
      System.out.println();
    }
  }
}






//=======Animal.java==========================

abstract class Animal{

  private String name;
  public Animal(String name){this.name = name;}
  public abstract void bark();
  public String getName(){return name;}
  public abstract String toString();
  
  public void introduce() {
    System.out.print(toString() + "이다.");
    bark();
  }

}








//=============Cat.java=================

class Cat extends Animal{

  private int age;
  public Cat(String name,int age){
    super(name); this.age = age;
  }

  public void bark(){
    System.out.print("야옹");
  }

  public String toString(){
    return age + "의" + getName();
  }

}







//==================Dog.java====================

class Dog extends Animal{

  private String type;
  public Dog(String name,String type){
    super(name); this.type = type;
  }

  public void bark(){
    System.out.print("멍멍");
  }

  public String toString(){
    return type + "의" + getName();
  }

}
