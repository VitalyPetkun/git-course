public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("hello" + s.getName());
        System.out.println("Age " + s.getAge());
        s.setAge("30");
        System.out.println("Age " + s.getAge());
    }
}
