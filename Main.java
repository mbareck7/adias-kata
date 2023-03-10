import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = Helpers.getScanner("inputs.txt");
        Helpers.deleteFile("outputs.txt");
        Position topPostion = Helpers.extractPosition(scanner.nextLine());
        String position = "";
        String path;
        Mower m = new Mower();

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