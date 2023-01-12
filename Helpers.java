import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Helpers {

    public static Position extractPosition(String line){
        char x1 =  line.charAt(0);
        char y1 = line.charAt(2);
    
        String x = x1 + "";
        String y = y1 + "";
        String o = "";
        if(line.length() == 5){
          char o1 = line.charAt(4);
          o = o1 + "";
        }
        return new Position(Integer.parseInt(x),Integer.parseInt(y),o);
      }


      public static Scanner getScanner(String filename) {
        File file;
        Scanner scanner = null;
        
        file = new File(filename);
        try {
          scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        return scanner;
      } 
}
