import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main (String [] args) {
        Methods methods = new Methods();

        /**1. Написать метод возвращающий факториал заданного числа N
         */
        System.out.println(methods.FactorialN(5));
        Assert.assertEquals("Is not equal",1,methods.FactorialN(0));
        Assert.assertEquals("Is not equal", 24, methods. FactorialN(4));
        System.out.println();

        /**2. написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
         * между точками.
         */
        System.out.println(methods.GetDistanceTwoPoints(3.789, 7.13, 4.7923, 5.478));
        Assert.assertEquals("Is not equal",4, 0.0001, methods.GetDistanceTwoPoints(2,2,2,-2));
        Assert.assertEquals("Is not equal",5.6568,0.0001, methods.GetDistanceTwoPoints(2,2,-2,-2));
        Assert.assertEquals("Is not equal",4, 0.0001, methods.GetDistanceTwoPoints(2,2,-2,2));
        Assert.assertEquals("Is not equal",2.8284,0.0001, methods.GetDistanceTwoPoints(0,0,2,2));
        System.out.println();

        /**3. Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
         * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
         * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
         * должна быть длиннее суммы двух других
         */
        System.out.println(methods.IsTriangleExists(7, 7, 0));
        Assert.assertTrue("true",methods.IsTriangleExists(7,7,7));
        Assert.assertFalse("false",methods.IsTriangleExists(7,7,20));
        System.out.println();

        /**4. вывести треугольник из нулей на экран
         */
        System.out.println(methods.TriangleOfZeros("0",3));
        System.out.println();


        /**5. Написать программу которая вычисляет индекс массы тела
         */
        System.out.println(methods.HumanIMT(167, 65));
        System.out.println();

        /**6. Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
         * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
         * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
         * изученные операторы Метод буленовский возвращает правда или ложь
         */
        System.out.println(methods.IsSameNumbers());
        Assert.assertFalse("false",methods.IsSameNumbers());
        Assert.assertTrue("true",methods.IsSameNumbers());
        System.out.println();

        /**7. написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
         * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
         * на вход и что возвращает
         *
         */
        System.out.println(methods.VolumeOfWaterpool(167,253,300));
        System.out.println();

        /**8. При поступлении в вуз абитуриенты, получившие &quot;двойку&quot; на первом экзамене, ко второму не
         допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
         Подсчитать, сколько человек не допущено ко второму экзамену.
         *
         */
        int [] A = {5,4,2,2,5,2,3,5,5,2};
        System.out.println(methods.Loosers(A));
        System.out.println();


        /**9. У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
            продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
            выбрать, чтобы выгодно обменять доллары на рубли.
        *
         */
        String [] Banks = {"ПриватБанк","Банк Пивденный","Кредобанк","Таскомбанк","Аккордбанк","Асвио Банк","Банк Восток"};
        double [] Course = {25.9,26.1,25.85,26.00,25.92,25.7,25.8};
        System.out.println( methods.CoolBank(Course,Banks));
        System.out.println();

        /**10. Вывести на экран строку S указанное количество раз N
         *
         */
        System.out.println(methods.String("Don't worry, be happy", 5));
        System.out.println();

        /**11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
         *
         */
        System.out.println(methods.MinMaxSumm(534,888,111));
        System.out.println();

        /**12. Вычислить площадь треугольника
         *
         */
        System.out.println(methods.SquareOfTriangle(6, 5,0));
        System.out.println();

        /**13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
         вычисления площади треугольника
         *
         */
        System.out.println(methods.SquareOfHexagon(7));
        System.out.println();

        /**14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
         *
         */
        System.out.println(methods.SummOfFactorials(9));
        System.out.println();

        /**15. Написать программу которая возвращает стоимость покупки с учетом дисконта
        Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
        скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
        *
        */
        System.out.println(methods.SummWithDiscount(5000));
        System.out.println();
}
}


