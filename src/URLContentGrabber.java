import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class URLContentGrabber
{
  public static String contentgrab(URL u)
    throws IOException
  {
    String hello = null;
    URLConnection ec = u.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(ec.getInputStream(), "UTF-8"));
    StringBuilder a = new StringBuilder();
    while (in.readLine() != null) {
      a.append(in.readLine());
    }
    hello = a.toString();
    in.close();
    return Jsoup.parse(hello).body().text();
  }
  
  public static void main(String[] args)
    throws IOException
  {}
}
