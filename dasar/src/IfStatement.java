public class IfStatement {
  public static void main(String[] args) {

    var nilai = 70;
    var absen = 90;

    /*
    var lulusNilai = nilai >= 75;
    var lulusAbsen = absen >= 75;
    var lulus = lulusNilai && lulusAbsen;
    */

    /*
    if(nilai >= 75 && absen >= 75){
      System.out.println("Selamat Anda Lulus");
    } else {
      System.out.println("Nice Try");
    }*/

    if(nilai >= 75 && absen >= 75){
      System.out.println("Nilai Anda BC");
    } else if(nilai >= 70 && absen >= 70){
      System.out.println("Nilai Anda C");
    } else{
      System.out.println("Nice Try");
    }
  }
}
