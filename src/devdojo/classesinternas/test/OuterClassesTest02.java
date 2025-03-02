package devdojo.classesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(){
        String lastName = "Shounen";

        class LocalClass{
            public void print(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().print();
    }

    public static void main(String[] args) {
        OuterClassesTest02 test = new OuterClassesTest02();
        test.print();
    }
}
