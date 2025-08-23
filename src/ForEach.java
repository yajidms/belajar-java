public class ForEach {
  public static void main(String[] args) {

    String [] name = {
            "Yazid", "Furina", "Hu Tao"
    };

    /*
    for (var i = 0; i < array.length; i++ ){
      System.out.println(array[i]);
    }
    */
    System.out.println("For Each");
    for(var array: name){
      System.out.println(array);
    }

  }
}
