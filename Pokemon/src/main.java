public class main {
    public static void main(String[] args){
        Student s1 = new Student(100);
        Student s2 = new Student(200);
        System.out.println("1. " + s1 + "\n2. " + s2);
        swap(s1, s2);
        System.out.println("1. " + s1 + "\n2. " + s2);
    }
    public static void swap(Student one, Student two){
        int temp = one.gNum();
        one.sNum(two.gNum());
        two.sNum(temp);
    }
}

