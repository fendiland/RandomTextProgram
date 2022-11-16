
/**
 * Write a description of class MarkovRunner here.
 * 
 * @author Duke Software
 * @version 1.0
 */

import edu.duke.*;

public class MarkovRunner {
    public void runMarkovZero() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovZero markov = new MarkovZero();
        //markov.setRandom(100);
        markov.setTraining(st);
        markov.setRandom(1024);
        for(int k=0; k < 3; k++){
            //markov.setRandom(1024);
            String text = markov.getRandomText(500);
            printOut(text);
        }
    }
    
    public void runMarkovOne() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        //st = "this is a test yes this is a test";
        MarkovOne markov = new MarkovOne();
        //System.out.println(markov.getFollows("t"));
        
        
        markov.setTraining(st);
        markov.setRandom(365);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(200);
            printOut(text);
        }
    }
    
    public void runMarkovModel() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovModel mm = new MarkovModel(7);
        mm.setTraining(st);
        mm.setRandom(953);
        for(int k=0; k < 3; k++){
            String text = mm.getRandomText(500);
            printOut(text);
        }
    }
    
    public void runMarkovFour() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        //st = "this is a test yes this is a test";
        MarkovFour markov = new MarkovFour();
        //System.out.println(markov.getFollows("t"));
        
        
        markov.setTraining(st);
        markov.setRandom(715);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(500);
            printOut(text);
        }
    }
    
   
    
    private void printOut(String s){
        String[] words = s.split("\\s+");
        int psize = 0;
        System.out.println("----------------------------------");
        for(int k=0; k < words.length; k++){
            System.out.print(words[k]+ " ");
            psize += words[k].length() + 1;
            if (psize > 60) {
                System.out.println();
                psize = 0;
            }
        }
        System.out.println("\n----------------------------------");
    }
	
}
