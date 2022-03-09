public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //Вычисление факториала чистел от 1 до 5

        for (int i = 1; i < 5; i++) { // переменная i объявляется в самом цикле for
            sum += i; // переменная i доступна во всём цикле
            fact *= i;
        }
        // здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
