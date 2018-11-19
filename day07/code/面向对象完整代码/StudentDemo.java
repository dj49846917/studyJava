public class StudentDemo{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getMame()+"----"+s.getAge());
        s.setName("清晰");
        s.setAge(20);
        System.out.println(s.getMame()+"----"+s.getAge());
    }
}