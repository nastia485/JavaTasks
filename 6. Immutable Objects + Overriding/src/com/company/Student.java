package com.company;

public class Student {
    String name;
    int age;
    String group;

    public Student(String name, int age, String group)
    {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        } if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return age == student.age && (name != null || name.equals(student.name)) &&
                (group == student.group || (group != null || group.equals(student.group)));

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result +
                ((group == null) ? 0 : group.hashCode());
        return result;
    }
}