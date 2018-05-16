public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 20, "male", "BME");
        Student student2 = new Student();


        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student2.toString());
    }
}