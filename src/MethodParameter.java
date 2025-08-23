public class MethodParameter {
  public static void main(String[] args){

    sayHello("Putra", "Kacau");
    sayHello("Furina", "Cintaku");
    sayHello("Hu Tao", "Sayangku");

  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Dia " + firstName + " " + lastName);
  }
}
