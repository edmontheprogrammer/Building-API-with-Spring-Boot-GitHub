package com.example.demo.student;

import java.time.LocalDate;

/*
    * This is the database model
    * "Student" is the name of the table
    * that will be stored inside the PostgreSQL database that we will create in the
    * PostgreSQL Server.
    * "id", "name", "email", "dob (date of birth)", and "age" are the names
    * of the columns for the "Student" table.
    *
 */
// The database we create will store a table name "Student"
public class Student {

    // names of columns for the "Student" table
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    // Creating the default constructor for the "Student" class
    public Student() {
    }

    // Creating a full constructor, constructor with all the class fields in the
    // "Student" class,
    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Creating a constrcutor without the "id" field because PostgreSQL database
    // will generate the "id" for us via AUTO INCREMENT, also "id" field will be the
    // PRIMARY KEY for the "Student" table so best practice stated that let the
    // RDBMS manage and handle the creation of the "id" field for database tables.
    public Student(String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // OOP requires encapsulation or bundling data, fields and methods inside a
    // class as a one unit or one object. Therefore, we are creating getters and
    // setters methods to help us get the values of the class fields and set the
    // values of class fields using methods. This is best practice for OOP
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /*
        * What is toString()?
        * A toString() is an in-built method in Java that returns the value
        * given to it in string format. Hence, any object that this method is
        * applied on, will then be returned as a string object.
        * Remember that we have primitive data types and reference data types
        * in Java. Some data type return an interable or memory address when we
        * try to access them which aren't useful for us human when reading such
        * data. Therefore, we added "toString()" method here to gives us a string
        * repersentation for each data type to make is simple for us developers
        * and users of the applications to read and work with the data. This is
        * the purpose of the "toString()" method in this class
        *
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
