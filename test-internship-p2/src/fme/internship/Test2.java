/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads text from a file and prints out the third most frequent word(s)
 * in the text. If there is more than one word they will all be printed. 
 * 
 * The text contains only alpha-numerical characters and spaces, 
 * and words are delimited by one or more spaces.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input: test.in
 *      
 *       test1 test2 test3 test1 test test2 test2
 *       test1 test3 test1 test test0
 *       
 *  Output:
 *      test3, test
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


/**
 * 
 * @author <Tocaciu Ioana>
 * @email <tocaciu_ioana@yahoo.com>
 * 
 */
public class Test2 {

    public static void main(String[] args)
            throws Exception
    {
        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        //Opens file in read mode
        FileReader file = new FileReader("C:\\Users\\tocac\\Desktop\\fme\\fme-internship-2022\\test-internship-p2\\src\\test.in");
        BufferedReader br = new BufferedReader(file);

        //Reads each line
        while((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().split(" ");
            //Adding all words generated in previous step into words
            for(String s : string){
                words.add(s);
            }
        }
        //Determine the most repeated word in a file
        for(int i = 0; i < words.size(); i++){
            count = 1;
            //Count each word in the file and store it in variable count
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            //If maxCount is less than count then store value of count in maxCount
            //and corresponding word to variable word
            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }

        System.out.println("Most repeated word: " + word);
        br.close();
    }
}
