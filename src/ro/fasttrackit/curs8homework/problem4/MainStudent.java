package ro.fasttrackit.curs8homework.problem4;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Carla", 10);
        Student student2 = new Student("Sara", 15);
        Student student3 = new Student("Alex",5);

        System.out.println(Student.generalAverage());

        System.out.println(student1.getName());
        System.out.println(student2.getGrade());
        System.out.println(student3.getName() + " a luat nota " + student3.getGrade());

    }

}
