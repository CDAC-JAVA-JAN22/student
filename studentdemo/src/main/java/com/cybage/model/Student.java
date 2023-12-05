package com.cybage.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int roll_no;

    public int getId() {
        return id;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public void Student(){
        super();
    }

    public Student(int id, int roll_no, String name){
        super();
        this.id=id;
        this.roll_no=roll_no;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", roll_number=" + roll_no + ", name=" + name "]";
    }
}