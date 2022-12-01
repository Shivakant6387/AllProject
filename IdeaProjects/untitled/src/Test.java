 class emp{
     private int Id;
     private  String name;

     public void setName(String n){
         name =n;

     }
     public  String getName(){
         return name;
     }
     public void setId(int id) {
         Id = id;
     }
     public int getId(){
         return Id;
     }
 }
public class Test {
    public static void main(String[] args) {
        emp sks = new emp();
        sks.setName("Sakshi");
        System.out.println(sks.getName());
    }

}
