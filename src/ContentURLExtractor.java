//import MySQLHandler.MySQLConnector2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentURLExtractor
{
  public static String urlextractor(String content)
  {
	
    Pattern linkPattern = Pattern.compile("(<a[^>]+>.+?<\\/a>)", 34);
    
    //This is the Content of a URL
    
    Matcher pageMatcher = linkPattern.matcher(content);
    
    while (pageMatcher.find()){
    return content;
    
    }
	return content;
  }
}


//UNNECESSARY TO PARSE CONTENT BECAUSE MPMPMP