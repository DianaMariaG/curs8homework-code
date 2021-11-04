package ro.fasttrackit.curs8homework.problem4;

public class Student {
    static double SUM = 0;
    static int COUNT = 0;

    private String name;
    private int grade;

    public Student(String name, int grade){ //constructor
        this.name = name;
        this.grade = (grade <=10 && grade>0) ? grade : 1;
        COUNT++;
        SUM = SUM + this.grade;
    }

    public String getName(){
        return this.name;
    }

    public int getGrade(){
        return this.grade;
    }

    public static double generalAverage(){
        double average = SUM/COUNT;
        return average;
    }

}
