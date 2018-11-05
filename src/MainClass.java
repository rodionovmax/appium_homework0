public class MainClass {

    int number = 14;
    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getLocalNumber(int number){
        return number;
    }

    public int getClassNumber(){
        return this.class_number;
    }

    public String getClassString(){
        return this.class_string;
    }
}
