// Java Program to Illustrate reading from

// FileReader using FileReader class

// Importing input output classes
import java.io.FileReader;
import java.io.IOException;

public class CommitMsg {
	public static void main(String[] args) throws IOException {

		// Passing the path to the file as a parameter
		FileReader fr = new FileReader(args[0]);

		StringBuilder commitMessage = new StringBuilder();
	
		int i;
		while ((i = fr.read()) != -1)
			commitMessage.append((char)i);

    if (commitMessage.length() > 10){
      System.out.print("Commit effectué !");
	  System.exit(0);
    } else {
      System.out.print("[ERREUR]: Le messsage de commit doit contenir au moins 10 caracteres !");
      System.exit(1);
    }
	}
}