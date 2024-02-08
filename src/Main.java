public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("     Задание 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanоv ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("     Задание 2");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullNameUpper);

        System.out.println("     Задание 3");

        String fullName1 = "Иванов Семён Семёнович";
        String fullName1True = fullName1.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName1True);

        System.out.println("     Задание 4");

    }
}