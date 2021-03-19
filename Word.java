public class Word
{
  public static String showLetters(String word, String sub)
  {
    String concat = "";
    for(int i = 0; i < word.length(); i++){
      if(containsLetter(sub, word.charAt(i))){
        concat += word.substring(i, i + 1);
      }
      else {
        concat += "_";
      }
    }
    return concat;
  }

  public static boolean containsLetter(String word, char letter){
    int size = word.length();
    char [] array;
    array = new char [size];
    int i = 0;
    int flag = 1;

    for (i = 0; i < size; i++){
      array[i] = word.substring(i, i + 1).charAt(0);
    }

    for(i = 0; i < size; i++){
      if (letter == (word.substring(i, i + 1).charAt(0))){
        flag = 0;
        break;
      }
      else{
        flag = 1;
      }
    }

    if (flag == 0){
      return true;
    }
    else{
      return false;
    }
  }
}
