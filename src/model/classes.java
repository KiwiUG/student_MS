package model;

public class classes {
    int grade;
    String section;
    int roll_no;

    public classes(int grade, String section, int roll_no) {
        this.grade = grade;
        this.section = section;
        this.roll_no = roll_no;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public void details(){
        System.out.println("Grade: "+(this.grade));
        System.out.println("Section: "+(this.section));
        System.out.println("Roll no: "+(this.roll_no));
    }
}
