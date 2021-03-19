import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
// This prgram reads a file from a CLA.
public class Senti1{
	public static void main(String[] args){
		if (args.length == 0) {
			System.out.println("Usage: java ReadNames <filename>");

		}
		else {
			try{
          String word = args[0];
          Scanner in = new Scanner(new File(args[1]));
          int i;
          String data;
          int count = 0;
          while(in.hasNextLine()){
              data = in.nextLine();
              String words[] = data.split(" |\\.");

              for (i = 0; i < words.length; i++){
                  if (words[i].toLowerCase().equals(word.toLowerCase())){
                      count += 1;
                  }
              }
          }
          System.out.println(word + " appears " + count + " times.");
			}
			// catch error
			catch(FileNotFoundException e){
				System.out.print("File does not exist");
			}
		}
	}

}
