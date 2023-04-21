package Lesson2.task1;

public class Human implements Runner{

    private String name;
    private int maxRun;
    private int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Human(String name, int maxRun, int mavJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = mavJump;
    }
    
}
