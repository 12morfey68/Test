import java.util.ArrayList;

public class MainClass2 {
    public static void main (String [] args) {
        Methods methods = new Methods();
        int[] Mass = new int[50];
        methods.Mass(Mass);
        System.out.println();

        /** 1. Дано два числа. Найти минимальное число из них.
         *
         */
        int[] Mass3 = {15,9};
        int minimumNumber = methods.minNumber(Mass3);
        System.out.println(minimumNumber);
        System.out.println();

        /** 2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
         *
         */
        int SummOfMassivElements = methods.SummOfElements(Mass,2);
        System.out.println(SummOfMassivElements);
        System.out.println();

        /** 3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
         *
         * @param Array
         * @return
         */
        int[] Mass4 = {45,0,0,58,69,47,0};
        ArrayList massivOfIndexes = methods.IndexOfZeroElements(Mass4);
        System.out.println(massivOfIndexes);
        System.out.println();

        /** 4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
         встречается раньше – положительное или отрицательное
         *
         */
        int[] Mass5 = {0,0,1,-2,3,-4};
        String PositiveNegativeElement = methods.plusMinesNumbers(Mass5);
        System.out.println(PositiveNegativeElement);
        System.out.println();



        /**5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
         *
         */
        int[] Mass1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(methods.isSorted(Mass1));
        System.out.println();

        /** 6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
         сообщение об этом факте.
         *
         */
        int[] Mass6 = {45,79,36,11,14,79,43};
        System.out.println(methods.EvenNumbers(Mass6));
        System.out.println();

        /** 7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
         количество замен.
         *
         */
        int[] Mass7 = {45,79,82,11,14,79,43};
        methods.MassiveWithZElements(Mass7,45);
        System.out.println();

        /** 8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
         элементов.
         *
         */
        int[] Mass8 = {45,-79,82,0,14,-79,0};
        methods.numberOfElements(Mass8);
        System.out.println();

        /** 9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
         *
         */
        int[] Mass9 = {1,2,3,4,5,6,7,8,9};
        methods.ReplacementOfMinMaxElements(Mass9);
        System.out.println();

        /**10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
         *
         */
        int[] Mass10 = {1,2,1,4,5,6,5,8,7};
        methods.PrintElements(Mass10);
        System.out.println();

        /** 11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
         *
         */
        int[] Mass11 = {9,2,3,4,5,6,5,8,7};
        methods.PrintElements1(Mass11,2,1);
        System.out.println();

        /**12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
         *
         */
        int[] Mass12 = {1,2,3,4,5,6,7,8};
        methods.ReplacementNearbyElements(Mass12);
        System.out.println();


        /** 14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
         *
         */
        int SummOfMinAndMaxElements = methods.SumOfMinMax(Mass);
        System.out.println(SummOfMinAndMaxElements);
        System.out.println();

        /** 16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
         по модулю больше максимального числа (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})
         *
         */
        int[] Mass2 = {1,2,-20,10,-70,-5};
        methods.maxNumbersZeroReplacement(Mass2);
        System.out.println();

        /**19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
         оканчивающиеся на цифру k.
         *
         */
        ArrayList NewMassive = methods.KElements(Mass,5);
        System.out.println(NewMassive);
        System.out.println();
    }

    }
