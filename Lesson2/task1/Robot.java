package Lesson2.task1;

public class Robot implements Runner{

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

    public Robot(String name, int maxRun, int mavJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = mavJump;
    }
    
}
