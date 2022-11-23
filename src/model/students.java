package model;

public class students {
    String name;
    int age;
    int grade;

    public students(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void std_info(){
        System.out.println("Name     Class   Age");
        System.out.println(this.name+"       "+this.grade+"     "+this.age);
    }
}
