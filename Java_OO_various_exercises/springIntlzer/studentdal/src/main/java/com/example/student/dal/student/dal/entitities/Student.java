package com.example.student.dal.student.dal.entitities;

import javax.persistence.*;

@Entity
@Table(name="studenttab")//differnet name in the db's table
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autonicrement id in the mysql db
    private long id;
    @Column(name="sname") //differnet name in the db field
    private String name;
    @Column(name="scourse")
    private String course;
    @Column(name="sfee")
    private double fee;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


//generate toString so as to display the entitty via sout
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }
}

