package Lesson2.task1;

public class Cat implements Runner{

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

    public Cat(String name, int maxRun, int mavJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = mavJump;
    }

    /*@Override
    public boolean jump(int height) {
        if (height  <= maxJump){
            System.out.printf("%s успешно перепрыгнул через стену %d м. \n", name, height);
            return true;
        } else{
            System.out.printf("%s не смог перепрыгнуть через стену %d м. Остался на месте \n", name, height);
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if (distance  <= maxRun){
            System.out.printf("%s успешно пробежал по дорожке %d м. \n", name, distance);
            return true;
        } else{
            System.out.printf("%s не смог пробежать по дорожке %d м. Остался на месте \n", name, distance);
            return false;
        }
    
    
    } */
}
