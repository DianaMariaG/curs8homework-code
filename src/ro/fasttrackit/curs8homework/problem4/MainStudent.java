package ro.fasttrackit.curs8homework.problem4;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Carla", 2);
        Student student2 = new Student("Sara", 2);
        Student student3 = new Student("Alex",5);

        System.out.println(Student.generalAverage());

    }

}
