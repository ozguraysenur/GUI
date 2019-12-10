
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Balloon implements Drawable ,ActionListener{



// method returns color of the current balloon

   Timer timer = new Timer(15,this);
    int x;
    int y;
    int width;
    int height;
    int yy =2;
    Colors color;
    Storage storage = new Storage();

    public Balloon(Colors colors) {
        this.color = colors;
        x = (int) (Math.random() * 1600);//frame ne kadarsa
        y = 1500;
        width = 70;
        height=80;
        timer.start();

        //add(balloon);


    }

    public Colors getColor() {
        return color;
    }

//    @Override
//    public void paint(Graphics g ) {
//        super.paint(g);
//
//
//
//    }

//
//    @Override
//   public void repaint() {
//       super.repaint();
//   }


    @Override
    public void actionPerformed(ActionEvent e) {
       y -=yy;
       //repaint();
        if(this.color==Colors.RED){
            if(y==150) {
              y=-300;
               // storage.balloons.remove(this);
            }

        }
        else {
            if (y == 400) {
                y=-300;
                //  storage.popBalloon();
            }

        }


   }


    @Override
    public void draw(Graphics g) {
        Color color = new Color (this.color.getR(), this.color.getG(), this.color.getB());
        g.setColor(color);

        g.fillOval(x,y,width,height);
        g.setColor(Color.black);
        g.drawLine(x+35,y+height,x+(width/2),y+height+150);
       // timer.start();


    }
}
