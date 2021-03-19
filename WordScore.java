public class WordScore{

  private String word;

  public WordScore(String words){
    word = words;
  }
	public int score(String rev){
    String listWords[] = rev.split(" |\\.");
    int score = Integer.parseInt(listWords[1]);
    int count = 0;
    for(int i = 0; i < listWords.length; i++){
      if(listWords[i].toLowerCase().equals(word.toLowerCase())){
        count += 1;
      }
    }
    if(count > 0){
      return score;
    }
    return -1;
  }
}
