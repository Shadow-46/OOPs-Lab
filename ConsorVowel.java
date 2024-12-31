public class ConsorVowel{
  static String VorC(char c){
    String v = "aeiouAeiou";
    return (v.indexOf(c) != -1) ? "Vowel" : "Consonant";
  }
  public static void main(String[] args)
  {
    System.out.println("It is a " + VorC('a'));
    System.out.println("It is a " + VorC('s'));
  }
}
