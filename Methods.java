import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Methods {
    Logger log = Logger.getLogger(Methods.class);

    public int[] Mass(int[] Array) {
        Random random = new Random();
        int length = Array.length;
        for (int i = 0; i < length; i++) {
            Array[i] = random.nextInt(100);
            System.out.println(Array[i]);
        }
        return Array;
    }

    /**1.1. Написать метод возвращающий факториал заданного числа N
     * @param x
     * @return
     */
    public long FactorialN(int x) {
        long Factorial = 1;
        try {
            for (int n = 1; n <= x; n++)
            {
                Factorial = Factorial * n;
            }
            log.info("Factorial received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return Factorial;
    }

    /**1.2. написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
     * между точками
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public double GetDistanceTwoPoints(double x1, double y1, double x2, double y2) {
        double GetDistance;
        try {
            GetDistance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            log.info("Distance received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
            GetDistance = -1;
        }
        return GetDistance;
    }

    /** 1.3. Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
     * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
     * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
     * должна быть длиннее суммы двух других
     * @param x
     * @param y
     * @param z
     * @return
     */

    public boolean IsTriangleExists(int x, int y, int z) {
        boolean result = false;
        try {
            if ((x <= 0) || (y <= 0) || (z <= 0))
            { log.info("Impossible to create triangle with 0 side");}
            else if (((x + y) <= z) || ((x + z) <= y) || ((y + z) <= x)) {
                log.info("Triangle doesn't exist");
            } else {
                log.info("Triangle exists");
                result = true;
            }
    }
    catch (Exception ex)
    {
        log.error("Something wrong");
    }
    return result;
    }

    /** 1.4. вывести треугольник из нулей на экран
     * @param s
     * @param x
     * @return
     */
    public String TriangleOfZeros(String s, int x) {
        try {
            for (int Height = 0; Height < x; Height++) {
                for (int Widght = 0; Widght < Height; Widght++) {
                    System.out.print(s);
                }
                System.out.println(s);
            }
            log.info("Triangle created");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return " ";
    }

    /** 1.5. Написать программу которая вычисляет индекс массы тела
     * @param x
     * @param y
     * @return
     */
    public double HumanIMT(double x, int y) {
        double IMT = -1;
        try {
            x = x / 100;
            IMT = y / Math.pow(x, 2);
            log.info("IMT received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return IMT;
    }

    /** 1.6. Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
     * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
     * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
     * изученные операторы Метод буленовский возвращает правда или ложь
     * @return
     */
    public boolean IsSameNumbers() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Введите трехзначное число:   ");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.print("Введите трехзначное число:   ");
        }
        boolean result = false;
        int FirstNumber = x / 100;
        int SecondNumber = (x % 100) / 10;
        int ThirdNumber = x % 10;
        try {
            if ((FirstNumber == SecondNumber) || (SecondNumber == ThirdNumber) || (FirstNumber == ThirdNumber)) {
                log.info("There are the same numbers");
                result = true;
            } else {
                log.info("There are no the same numbers");
            }
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return result;
    }

    /** 1.7. написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
     * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
     * на вход и что возвращает
     * @param x
     * @param y
     * @param z
     * @return
     */
    public double VolumeOfWaterpool(double x, double y, double z) {
        x = x / 100;
        y = y / 100;
        double WaterpoolVolume;
        try {
            WaterpoolVolume = x * y * z * 1000;
            log.info("Volume received");
        }
        catch (Exception ex)
        {
            WaterpoolVolume = -1;
            log.error("Something wrong");
        }
        return (WaterpoolVolume);
    }

    /** 1.8. При поступлении в вуз абитуриенты, получившие &quot;двойку&quot; на первом экзамене, ко второму не
     допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     Подсчитать, сколько человек не допущено ко второму экзамену.
     * @param Array
     * @return
     */
    public int Loosers(int[] Array) {
        int BadStudentsQuantity = 0;
        int length = Array.length;
        try {
            for (int i = 0; i < length; i++) {
                if (Array[i] == 2) {
                    BadStudentsQuantity++;
                }
            }
            log.info("Quantity received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return BadStudentsQuantity;
    }

    /** 1.9. У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
     продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
     выбрать, чтобы выгодно обменять доллары на рубли.
     * @param Array1
     * @param Array2
     * @return
     */
    public String CoolBank(double[] Array1, String[] Array2 ) {
        int length1 = Array1.length;
        int length2 = Array2.length;
        double MaxCourse = 0;
        int Index = 0;
        try {
            for (int i = 0; i < (length2 - 1); i++) {
                if (MaxCourse < Array1[i]) {
                    MaxCourse = Array1[i];
                    Index = i;
                }
            }
            log.info("Bank received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");

        }
        return Array2[Index];
    }

    /** 1.10. Вывести на экран строку S указанное количество раз N
     * @param s
     * @param n
     * @return
     */
    public String String(String s, int n) {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
            log.info("Strings received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return "";
    }

    /** 1.11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public int MinMaxSumm(int x, int y, int z) {
        int MinNumber = 0;
        int MaxNumber = 0;
        int Summ = -1;
        try {
            if (x < y) {
                if (x < z) {
                    if (y < z) {
                        MinNumber = x;
                        MaxNumber = z;
                        log.info("Minimum is first number, maximum is third number");
                    }
                    else {
                        MinNumber = x;
                        MaxNumber = y;
                        log.info("Minimum is first number, maximum is second number");
                    }
                } else {
                    MinNumber = z;
                    MaxNumber = y;
                    log.info("Minimum is third number, maximum is second number");
                }
            }
            else {
                if (x < z) {
                    MaxNumber = z;
                    MinNumber = y;
                    log.info("Minimum is second number, maximum is third number");
                } else {
                    if (y < z) {
                        MaxNumber = x;
                        MinNumber = y;
                        log.info("Minimum is second number, maximum is first number");
                    } else {
                        MaxNumber = x;
                        MinNumber = z;
                        log.info("Minimum is third number, maximum is first number");
                    }
                }
            }
            Summ = MaxNumber + MinNumber;
            log.info("Summ received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
            return Summ;
        }

    /** 1.12. Вычислить площадь треугольника
     * @param x
     * @param y
     * @param z
     * @return
     */
    public double SquareOfTriangle(int x, int y, int z) {
        double TriangleSquare;
        try {
            if (IsTriangleExists(x, y, z)) {
                double HalfOfPerimetr = (x + y + z) / 2;
                TriangleSquare = Math.sqrt(HalfOfPerimetr * (HalfOfPerimetr - x) * (HalfOfPerimetr - y) * (HalfOfPerimetr - z));
                log.info("Triangle Square = "+TriangleSquare);
            } else {
                TriangleSquare = -1;
                log.info("Triangle doesn't exist");
            }
        }
        catch (Exception ex)
        {
            TriangleSquare = -1;
            log.error("Something wrong");
        }
        return (TriangleSquare);
    }

    /** 1.13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника
     * @param a
     * @return
     */
    public double SquareOfHexagon(int a) {
        double HexagonSquare = -1;
        try {
            HexagonSquare = 6 * SquareOfTriangle(a, a, a);
            log.info("Hexagon square received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return HexagonSquare;
    }

    /** 1.14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     * @param x
     * @return
     */
    public long SummOfFactorials(int x) {
        long FactorialsSumm = 0;
        try {
            for (int i = 1; i <= x; i++) {
                if ((i % 2) != 0) {
                    FactorialsSumm = FactorialsSumm + FactorialN(i);
                }
            }
            log.info("Factorial received");
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
        }
        return FactorialsSumm;
    }

    /** 1.15. Написать программу которая возвращает стоимость покупки с учетом дисконта
     * Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     * скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     * @param x
     * @return
     */
    public double SummWithDiscount(double x) {
        double DiscountSumm = 0;
        try {
            if ((x > 1000) & (x <= 2000)) {
                log.info("Customer has 2% discount");
                DiscountSumm = x * 0.98;
            } else if ((x > 2000) & (x <= 5000)) {
                DiscountSumm = x * 0.95;
                log.info("Customer has 5% discount");
            } else if (x > 5000) {
                DiscountSumm = x * 0.93;
                log.info("Customer has 7% discount");
            } else {
                DiscountSumm = x;
                log.info("Customer hasn't any discount");
            }
        }
        catch (Exception ex)
        {
            log.error("Something wrong");
            DiscountSumm = -1;
        }
        return DiscountSumm;
    }

    /** 2.1. Дано два числа. Найти минимальное число из них.
     * @param Array
     * @return
     */
    public int minNumber(int[] Array) {
        int minElement = Array[0];
        try {
            if (Array[0] > Array[1]) {
                minElement = Array[1];
            }
            log.info("Minimum number received");
        }
        catch (Exception ex)
        {
            minElement = -1;
            log.error("Something wrong");
        }
        return minElement;
    }

    /** 2.2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @param Mass
     * @param k
     * @return
     */
    public int SummOfElements(int[] Mass, int k) {
        int summ = 0;
        int length = Mass.length;
        for (int i = 0; i < length; i++) {
            if (Mass[i] % k == 0) {
                summ += Mass[i];
            }
        }
        return summ;
    }

    /** 2.3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * @param Array
     * @return
     */
    public ArrayList IndexOfZeroElements(int[] Array) {
        ArrayList massivOfIndexes = new ArrayList();
        int length = Array.length;
        for (int i = 0; i < length; i++) {
            if (Array[i] == 0) {
                massivOfIndexes.add(i);
            }
        }
        return massivOfIndexes;
    }

    /** 2.4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     * встречается раньше – положительное или отрицательное.
     * @param Array
     * @return
     */
    public String plusMinesNumbers(int[] Array) {
        int length = Array.length;
        String Result = "0";
        for (int i = 0; i < length; i++) {
            if (Array[i] != 0) {
                if (Array[i] < 0) {
                    Result = "negative";
                    return Result;
                } else {
                    Result = "positive";
                    return Result;
                }
            }
        }
        return Result;
    }

    /** 2.5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию
     * @param Array
     * @return
     */
    public boolean isSorted(int[] Array) {
        boolean flag = true;
        for (int i = 1; i < Array.length; i++) {
            if (Array[i - 1] > Array[(i)]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    /** 2.6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     сообщение об этом факте.
     * @param Array
     * @return
     */
    ArrayList EvenNumbers(int[] Array) {
        int length = Array.length;
        ArrayList NewMassive = new ArrayList();
        for (int i = 0; i < length; i++) {
            if ((Array[i] % 2) == 0) {
                NewMassive.add(Array[i]);
            }
        }
        if (NewMassive.isEmpty())
        {
            NewMassive.add("в исходном массиве нет четных элементов");
        }
        return NewMassive;
    }

    /** 2.7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     количество замен.
     * @param Array
     * @param z
     * @return
     */
    public int[] MassiveWithZElements(int[] Array, int z)
    {
        int length = Array.length;
        int counter = 0;
        for (int i=0; i<length;i++)
        {
            if (Array[i]>z)
            {
                Array[i]=z;
                counter++;
            }
            System.out.println(Array[i]);
        }
        System.out.println("замены: "+counter);
        return Array;
    }

    /** 2.8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     элементов.
     * @param Array
     */
    public void numberOfElements(int[] Array)
    {
        int length = Array.length;
        int positiveElements = 0;
        int negativeElements = 0;
        int zeroElements = 0;
        for (int i=0;i<length;i++)
        {
            if (Array[i]<0)
            {
                negativeElements++;
            }
            else if (Array[i]>0)
            {
                positiveElements++;
            }
            else
            {
                zeroElements++;
            }
        }
        System.out.println("положительных элементов: "+positiveElements);
        System.out.println("отрицательных элементов: "+negativeElements);
        System.out.println("нулевых элементов: "+zeroElements);
    }

    /** 2.9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param Array
     * @return
     */
    public int[] ReplacementOfMinMaxElements(int[] Array)
    {
        int length = Array.length;
        int minNumber = Array[0];
        int maxNumber = Array[1];
        int minI=0;
        int maxI=1;
        for (int i=0;i<length;i++)
        {
            if (Array[i]<minNumber)
            {
                minNumber = Array[i];
                minI = i;
            }
            else if (Array[i]>maxNumber)
            {
                maxNumber = Array[i];
                maxI = i;
            }
        }
        Array[minI]=maxNumber;
        Array[maxI]=minNumber;
        for (int i=0;i<length;i++)
        {
            System.out.println(Array[i]);
        }
        return Array;
    }

    /** 2.10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param Array
     * @return
     */
    public int[] PrintElements(int[] Array)
    {
        int length = Array.length;
        for (int i=0;i<length;i++)
        {
            if (Array[i]<=i)
            {
                System.out.println(Array[i]);
            }
        }
        return Array;
    }

    /** 2.11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     * @param Array
     * @param m
     * @param l
     * @return
     */

    public int[] PrintElements1(int[] Array, int m, int l)
    {
        int length = Array.length;
        for (int i=0;i<length;i++)
        {
            if ((Array[i]%m)==l)
            {
                System.out.println(Array[i]);
            }
        }
        return Array;
    }

    /** 2.12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param Array
     * @return
     */
    public int[] ReplacementNearbyElements(int[] Array)
    {
        int length = Array.length;
        int firstElement=Array[0];
        int secondElement=Array[1];
        for (int i=0;i<(length-3);i++)
        {
            Array[i]=secondElement;
            Array[i+1]=firstElement;
            firstElement= Array[i+2];
            secondElement=Array[i+3];
            System.out.println(Array[i]);
        }
        return Array;
    }

    /** 2.14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1])
     * @param Array
     * @return
     */
    public int SumOfMinMax(int[] Array) {
        int minNumber = Array[1];
        int maxNumber = Array[0];
        int length = Array.length;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                if (maxNumber < Array[i]) {
                    maxNumber = Array[i];
                }
            } else {
                if (minNumber > Array[i]) {
                    minNumber = Array[i];
                }
            }
        }
        return minNumber + maxNumber;
    }

    /** 2.16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
     * по модулю больше максимального числа (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})
     * @param Array
     * @return
     */
    public int[] maxNumbersZeroReplacement(int[] Array) {
        int length = Array.length;
        int maxElement = Array[0];
        for (int i = 0; i < length; i++) {
            if (maxElement < Array[i]) {
                maxElement = Array[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (maxElement < Math.abs(Array[i])) {
                Array[i] = 0;
            }
            System.out.println(Array[i] + "");
        }
        return Array;
    }

    /** 2.19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k
     * @param Array
     * @param k
     * @return
     */
    public ArrayList KElements(int[] Array, int k) {
        int length = Array.length;
        ArrayList EndsOnKNumber = new ArrayList();
        for (int i = 0; i < length; i++) {
            if ((Array[i] == k) || ((Array[i]%10) == k)) {
                EndsOnKNumber.add(Array[i]);
            }
        }
        return EndsOnKNumber;
    }
}