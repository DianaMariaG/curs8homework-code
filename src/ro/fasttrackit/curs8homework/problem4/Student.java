package ro.fasttrackit.curs8homework.problem4;

public class Student {
    static int SUM = 0;
    static int COUNT = 0;

    private String name;
    private int grade;

    public Student(String name, int grade){ //constructor
        this.name = name;
        this.grade = (grade <=10 && grade>0) ? grade : 1;
        COUNT++;
        SUM = SUM + grade;
    }

    public String getName(){
        return this.name;
    }

    public int getGrade(){
        return this.grade;
    }

    public static int generalAverage(){
        int average = SUM/COUNT;
        return average;
    }

}
