public class ConvertionNumber {
  public static void main(String[] args) {

    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;


    //misalnya konversi dari nilai paling besar ke suatu tipe data paling kecil, maka terjadinya error atau number overflow
    byte iniByte2 = (byte) iniInt;
  }
}
