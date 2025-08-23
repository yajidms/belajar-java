public class Scope {
  public static void main(String[] args){
    sayHello("Furina");
  }

  static void sayHello(String name){
    String hello = "hello " + name;

    if(!name.isBlank()){
      String hi = "Hi " + name;
      System.out.println(hi);  //didalam block
    }

    System.out.println(hello);
    // untuk "System.out.println(hi);" tidak bisa karena diluar dari blocknya
  }
}
