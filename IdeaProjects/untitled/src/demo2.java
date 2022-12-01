public class demo2 {
    public static void main(String[] args) {
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

           for(int i=0;i<10;i++){
               System.out.println("hey"+i);
               try {
                   Thread.sleep(100);
               }catch(InterruptedException e){
                e.printStackTrace();
               }
           }
            }
        });
        t3.start();
    }
}
