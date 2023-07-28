public class Threadtesting {
    public static void main(String[] args) {
        One t1=new One("t1");
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("Hi I am Runnable ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();

    }

}
class One extends Thread{
    String name;

    public One(String name) {
        this.name = name;
    }

    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hi I am Thread "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}