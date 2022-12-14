// Java Program to Illustrate reading from

// FileReader using FileReader class

// Importing input output classes
import java.io.FileReader;
import java.io.IOException;

public class PreCommit {
	public static void main(String[] args) throws IOException {

		// Passing the path to the file as a parameter
		FileReader fr = new FileReader(args[0]);

		StringBuilder commitMessage = new StringBuilder();
	
		int i;
		while ((i = fr.read()) != -1)
			commitMessage.append((char)i);

		System.out.print(commitMessage);


    if (commitMessage.length() > 10){
      System.out.print("Commit effectué !");
    } else {
      System.out.print("Le messsag de commit doit contenir au moins 10 caracteres !");
      System.exit(0);
    }
	}
}