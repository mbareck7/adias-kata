public class Position {
    int x;
    int y;
    String o; // (N,E,W,S)

    public Position() {
    }

    public Position(int x, int y, String o) {
        this.x = x;
        this.y = y;
        this.o = o;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getO() {
        return this.o;
    }

    public void setO(String o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + o ;
    }
}