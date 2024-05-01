public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 95;
        double height = 1.87;
        int bmiIndex = service.calculate(weight, height);//должно получиться 27
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Рост: " + height + " см.");
        System.out.println("Индекс массы тела: " + bmiIndex);

    }
}
