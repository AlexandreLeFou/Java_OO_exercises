package com.company;
/** this class is responsible for students information and balance account
 * it shall interact with the following
 * 5 attributes: name, stcardId, grade, paidTuition, totalTuition
 */
public class Student {
    //private:as I don't want to  outside student class for someone to
    // see(protect) student's info
    private String name;
    private int id;
    private int grade;
    private float paidTuition;

    //InteliJ /**+Enter
    /** I initialize student object!
     * @param id : student id (registration number)
     * @param name : student's name
     * @param grade: student's grade
     * @param paidTuition:  $ student paided
     */

    public Student(String name, int id, int grade) {
        this.paidTuition = 0; //initially 0 $ paid
        this.name = name;
        this.id = id;
        this.grade = grade;
    }


    //in order to update the value of student's grade
       public void setGrade(int grade) {
        this.grade = grade;
    }


    //return student's name
    public String getName() {
        return name;
    }

    //return student's id
    public int getId() {
        return id;
    }

    //return student's id
    public float getGrade() {
        return grade;
    }

    //return student's paid tuition
    public float getPaidTuition() {
        return paidTuition;
    }



    public void paidTuition(float tuitionFees){
        paidTuition += tuitionFees;
        University.setTotalBalanceGain(paidTuition);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", paidTuition=" + paidTuition +
                '}';
    }
}
