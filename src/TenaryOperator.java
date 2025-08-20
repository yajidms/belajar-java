public class TenaryOperator {
  public static void main(String[] args) {

    var nilai = 75;
    /*
    String ucapan;
    if(nilai >= 75){
      ucapan = "selamat nilai anda mencapai target";
    } else {
      ucapan = "maaf coba lagi lain waktu";
    }
    System.out.println(ucapan);
     */

    //memakai tenary yang dimulai dari if "?" dan kalau false dipindahkan ke else ":"
    String ucapan = nilai >= 75 ? "selamat nilai anda mencapai target" : "silahkan coba lagi";
    System.out.println(ucapan);
  }
}
