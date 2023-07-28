package org.example.main.StudentModel;

public class Student {
    private String name;
    private String lastname;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override public String toString()
    {

        // Returning the record
        return "Records{"
                + "id="   + id
                + "name=" + name + ", last-name" + lastname
                + ", age=" + age + '}';
    }
}
