public class BreakContinue {
  public static void main(String args[]) {

    /*
    var counter = 1;
    while (true){
      System.out.println("perulangan ke-" + counter);
      counter++;

      if(counter > 10){
        break;
      }
    }
    System.out.println("Perulangan Berhenti");
     */

    for(var counter = 1; counter <= 100; counter++){
      if(counter %2 == 0){
        continue;
      }
      System.out.println("perulangan ganjil " + counter);
    }

  }
}
