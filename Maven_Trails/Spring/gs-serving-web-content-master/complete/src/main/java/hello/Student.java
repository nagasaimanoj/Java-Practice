package hello;

public class Student {
    private int roll;
    private String name;

    public void setRoll(int temp) {
        this.roll = temp;
    }

    public void setName(String temp) {
        this.name = temp;
    }

    public String toString() {
        return this.name + " - " + this.roll;
    }
}