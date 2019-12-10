public class Factory extends Thread {

    Colors color;
    Storage store =new Storage();



    public Factory(Colors color) {
        this.color = color;

    }

    @Override
    public void run() {
        try {
           Thread.sleep((long)(3000+Math.random() * (8000-3000)));
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        store.addBalloon(producedBallon());

    }

    public Balloon producedBallon(){
//        try {
//            Thread.sleep((long)(3000+Math.random() * (8000-3000)));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            Thread.sleep((long)(Math.random() * (100)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Balloon(color);
    }

}

