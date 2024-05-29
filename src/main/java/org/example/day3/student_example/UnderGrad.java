package org.example.day3.student_example;

public class UnderGrad extends Student {
    public UnderGrad()    //default constructor
    {
        super();
    }

    //constructor
    public UnderGrad(String studName, int[] studTests, String studGrade) {
        super(studName, studTests, studGrade);
    }

    public void computeGrade() {
        if (getTestAverage() >= 70) {
            if (getTestAverage() >= 70)
                setGrade("Pass");
            else
                setGrade("Fail");
        }
    }
}