package competec.aula6_metodos_gabarito;

public class RotacionarStringGabarito {

  public static void main(String[] args) {
    String originalString = "Competec";
    int strlen = originalString.length();
    for(int i = 0;i < strlen;i++){
      System.out.println(originalString);
      originalString = rotateString(originalString);
    }
  }

  public static String rotateString(String str) {
    if (str == null || str.isEmpty()) {
      return str;
    }
    return str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
  }

}
