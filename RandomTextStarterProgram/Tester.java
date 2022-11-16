
/**
 * Write a description of Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;
import java.util.Random;
public class Tester {

    public void testGetFollows() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        MarkovOne markov = new MarkovOne();
        //String st = "this is a test yes this is a test";
        st = st.replace('\n', ' ');
        markov.setTraining(st);
        ArrayList<String>follows = markov.getFollows("he");
        System.out.println(follows);
        System.out.println(follows.size());
    }
}
