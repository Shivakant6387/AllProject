    class Runners implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("Hey mishra"+i);
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
public class imp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runners());
        Thread t2 = new Thread(new Runners());
        t1.start();
        t2.start();
    }
}
