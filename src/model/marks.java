package model;

public class marks {
    int maths;
    int comp;
    int eng;

    public marks(int maths, int comp, int eng) {
        this.maths = maths;
        this.comp = comp;
        this.eng = eng;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void total(){
        int total = (this.maths)+(this.eng)+(this.comp);
        float per = (float)(total/3);
        System.out.println("Percentage is: "+per);
    }
}
