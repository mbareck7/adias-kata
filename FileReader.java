import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader {

    String fileName;
    File file;
    Scanner scanner;
    
    public FileReader() {

    }

    public FileReader(String fileName) {
            this.fileName = fileName;
        }

  public Position extractPosition(String line){
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

  public String getFirstLine() {
    file = new File(this.fileName);
    try {
      scanner = new Scanner(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    String firstLine = scanner.nextLine();
    return firstLine;
  }


  public void read() {
    String position = "";
    String path;

    Mower m = new Mower();



    while (scanner.hasNextLine()) {
      position = scanner.nextLine();
      path = scanner.nextLine();

      m.setCp(extractPosition(position));

      Position res = m.move(path);
      System.out.println(res.toString());

      // System.out.println("position: " + position);
      // System.out.println("path: " + path);
    }
    scanner.close();
  }

  boolean isEven(int x) {
    return x % 2 == 0;
  }

}
