import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	//instance variable
	private ArrayList<Word> wordList;

	//default constructor
	public Words()
	{
		wordList= new ArrayList<Word>();
	}

	//modified constructor
	public Words(String s)
	{
		wordList = new ArrayList<Word>();

		//filter the parameter
		setWords(s);
	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"
		wordList.clear();

		Scanner unc = new Scanner(s);

		//Continue to loop while there are more words to read
		while (unc.hasNext())
		{
			wordList.add(new Word(unc.next()));
		}
			//Add objects of the type Word to our ArrayList "wordList"


	}
 
	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
			for (Word theWord : wordList)
				if (theWord.getLength()==size)
					count++;


			//if the length of the "theWord" is the same as the parameter "size"

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop
		for (int i= wordList.size()-1;i>0;i--)
		{
			
			//if the Word has "size" characters
			if (wordList.get(i).getNumVowels()>-1)
			{
				vowelCount++;
			}
			if (wordList.get(i).getLength()==size)
			{
				wordList.remove(i);
			}

		}
			

		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
		for (Word words: wordList)
			if (words.getNumVowels()==numVowels)
			count++;
			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "";
	}
}