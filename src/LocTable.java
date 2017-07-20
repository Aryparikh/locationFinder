import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class LocTable
{
 
	public static ArrayList<String> Tabulator(String parsed_content)
    throws IOException
  {
    String[] tempo = parsed_content.split("\r\n");
    
    ArrayList<String> fin = new ArrayList<String>();
    
    System.out.println("---------------------------");
    for (int l = 0; l < tempo.length; l++)
    {
      String[] temp = tempo[l].split("\t");
      if ((temp.length == 2) && (temp[1].equals("LOCATION")))
      {
        fin.add(temp[0]);
        System.out.println((String)fin.get(fin.size() - 1));
      }
    }
    System.out.println("---------------------------");
    return fin;
    
  }
  }


