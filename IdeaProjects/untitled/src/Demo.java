class Runner extends Thread{
public void run(){
    for(int i=0; i<10;i++){
        System.out.println("Hey Sakshi"+i);
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
        }
public class Demo {

    public static void main(String[]args){
    Runner Runner1 =new Runner();
    Runner Runner2 =new Runner();
    Runner1.start();
    Runner2.start();
    }
}
