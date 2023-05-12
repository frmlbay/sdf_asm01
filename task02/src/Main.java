package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * task 02
 *
 */
public class Main
{
    

    public static void main( String[] args ) throws FileNotFoundException, IOException {

        BufferedReader br1 = new BufferedReader(new FileReader("texts/frost/birches.txt"));
        StringBuilder str1 = new StringBuilder();
        String line1 = null;

        String ls = System.getProperty("line.separator");
        
        while ((line1=br1.readLine()) != null) {
            str1.append(line1);
            str1.append(ls);

        }

        BufferedReader br2 = new BufferedReader(new FileReader("texts/frost/ice_and_fire.txt"));
        StringBuilder str2 = new StringBuilder();
        String line2 = null;
        
        while ((line2=br2.readLine()) != null) {
            str2.append(line2);
            str2.append(ls);

        }

        BufferedReader br3 = new BufferedReader(new FileReader("texts/frost/mending_walls.txt"));
        StringBuilder str3 = new StringBuilder();
        String line3 = null;
        
        while ((line3=br3.readLine()) != null) {
            str3.append(line3);
            str3.append(ls);

        }


        BufferedReader br4 = new BufferedReader(new FileReader("texts/frost/road_not_taken.txt"));
        StringBuilder str4 = new StringBuilder();
        String line4 = null;
        
        while ((line4=br4.readLine()) != null) {
            str4.append(line4);
            str4.append(ls);

        }


        BufferedReader br5 = new BufferedReader(new FileReader("texts/frost/stopping_by_woods_on_a_snowy_evening.txt"));
        StringBuilder str5 = new StringBuilder();
        String line5 = null;
        
        while ((line5=br5.readLine()) != null) {
            str5.append(line5);
            str5.append(ls);

        }

        BufferedReader br6 = new BufferedReader(new FileReader("texts/seuss/cat_in_the_hat.txt"));
        StringBuilder str6 = new StringBuilder();
        String line6 = null;
        
        while ((line6=br6.readLine()) != null) {
            str6.append(line6);
            str6.append(ls);

        }

        BufferedReader br7 = new BufferedReader(new FileReader("texts/seuss/fox_in_socks.txt"));
        StringBuilder str7 = new StringBuilder();
        String line7 = null;
        
        while ((line7=br7.readLine()) != null) {
            str7.append(line7);
            str7.append(ls);

        }

        BufferedReader br8 = new BufferedReader(new FileReader("texts/seuss/happy_birthday_to_you.txt"));
        StringBuilder str8 = new StringBuilder();
        String line8 = null;
        
        while ((line8=br8.readLine()) != null) {
            str8.append(line8);
            str8.append(ls);

        }

        BufferedReader br9 = new BufferedReader(new FileReader("texts/seuss/oh_the_places_youll_go.txt"));
        StringBuilder str9 = new StringBuilder();
        String line9 = null;
        
        while ((line9=br9.readLine()) != null) {
            str9.append(line9);
            str9.append(ls);

        }




        br1.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        br6.close();
        br7.close();
        br8.close();
        br9.close();

        //String content = str1.toString();

        String content = str1.toString() + str2.toString() + str3.toString() + str4.toString() + str5.toString() + str6.toString() + str7.toString() + str8.toString() + str9.toString();
        
        //System.out.println(content);

        String contentrplc = content;

        // contentrplc = contentrplc.replace(',',' ');
        // contentrplc = contentrplc.replace('.',' ');
        // contentrplc = contentrplc.replace('[',' ');
        // contentrplc = contentrplc.replace(']',' ');
        // contentrplc = contentrplc.replace('(',' ');
        // contentrplc = contentrplc.replace(')',' ');
        // contentrplc = contentrplc.replace('!',' ');
        // contentrplc = contentrplc.replace('?',' ');
        // contentrplc = contentrplc.replace('/',' ');
        // contentrplc = contentrplc.replace('{',' ');
        // contentrplc = contentrplc.replace('}',' ');
        // contentrplc = contentrplc.replace('-',' ');
        //contentrplc = contentrplc.replace("\\'",' ');

        //punct remover
        //contentrplc=contentrplc.replaceAll("[^a-zA-Z ]", " ");
        
        //contentrplc = contentrplc.replace("?","");


        contentrplc = contentrplc.replaceAll("\\p{Punct}",""); 
        contentrplc = contentrplc.toLowerCase();

        //whitespace kill
        contentrplc.trim().replaceAll("\\s+", " ");
        //linebreak kill
        contentrplc.replaceAll(System.lineSeparator(), " ");
        //linebreak kill
        contentrplc.replaceAll("\\n", " ");

        System.out.println(contentrplc);

        String[] contentrplcArray = contentrplc.split(" ");

        Map<String, Integer> wordcount = new HashMap<>();

        for (String wrd: contentrplcArray){
            Integer wordExists = wordcount.get(wrd);

            if (wordExists == null) {    
                wordcount.put(wrd, 1);
            } else {
                wordcount.put(wrd, wordExists + 1);
            }

        }

        System.out.println(wordcount);

    }
   

}
