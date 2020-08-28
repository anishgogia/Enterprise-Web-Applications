
import java.io.*;
import java.util.*;
public class SpellChecker {

	public static void main(String[] args) {
		String line;
		try {
		    InputStream fis = new FileInputStream("D:\\eclipseworkspace\\reverseno\\src\\dictionary.txt");
		    InputStreamReader isr = new InputStreamReader(fis);
		    BufferedReader br = new BufferedReader(isr);
	    	Set<String> dictionary = new HashSet<String>(); // Dictionary Set
		    while ((line = br.readLine()) != null) {
		    		dictionary.add(line);
		    }
		    
		    InputStream fis2 = new FileInputStream("D:\\eclipseworkspace\\reverseno\\src\\words.txt");
		    InputStreamReader isr2 = new InputStreamReader(fis2);
		    BufferedReader br2 = new BufferedReader(isr2);
		    Set<String> userwords = new HashSet<String>();
		    while ((line = br2.readLine()) != null) {
		    	userwords.add(line);
		    }
		    
		    userwords.removeAll(dictionary);
		    System.out.println("Misspelt Words are : "
                    + userwords);
	    }	    
		catch(Exception ex) {
			System.out.println("some error occured while reading file");
		}
	}
}
