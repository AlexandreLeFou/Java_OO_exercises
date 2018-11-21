package com.company;
/**this class is responsible for teachers information and balance account
 * it shall interact with the following:
 * 4 attributes: name, tcardId, salary, age
 */
public class Teacher {
    private String name;
    private int id;
    private float salary;
    private int age;
    private float salaryEarned;
    /**
     *
     * @param name: teacher's name
     * @param id: unique id card of the teacher
     * @param salary: annual salary
     * @param age: teacher's age
     */
    public Teacher(String name, int id, float salary, int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salaryEarned=0; //when teacher created he has 0 salary
        this.age = age;
    }

    //return teacher's name
    public String getName() {
        return name;
    }

    //return teacher's id
    public int getId() {
        return id;
    }

    //return teacher's salary
    public float getSalary() {
        return salary;
    }

    //change teacher's salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    //return teacher's age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** adds to the salary the total amount
     * substracts from university's balance the teachers' salary
     * @param salary
     */
    public void paySalary(float salary){
        salaryEarned += salary;
        University.setTotalBalancePaid(salary);
    }
}
