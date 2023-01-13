import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = Helpers.getScanner("inputs.txt");
        Position topPostion = Helpers.extractPosition(scanner.nextLine());

        String position = "";
        String path;
        Mower m = new Mower();



        //delete outpouts.txt if exists
        Helpers.deleteFile("outputs.txt");

        while (scanner.hasNextLine()) {
          position = scanner.nextLine();
          path = scanner.nextLine();
          m.setCp(Helpers.extractPosition(position));
          Position res = m.move(path,topPostion);
          Helpers.writeResult(res.toString());
          System.out.println(res.toString());
        }
        scanner.close();
    }
}