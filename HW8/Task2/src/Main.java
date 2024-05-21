import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] array = new double[10];
        double avarageWeight = 0;
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            double randWeight = Math.random() * 40 + 60;
            array[i] = randWeight;
            System.out.println(array[i]);
        }
        System.out.println("Средний все: ");
        for (int i = 0; i < array.length; i++) {
            avarageWeight = (avarageWeight + array[i]);

        }
        avarageWeight = avarageWeight / 10;
        System.out.println(avarageWeight);

        System.out.print("Количество людей у которых вес находится в промежутке от 60 до 80 кг: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 60 && array[i] <= 80) {
                count = count + 1;
            }
        }
        System.out.println(count);

    }
}
