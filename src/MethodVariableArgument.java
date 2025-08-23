public class MethodVariableArgument {
  public static void main(String[] args) {


    int[] values = {80, 80, 80, 80};
    sayCongrast("Yazid", values);

    sayCongrast("Hu Tao", 80, 100, 100, 100);

  }

  static void sayCongrast(String names, int... values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }
    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + names + ", Anda lulus");
    } else {
      System.out.println("Maaf " + names + ", Anda tidak lulus");
    }

  }
}
