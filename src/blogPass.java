import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;

import java.io.IOException;

public class blogPass
{
  static String blogPasser(String blog)
    throws ClassCastException, ClassNotFoundException, IOException
  {
    String serializedClassifier = "classifiers\\english.all.3class.distsim.crf.ser";
    
    //CHANGE DIRECTORY TO WHERE THE CLASSIFIER FILE IS AND USE \\ FOR EVERY \
    
    
    AbstractSequenceClassifier<CoreLabel> classifier = CRFClassifier.getClassifier(serializedClassifier);
    
    return classifier.classifyToString(blog, "tsv", true);
  }
}
