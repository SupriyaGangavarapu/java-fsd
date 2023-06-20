package project1;

public class Constructor {
    private int value;
    public Constructor() {
        value = 0; // Set default value
    }
    public Constructor(int value) {
        this.value = value; // Set value from parameter
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(); 
        Constructor obj2 = new Constructor(7); 
        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}
