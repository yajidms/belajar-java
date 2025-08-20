import java.sql.SQLOutput;

public class Array {
  public static void main(String[] args) {

    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "Yazid";
    stringArray[1] = "Furina";
    stringArray[2] = "Hu Tao";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    String[] stringArray2 = new String[3];

    long[] arrayLong = {
            10L, 20L, 30L
    };

    System.out.println(arrayLong.length);

    String[][] members = {
            {"Yazid", "Furina", "Hu Tao"}, {"pablo", "fuad"}, {"KEVIN"}

    };

    System.out.println(members[0]); /* pengambilan array of string tapi nilainya tidak benar */
    System.out.println(members[1][0]);
  }
}
