public class Main{

    public static void main(String[] args) {

        Position d = new Position(5,5,"x");
        
        Mower m1 = new Mower();
        Mower m2 = new Mower();


        //test
        Position cp1 = new Position(1,2,"N");
        Position cp2 = new Position(3,3,"E");
        String path1 = "GAGAGAGAA";
        String path2 = "AADAADADDA";

        
        m1.setCp(cp1);
        m2.setCp(cp2);

        Position res1 = m1.move(path1);
        Position res2 = m2.move(path2);

        System.out.println(res1.toString());
        System.out.println(res2.toString());
    }

}