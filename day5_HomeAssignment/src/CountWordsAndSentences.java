import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsAndSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr=new  FileReader("data.txt");
			BufferedReader br=new BufferedReader(fr);

			String line="";
			int lCount=0,wCount=0;
			while((line=br.readLine())!=null)
			{
			  String s[]=line.split(" ");
			  wCount=wCount+s.length;
			  lCount++;
			  }
			System.out.println("no. of lines= "+lCount);
			System.out.println("no. of words= "+wCount);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
