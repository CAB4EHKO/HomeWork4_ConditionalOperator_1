public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен: " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен: " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int temp = 4;
        boolean isCold = temp < 5;
        if (isCold) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить споконойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        int age = 23;
        if (age > 1 && age <= 6) {
            System.out.println("Если возраст человек равен: " + age + ", то ему нужно ходить в детский сад.");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человек равен: " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человек равен: " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человек равен: " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5.");
        int age = 14;
        boolean notAllowedOnTheAttraction = age < 5;
        boolean youCanWithAdults = age >= 5 && age < 14;
        boolean youCanAlone = age >= 14;
        if (notAllowedOnTheAttraction) {
            System.out.println("Если возраст ребёнка равен: " + age + ", то ему нельзя кататься на атракционе.");
        } else if (youCanWithAdults) {
            System.out.println("Если возраст ребёнка равен: " + age +
                    ", то ему можно кататься на атракционе в сопровождении.");
        } else if (youCanAlone) {
            System.out.println("Если возраст ребёнка равен: " + age +
                    ", то ему можно кататься на атракционе без сопровождения взрослого.");

        }
    }
}
