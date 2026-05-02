class Student {
    int marks;
}

class CallByReferenceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.marks = 80;

        changeMarks(s);

        System.out.println("After method call: " + s.marks);
    }

    static void changeMarks(Student obj) {
        obj.marks = 100;
        System.out.println("Inside method: " + obj.marks);
    }
}