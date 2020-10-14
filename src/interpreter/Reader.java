package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Reader
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<ArrayList<String>> mainDir = new ArrayList<ArrayList<String>>();
		URL url = new URL("http://magicplugin.normalitycomics.com/update/cardFiles/premodern-core-sets.txt");
		BufferedReader inputFile = new BufferedReader(new InputStreamReader(url.openStream()));

		String lineFromFile;
		//int count = 0;
		while ((lineFromFile = inputFile.readLine()) != null)
		{
			String[] seporatedLine = lineFromFile.split("	");
			ArrayList<String> placeHolder = new ArrayList<String>();
			for (String word : seporatedLine)
			{
				placeHolder.add(word);
			}
			mainDir.add(placeHolder);
		}
		inputFile.close();
		printMainDir(mainDir);
		System.out.println(mainDir.get(3).get(1));
	}

	private static void printMainDir(ArrayList<ArrayList<String>> mainDir)
	{
		for (ArrayList<String> l : mainDir)
		{
			for(String s:l)
			{
				System.out.print(s+ "	");
			}
			System.out.println();
		}
	}
}
