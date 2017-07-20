import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


	public class TheBeginning
	{
	  public static void main(String[] args)
	    throws UnsupportedEncodingException, ClassNotFoundException, IOException
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the keywords for search");
	    String keywords = sc.nextLine();
	    URLObtainerAndReader.ObtainURL(keywords);
	  }
	}


