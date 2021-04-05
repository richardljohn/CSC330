public class Student {
    private int num;

    Student(int n){
        num = n;
    }
    public int gNum(){
        return num;
    }
    public void sNum(int n){
        num = n;
    }

    public String toString(){
        return "Student num: " + gNum();
    }
}
