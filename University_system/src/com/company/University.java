package com.company;

import java.util.List;

public class University {

    /** I can use  private Teacher teacher1,teacher2,...;
     * but it is not optimal so... I shall use an array
     *  private Teacher[] teacher;
     *  private Student[] student;
     *but I don't know the exact number(length) for the arrays so...
     * I have selected to use (Array)List
     */
    private List<Teacher> teachers;
    private List<Student> students;
    //private int totalBalanceAccount;
    private static float totalBalanceGain;
    private static float totalBalancePaid;


    /**
     * universiy object creation
     * @param teachers: list of all teachers of the faculty
     * @param students: list of all students of the faculty
     */
    public University(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalBalanceGain=0;
        totalBalancePaid=0;
    }

    //return the list of all teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //add 1 new teacher
    public void setTeachers(Teacher teacher) {
        teachers.add(teacher); //[teacher1,...,teacheradd...]
    }

    //return the list of all students
    public List<Student> getStudents() {
        return students;
    }

    //add 1 new student
    public void setStudents(Student student) {
        students.add(student); //[student1,...,studentadd...]
    }

    //return total money earned
    public float getTotalBalanceGain() {
        return totalBalanceGain;
    }

    //change=adds the money to be gained (earned)
    public static void setTotalBalanceGain(float BalanceGain) {
        totalBalanceGain += BalanceGain;
    }


      //return total expenses of the faculty
    public float getTotalBalancePaid() {
        return totalBalancePaid;
    }

    //change total expenses of the faculty for salaries
    public static void setTotalBalancePaid(float BalancePaid) {
        totalBalancePaid -= BalancePaid; //money spent for salaries...


    }


}
