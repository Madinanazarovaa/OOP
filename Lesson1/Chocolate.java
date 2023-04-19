package Lesson1;

public class Chocolate extends Product{
    private String taste;

    public String getTaste(){
        return taste;
    }

    public Chocolate (String name, Double price, String taste){
        super(name, price);
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("%s - %f - %s", name, price, taste);
    }
    
}
