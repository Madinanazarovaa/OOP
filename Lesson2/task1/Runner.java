package Lesson2.task1;

/**
 * Базовый интерфейс - Бегун
 */
public interface Runner {

    String getName();
    int getMaxJump();
    int getMaxRun();


    /**
     * Прыжок
     * @param height высота прыжка
     * @return результат прыжка (удалось перепрыгнуть препядствие или нет)
     */
    default boolean jump(int height) {
        if (height  <= getMaxJump()){
            System.out.printf("%s успешно перепрыгнул через стену %d м. \n", getName(), height);
            return true;
        } else{
            System.out.printf("%s не смог перепрыгнуть через стену %d м. Остался на месте \n", getName(), height);
            return false;
        }
    }

    /**
     * Бег
     * @param distance дистанция
     * @return результат забега (удалось пробежать дистанцию или нет)
     */
    default boolean run(int distance) {
        if (distance  <= getMaxRun()){
            System.out.printf("%s успешно пробежал по дорожке %d м. \n", getName(), distance);
            return true;
        } else{
            System.out.printf("%s не смог пробежать по дорожке %d м. Остался на месте \n", getName(), distance);
            return false;
        }
    
    
    }

    
}
