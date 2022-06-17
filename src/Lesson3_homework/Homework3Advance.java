package Lesson3_homework;

import java.util.Arrays;

public class Homework3Advance
{

    public static void main(String[] args) {
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;

        System.out.println("\nЗадание 1");
        task1(increment, result);
        System.out.println("\n");

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        Integer[] testArray = {1, 1, 1, 1, 1, 1};
        System.out.println("Задание 2");
        task2(testArray);
        System.out.println("\n");

        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        System.out.println("Задание 3");
        task3(hasFuel, hasElectricsProblem, hasMotorProblem, hasTransmissionProblem, hasWheelsProblem);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        System.out.println("\nЗадание 4");

        Warehouse wh1 = new Warehouse(1000, "Водка");
        Employee emp1 = new Employee("Вася", 0);
        Employee emp2 = new Employee("Лена", 0);
        Employee emp3 = new Employee("Пётр", 0);

        System.out.println("Первый");
        emp1.crashArt(10);
        System.out.println("Испортил сотрудник " + emp1.employeeName + ": " + emp1.artCountCrash);
        System.out.println("Осталось на складе: " + wh1.getArtCountWarehouse() + "\n");

        System.out.println("Второй");
        emp2.crashArt(11);
        System.out.println("Испортил сотрудник " + emp2.employeeName + ": " + emp2.artCountCrash);
        System.out.println("Осталось на складе: " + wh1.getArtCountWarehouse() + "\n");

        System.out.println("Третий");
        emp3.crashArt(30);
        System.out.println("Испортил сотрудник " + emp3.employeeName + ": " + emp3.artCountCrash);
        System.out.println("Осталось на складе: " + wh1.getArtCountWarehouse() + "\n");
    }

    public static void task1(double increment, double result) {
        int count = 0;
        if (increment > 0) {
            while (result <= 1000000) {
                result += increment;
                count ++;
            }
            System.out.println("Количество итераций: " + count);
        }
    }

    public static void task2(Integer[] testArray) {

        System.out.println("Массив до: " + Arrays.toString(testArray));

        for (int i = 0; i < testArray.length; i++) {
            if (i % 2 == 0) {
                testArray[i] = 0;
            }
        }

        System.out.println("Массив после: " + Arrays.toString(testArray));
    }

    public static void task3(boolean hasFuel, boolean hasElectricsProblem, boolean hasMotorProblem, boolean hasTransmissionProblem, boolean hasWheelsProblem) {
        double cost = 0.0;
        int count = 0;

        if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            cost += 1000;
            System.out.println("Цена услуг: " + cost);
            return;
        }

        if (hasElectricsProblem) {
            cost += 5000;
            count++;
        }

        if (hasMotorProblem) {
            cost += 10000;
            count++;
        }

        if (hasTransmissionProblem) {
            cost += 4000;
            count++;
        }

        if (hasWheelsProblem) {
            cost += 2000;
            count++;
        }

        if (count == 2) {
            cost = cost * 0.9;
        }

        if (hasTransmissionProblem && (hasMotorProblem || hasElectricsProblem)) {
            cost = cost * 0.8;
        }
        System.out.println("Цена услуг: " + cost);
    }

}
