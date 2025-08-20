public class ForEach {
  public static void main(String[] args) {

    String [] array = {
            "Yazid", "Furina", "Hu Tao"
    };

    /*
    for (var i = 0; i < array.length; i++ ){
      System.out.println(array[i]);
    }
    */
    System.out.println("For Each");
    for(var name: array){
      System.out.println(name);
    }

  }
}
