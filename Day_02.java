class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Day_02 {
    public static void main(String[] args) {
        MyEmployee rohan = new MyEmployee();
        rohan.setName("Parvez");
        System.out.println(rohan.getName());
        rohan.setId(234);
        System.out.println(rohan.getId());
    }
}
