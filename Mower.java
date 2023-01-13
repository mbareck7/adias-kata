public class Mower {
    Position cp; // Current position
    
    public  Position move(String path, Position topPosition){
        Position resetPosition = this.cp;
        for (char O: path.toCharArray()) {
            switch(O + "") {
                case "D":
                  turnD();
                  break;
                case "G":
                  turnG();
                  break;
                case "A":
                  step(cp.getO());
                  break;
                default:
                    break;
              }     
        }
        if(cp.getX() > topPosition.getX() || cp.getY() > topPosition.getY() || cp.getX() < 0 || cp.getY() < 0){
            this.cp = resetPosition;
        }
        return this.cp;
    }

    public void turnD(){
        switch (cp.getO()) {
            case "N":
                cp.setO("E");
                break;
            case "E":
                cp.setO("S");
                break;
            case "S":
                cp.setO("W");
                break;
            case "W":
                cp.setO("N");
                break;
            default:
                break;
        }
    }

    public void turnG(){
        switch (cp.getO()) {
            case "N":
                cp.setO("W");
                break;
            case "E":
                cp.setO("N");
                break;
            case "S":
                cp.setO("E");
                break;
            case "W":
                cp.setO("S");
                break;
            default:
                break;
        }
    }

    public Position step(String O){//O="A"
        switch (O) {
            case "N":
                cp.setY(cp.getY()+1);
                break;
            case "E":
                cp.setX(cp.getX()+1);
                break;
            case "S":
                cp.setY(cp.getY()-1);
                break;
            case "W":
                cp.setX(cp.getX()-1);
                break;
            default:
                break;
        }
        return this.cp;
    }

    public Mower() {}

    public Mower(Position cp) {
        this.cp = cp;
    }

    public Position getCp() {
        return this.cp;
    }

    public void setCp(Position cp) {
        this.cp = cp;
    }
}
