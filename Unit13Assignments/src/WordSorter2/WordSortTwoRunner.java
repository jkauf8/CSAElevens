package WordSorter2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/WordSorter2/wordsorttwo.dat"));
                int size = file.nextInt();
                file.nextLine();
                for (int i = 0; i < size; i++) {
                    String sentence = file.nextLine();
                //instantiate a new WordSort
                    WordSortTwo wordSort = new WordSortTwo(sentence);
                    wordSort.sort();
                    System.out.println(wordSort.toString());
                }
	}
}