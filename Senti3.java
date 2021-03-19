import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Senti3{
	public static void main(String[] args){
		if (args.length == 0) {
			System.out.println("Usage: java ReadNames <filename>");
		}

		else {
			try{
				String word = args[0];
				Scanner in = new Scanner(new File(args[1]));
				int i, j;
				String data;
				int count = 0;
				double lineCount = 0;
				double countScore = 0;
				double score;
				double result = 0.00;
				while(in.hasNextLine()){
					data = in.nextLine();
					String eachLine[] = data.split("\\r?\\n");
					String words[] = data.split("\\s+");
					String splitter[];

					for (i = 0; i < words.length; i++){
						if (words[i].contains(word)){
							count += 1;
						}
					}
					for (i = 0; i < eachLine.length; i++){
						splitter = eachLine[i].split("\\s+");
						score = Integer.parseInt(splitter[0]);
						for (j = 0; j < splitter.length; j++){
							if (splitter[j].contains(word)){
								countScore = countScore + score;
								lineCount += 1;
								break;
							}
						}
					}
				}
				if (lineCount == 0){
					lineCount = 1;
				}
				System.out.println(word + " appears " + count + " times.");
				result = countScore / lineCount;
				System.out.println("The average score of the reviews containing " + word + " is " + String.format("%.2f", result));
			}
			// catch error
			catch(FileNotFoundException e){
				System.out.print("File does not exist");
			}
		}
	}
}
