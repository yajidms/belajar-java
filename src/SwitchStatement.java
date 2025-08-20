public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "B";
    /*
    switch (nilai) {
      case "A":
        System.out.println("Nilaimu sempurna");
        break;
      case "B":
      case "C":
        System.out.println("Nilaimu Cukup Baik");
        break;
      case "D":
        System.out.println("nilaimu kurang memuaskan");
        break;
      default:
        System.out.println("salah penilaian");

    }
    */
    /*
    switch (nilai){
      case "A" -> System.out.println("nilaimu sempurna");
      case "B" , "C" -> System.out.println("nilai anda cukup baik");
      case "D" -> System.out.println("nilaimu kurang");
      default -> {
        System.out.println("kesalahan penilaian");
      }
    }
     */

    /*
    String ucapan;
    switch (nilai){
      case "A" -> ucapan = "nilaimu sempurna";
      case "B" , "C" -> ucapan = "nilai anda cukup baik";
      case "D" -> ucapan = "nilaimu kurang";
      default -> {
        ucapan = "kesalahan penilaian";
      }
    }
    System.out.println(ucapan);
     */

    String ucapan = switch (nilai) {
      case "A":
        yield "nilaimu sempurna";
      case "B", "C":
        yield "nilai anda cukup baik";
      case "D":
        yield "nilaimu kurang";
      default: {
        yield "kesalahan penilaian";
      }
    };
    System.out.println(ucapan);
  }
}
