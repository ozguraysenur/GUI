import java.awt.*;

public class Main extends Frame {
    Drawable[] db;
    int count;
    private final static Object flag = new Object();


    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        db = new Drawable[100];
        count = 0;
        // Frame frame= new Frame();
        // Panel panel =new Panel();
        setBackground(Color.PINK);
        setSize(1600, 850);
        setVisible(true);

        Factory f1 = new Factory(Colors.RED);
        Factory f2 = new Factory(Colors.BLUE);
        Factory f3 = new Factory(Colors.PURPLE);

        Storage depo = new Storage();

        /*while(true) {
            if (depo.isFull() == true) {
                // while(depo.size()==0) {
                // panel.add(depo.getBalloon());
                //depo.getBalloon();
                frame.add(depo.popBalloon());
                //frame.add(panel);
                // }
                break;
            }*/
        // depo.addBalloon(f1.producedBallon());
        //depo.addBalloon(f2.producedBallon());

            /*new Thread(()-> {
                synchronized (flag) {
                    while (!depo.isFull()) {
                        depo.balloons.add(f1.producedBallon());
                       *//* depo.addBalloon(f2.producedBallon());
                        depo.addBalloon(f3.producedBallon());*//*
                    }
                }
            }
            ).start();*/

        while(!depo.isFull()){

            //f1.start();
            //f2.start();
            //f3.start();
                depo.addBalloon(f1.producedBallon());
                depo.addBalloon(f2.producedBallon());
                depo.addBalloon(f3.producedBallon());



        }



//        new Thread(() -> {
//            while (depo.balloons.size() <= 10) {
//                synchronized (flag) {
//                    Thread one = new Thread(
//                            String.valueOf(depo.balloons.add(new Factory(Colors.RED).producedBallon()))
//                    );
//                    one.start();
//                    Thread two = new Thread(
//                            String.valueOf(depo.balloons.add(new Factory(Colors.PURPLE).producedBallon()))
//                    );
//                    two.start();
//                    Thread three = new Thread(
//                            String.valueOf(depo.balloons.add(new Factory(Colors.GREEN).producedBallon()))
//                    );
//                    three.start();
//                }
//            }
//        }).start();
        if(depo.isFull()) {

            while (depo.size() != 0) {
                add(depo.popBalloon());

            }
        }

            /*while (depo.balloons.size() != 0) {
                try {
                    Thread.sleep(50);
                    for (int i = 1; i <= depo.balloons.size(); i++) {
                        add(depo.getBalloon());
                        depo.balloons.remove(i - 1);
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/

        new Thread(() -> {
          while (true) {

               repaint();
                try {
                   Thread.sleep(60);
               } catch (InterruptedException e) {
                    e.printStackTrace();
               }
           }
      }).start();


        System.out.println(depo.toString());


       /* if (depo.getBalloon().getColor() != Colors.RED) {
            depo.popBalloon();

        }*/

    }

    public void add(Drawable d) {
        db[count++] = d;
    }

    public void paint(Graphics g) {
        for (int i = 0; i < count; i++) {
          //  System.out.println(db[i]);
            db[i].draw(g);

        }
    }
}