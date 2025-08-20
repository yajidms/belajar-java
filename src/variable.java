public class variable {
  public static void main(String[] args) {

    String name;
    name = "Yazid Alrasyid";

    int age = 20;
    String address = "Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

    //Jika value ada dua dijava maka dianggap output, karena java mengikuti output mulai dari input value dari atas ke bawah
    name = "Hu Tao";
    System.out.println(name);

    var firstName = "Yazid";
    var lastName = "Alrasyid";
    var fullName = firstName + " " + lastName;
    System.out.println(fullName);

  }
}
