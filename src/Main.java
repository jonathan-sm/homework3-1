import java.sql.SQLOutput;

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
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age3 = 15;
        if (age3 >= 2 && age3 < 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }else if (age3 > 7 && age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу ");
        }else if (age3  >=18 && age3 < 24) {
            System.out.println("Если возраст человека равен  " + age3 + "год,  то его место в университете. ");
        }else if( age3 >= 24) {
            System.out.println("Если возраст человека равен  " + age3 + "лет,  то ему пора ходить на работу. ");
        }
        }

    public static void task5() {
        System.out.println("Задача 5");
        int childsAge =3;
        if (childsAge>= 5 && childsAge < 14) {
            System.out.println("Если ребенку больше " +  childsAge + ", но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }else if (childsAge > 14 ) {
            System.out.println("Если ребенок старше  " +  childsAge + ", то он может кататься без сопровождения взрослого");
        }else if( childsAge < 5) {
            System.out.println("Если ребенку меньше  " + childsAge + ", то он не может кататься на аттракционе");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int  freePlaces= 103;
        if (freePlaces>=60 && freePlaces<=102)
            System.out.println("Свободных мест в вагоне  больше 60, есть сидячие и  стоячие места");
        else if(freePlaces<60)
            System.out.println("Свободных мест в вагоне меньше 60, есть только  стоячие места");
        else {
            System.out.println("Свободных мест в вагоне нет, поезд  забит");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 400;
        int two = 1600;
        int three =1300;
        if (three>one && three > two){
            System.out.println("Три больше двух и одного ");}
        else if (two > one && two > three){
            System.out.println("Два больше одного и трех");
        }else {
            System.out.println("Один больше двух и трех");

        }
    }
    }
