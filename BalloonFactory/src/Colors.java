import java.util.Random;
public enum Colors   {
    RED(255,0,0),
    ORANGE(255,102,0),
    YELLOW(255,259,0),
    GREEN(77,255,0),
    BLUE(0,222,255),
    DARKBLUE(0,111,255),
    DARKPURPLE(196,0,255),
    PINK(255,0,205),
    PURPLE(179,0,255),
    LIGHTBLUE(0,255,247),
    DARKGREEN(17,137,13),
    LIGHTPINK(247,158,227),
    LIGHTYELLOW(255,231,172),
    PEACH(243,116,116),
    OTHERGREEN(23,193,34),
    DARKPINK(161,21,114);

    private int r;
    private int g;
    private int b;

    Colors(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

//    public static Colors randomColors(){
//        int number = new Random().nextInt(Colors.values().length);
//        return Colors.values()[number];
//
//    }
}
