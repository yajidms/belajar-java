public class MethodOverloading {
  public static void main(String[] args) {

    sayHello();
    sayHello("Hu Tao");
    sayHello("Furina", "Focalor");
  }

  static void sayHello(){
    System.out.println("Hi sayangku");
  }

  static void sayHello(String name){
    System.out.println("Sayangku " + name);
  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Sayangku tercinta " + firstName + " " + lastName);
  }

}
