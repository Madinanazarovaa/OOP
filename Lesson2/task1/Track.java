package Lesson2.task1;

public class Track implements Obstacle{

    private int length;

    public Track(int length){
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;

    }

    @Override
    public int getHight() {
        return 0;
    }
    
}
