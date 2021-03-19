public class Word
{
  public static String showLetter(String word, char letter)
  {
    int i = 0;
    String concat = "";
    for (i = 0; i < word.length(); i++){
      if (word.charAt(i) == letter){
        concat += letter;
      }
      else{
        concat += "_";
      }
    }
    return concat;
  }
}
