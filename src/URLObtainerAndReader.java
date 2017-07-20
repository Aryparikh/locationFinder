
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import jdk.nashorn.api.scripting.URLReader;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class URLObtainerAndReader
{
  public static void main(String[] args) throws Exception
  {
	
	  
  }
  

  public static void ObtainURL(String a)
    throws IOException, UnsupportedEncodingException, ClassNotFoundException
  {
    String google = "http://www.google.com/search?q=";
    String search = a;
    String charset = "UTF-8";
    String userAgent = "ExampleBot 1.0 (+http://example.com//bot)";
    
    Elements links = Jsoup.connect(google + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select(".g>.r>a");
    String buff = new String("");
    URL[] urls = new URL[10];
    int i=0,urlcount = 0;
    for (Element link : links)
    {
      String urlstring = link.absUrl("href");
      urlstring = URLDecoder.decode(urlstring.substring(urlstring.indexOf('=') + 1, urlstring.indexOf('&')), "UTF-8");
      URL u= new URL(urlstring);
      
      if (urlstring.startsWith("http"))
      {
        urls[i]= u;
        urlcount++;
        i++;
      }
    }
    
    //urls is an array of urls which contains the urls. baws.
   
    URLrdr(urls);
  }
  public static void URLrdr(URL[] urls) throws ClassCastException, ClassNotFoundException, IOException
  {
	  
	  
    //ArrayList<URL> links = new ArrayList();
    //links = MySQLConnector2.getURLlist(urlcount);
      int i = 0;
      ArrayList<String> a = new ArrayList<String>();
    do
    {
      try
      {
        URL temp = urls[i];
        String buf = URLContentGrabber.contentgrab(temp);
        // Here is the unparsed blog content.
        String buff = ContentURLExtractor.urlextractor(buf);
        
        String qwert = blogPass.blogPasser(buff);
        a = LocTable.Tabulator(qwert);
        
        //Add qwert to location array and finally in the end print the location array

        System.out.println(" \n BLOG " + i + " COMPLETE");
        System.out.println("***********************************************");
      }
      catch (IOException localIOException) {}
      i++;
    } while(i < urls.length);
    
/*System.out.println("The list of parsed locations is : \n");

for (int j = 0; j < a.size(); j++) {
	    	
	    	String b = a.get(j);
	    	System.out.println(b);
	    
	    }
*/ 
    
    /*PARSED LOCATIONS STORED IN ARRAYLIST<STRING> FIN OR A OR WHATEVER*/

    
  }
}