import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Storage  {

   ArrayList<Balloon> balloons=new ArrayList<>(99);


    // method to take balloon from balloons list

    public Storage() {

        //this.balloons = new ArrayList<>();
    }



    public boolean addBalloon(Balloon balloon){
        if (!isFull()){
            balloons.add(balloon);
            return true;
        } else {
            return false;
        }

    }
    public Balloon popBalloon(){
        return balloons.remove(balloons.size()-1);

    }
    public boolean isFull(){
        if(balloons.size() == 99){
            return true;
        }
        else {
            return false;
        }
    }


    public Balloon getBalloon(){
        for (ListIterator<Balloon> it = balloons.listIterator(); it.hasNext(); ) {
            Balloon balloon = it.next();
            return balloon;
        }
        return null;
    }


    @Override
    public String toString() {
        return "balloons list size " + balloons.size();

    }
    public int size(){
        return balloons.size();
    }
}
