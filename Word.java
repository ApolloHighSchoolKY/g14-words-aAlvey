import java.util.List;
import java.util.ArrayList;

public class Word
{
	private String word;
	private static final String VOWELS = "AEIOUaeiou";   //static means only one

	//default counstructor
	public Word()
	{
		word = "sigma sigma boy sigma boy sigma boy";	
	}

	//modified constructor
	public Word(String newWord)
	{
		setWord(newWord);
	}

	//set method
	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{

		int count = 0;
		//Loop for every letter in "word"
		 	for (int i = word.length()-1; i=0; i--)
				if(word.indexOf(VOWELS))
				count++;

		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}