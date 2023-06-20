package project1;

public class ClassA {
    private int a;
    public class ClassB {
        public void display() {
            a= 10; 
            System.out.println("Inner method called");
            System.out.println("value: " + a);
        }
    }

    public static void main(String[] args) {
        ClassA obj= new ClassA();
        ClassB innerObj = obj.new ClassB();
        innerObj.display();
    }
}
