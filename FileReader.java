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



  public Position getTopPosition(String firstline){
    char x1 =  firstline.charAt(0);
    char y1 = firstline.charAt(2);

    String x = x1 + "";
    String y = y1 + "";

    return new Position(Integer.parseInt(x),Integer.parseInt(y),"");
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

      // File myObj = new File(this.fileName);
      // Scanner myReader = new Scanner(myObj);

      while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        System.out.println(data);
      }
      scanner.close();

  }
}
