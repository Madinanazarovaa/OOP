package Lesson2.task1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public int getLength() {
        return 0;

    }

    @Override
    public int getHight() {
        return height;
    }
    
}
