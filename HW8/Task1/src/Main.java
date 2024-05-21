public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] array2 = new int[10];
        int[] array = new int[]{10, 2, 3, 56, 567, 32, 90, 32, 1, 7};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int j : array) {
            System.out.print(" " + j);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("\nмассив наоборот: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        System.out.println("\nРазвернём массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array2.length - 1; j >= 0; j--) {
                array2[j] = array[i];
            }


        }
        System.out.print(array[2]);
    }
}
