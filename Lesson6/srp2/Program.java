public class Program {


    /**
     * TODO: Домашняя работа (программа 1),
     *  оптимизировать приложение в соответствии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");

        InputFromConsole inputFromConsole = new InputFromConsole();
        Order order = inputFromConsole.inputFromConsole();

        SaveToJson saveToJson = new SaveToJson();
        saveToJson.saveToJson(order);
    }

}
