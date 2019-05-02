package com.example.Unit73.builder;

public class Student {

    private String fio;
    private int age;
    private String specialty;
    private int cours;

    private Student() {
    }

    public static class StudentBuilder {

        private String fio;
        private int age;
        private String specialty;
        private int cours;

        public StudentBuilder(String fio) {
            this.fio = fio;
        }

        public StudentBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder withSpeciality(String speciality) {
            this.specialty = speciality;
            return this;
        }

        public StudentBuilder withCourse(int cours) {
            this.cours = cours;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.fio = this.fio;
            student.age = this.age;
            student.specialty = this.specialty;
            student.cours = this.cours;
            return student;
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                ", cours=" + cours +
                '}';
    }
}
