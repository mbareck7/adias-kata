public class Main{

    public static void main(String[] args) {

        FileReader fr = new FileReader("inputs.txt");
        System.out.println(fr.extractPosition(fr.getFirstLine()).toString());

        fr.read();
    }
}