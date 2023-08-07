public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 16;

        if (age >= 18) {
            System.out.println("Задача №1\nЕсли возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else {
            System.out.println("Задача №1\nЕсли возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        int temperature = 0;
        System.out.println("\nЗадача №2");
        boolean lowTemperature = temperature < 5;

        if (lowTemperature) {
            System.out.println("На улице " + temperature + " градусов (градуса), нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов (градуса), можно идти без шапки.");
        }
    }

    public static void task3() {
        int speed = 240;
        System.out.println("\nЗадача №3");
        boolean tooFast = speed > 60;

        if (tooFast) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        int age = 60;
        System.out.println("\nЗадача №4");

        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        }
        else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        }
        else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
        else  {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        int age = 5;
        System.out.println("\nЗадача №5");
        boolean canNotRide = age < 5;
        boolean canRideWithAdult = age < 14;

        if (canNotRide) {
            System.out.println("Если возраст ребенка  равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        else if (!canNotRide  && canRideWithAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        int wagonCapacity = 102;
        int seat = 60;
        int numberOfPeople = 55;
        System.out.println("\nЗадача №6");

        if (numberOfPeople <= seat) {
            System.out.println("В вагоне есть и сидячие, и стоячие места.");
        }
        else if (seat < numberOfPeople && numberOfPeople < wagonCapacity ) {
            System.out.println("В вагоне остались только стоячие места.");
        }
        else {
            System.out.println("В вагоне мест нет.");
        }
    }

    public static void task7() {
        int one = 11;
        int two = 22;
        int three = 3;
        System.out.println("\nЗадача №7");

        if (one > two && one > three) {
            System.out.println("Самое большое число из трех: one = " + one + ".");
        } else if (two > one && two > three) {
            System.out.println("Самое большое число из трех: two = " + two + ".");
        } else {
            System.out.println("Самое большое число из трех: three = " + three + ".");
        }
    }
}