package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Teacher Alekos = new Teacher("Alexandros", 1, 1112.34f, 44);
        Teacher Maria = new Teacher("Marianthi", 2, 1000, 35);
        Teacher Babis = new Teacher("Xaralambos", 1, 700, 28);
        Teacher Nikos = new Teacher("Nikolas", 1, 700, 28);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Alekos);
        teacherList.add(Maria);
        teacherList.add(Babis);


        Student Panagiotis = new Student("Panos", 1, 2);
        Student Makis = new Student("Papakis", 2, 5);
        Student Anna = new Student("Annita", 3, 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Panagiotis);
        studentList.add(Makis);
        studentList.add(Anna);


        University duthprivate = new University(teacherList, studentList);

        //===========================================================================//
        //to add a teacher to a new university
        Teacher Antonis = new Teacher("Antoine", 45, 2100, 59);
        duthprivate.setTeachers(Antonis);
        //to add a teacher to a new university
        Student Fanula = new Student("Fani", 3333, 4);
        duthprivate.setStudents(Fanula);
        //===========================================================================//


        System.out.println("To DUTH private university εχει στο λογαριασμο διχως " +
                "τα διδακτρα των μαθηματων:" +
                duthprivate.getTotalBalanceGain() + "$");

        Panagiotis.paidTuition(1466.54f);
        Makis.paidTuition(1000f);
        Anna.paidTuition(2234.545f);

        System.out.println("To DUTH private university εχει στο λογαριασμο " +
                "aπό τις εγγραφες μαθητων:" +
                duthprivate.getTotalBalanceGain() + "$");


        Alekos.paySalary(Alekos.getSalary());
        Maria.paySalary(Maria.getSalary());
        Babis.paySalary(Babis.getSalary());

        System.out.println("O καθηγητης Αλεκος πληρωθηκε μισθο:"+Alekos.getSalary()+"$");
        System.out.println("Η καθηγητρια Maria πληρωθηκε μισθο:"+Maria.getSalary()+"$");
        System.out.println("O καθηγητης Mπαμπης πληρωθηκε μισθο:"+Babis.getSalary()+"$");


        System.out.println("To DUTH private university εχει τελικα στο λογαριασμο του," +
                "μετα την πληρωμη των καθηγητων:" +
                Math.abs(duthprivate.getTotalBalancePaid()) + "$");

        System.out.println("\n\n=====//=====\nTeacher Objects:");
        System.out.println(Alekos);
        System.out.println(Maria);
        System.out.println(Babis);
        System.out.println(Nikos); //salary 0 -> no execution of:  Nikos.paySalary(Nikos.getSalary());
        //System.out.println(Antonis);

        System.out.println("=====//=====\nStudent Objects:");
        System.out.println(Panagiotis);
        System.out.println(Makis);
        System.out.println(Anna);
        //System.out.println(Fanula);
    }


}
