package Student;

public class TestStudent {
//        public static void main(String[] args) {
//        Student student1 = new Student();
//        System.out.println(student1.setName("Phuoc"));
//        System.out.println(student1.setClasses("C03"));
//    }
void method(int[] x) {
    x[0] = 5;
    x[1] = 5;
}

    public static void main(String[] args) {
        TestStudent o = new TestStudent();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
