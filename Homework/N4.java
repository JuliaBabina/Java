// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках. 
// Сортировать пользователей по возрасту. Не вывести в порядке возрастания возрастов а именно сортировать!)

import java.util.*;

public class N4 {
    public static void main(String[] args) {
        inputArray();
    }


    //    Создаем массивы для хранения данных о пользователях
    public static void inputArray() {
        ArrayList<String> nameUser = new ArrayList<>();
        ArrayList<String> sexUser = new ArrayList<>();
        ArrayList<Integer> ageUser = new ArrayList<>();

        int count = 0;
        System.out.print("Введите количество пользователей: ");
        Scanner scannerCount = new Scanner(System.in);
        int finalCount = Integer.parseInt(scannerCount.nextLine());
        while (count < finalCount) {
            System.out.println("Введите имя пользователя");
            Scanner scanner = new Scanner(System.in);
            nameUser.add(scanner.nextLine());
            System.out.println("Введите пол пользователя");
            sexUser.add(scanner.nextLine());
            System.out.println("Введите возраст пользователя");
            ageUser.add(scanner.nextInt());
            count++;

        }

        nameUser.forEach((String s) -> System.out.print(s + " / "));
        System.out.println();
        sexUser.forEach((String s) -> System.out.print(s + " / "));
        System.out.println();
        ageUser.forEach((Integer i) -> System.out.print(i + " / "));
        System.out.println();
        sortData(nameUser, sexUser, ageUser);

    }

    //    Медот запроса сортировки полученных массивов у пользователя
    public static void sortData(ArrayList<String> name, ArrayList<String> sex, ArrayList<Integer> age) {
        System.out.println("""
                Выберите вариант сортировки:
                1. По имени\s
                2. По полу\s
                3. По возрасту""");

        Scanner scannerChoice = new Scanner(System.in);
        int choiceUser = scannerChoice.nextInt();

        switch (choiceUser) {
            case 1:
                sortDataArray(name, sex, age);
                break;
            case 2:
                sortDataArray(sex, name, age);
                break;
            case 3:
                sortDataArray(age, name, sex);
                break;
            default:
                System.out.println("не корректный ввод");
        }


    }

    //    Универсальный способ сортировки
    public static void sortDataArray(ArrayList One, ArrayList two, ArrayList three) {
        LinkedList tempArrayOne = new LinkedList<>(One);
        LinkedList tempArrayTwo = new LinkedList<>();
        LinkedList tempArrayThree = new LinkedList<>();

        Collections.sort(tempArrayOne);
        tempArrayOne.forEach(str -> System.out.print(str + " / "));
        System.out.println();

        for (int i = 0; i < One.size() - 1; i++) {
            if (One.get(i) != One.get(i + 1)) {
                for (int j = 0; j < One.size(); j++) {
                    if (tempArrayOne.get(i) == One.get(j)) {
                        tempArrayTwo.add(two.get(j));
                        tempArrayThree.add(three.get(j));
                    }
                }
            }
        }
        if (tempArrayTwo.size() < One.size()) {
            tempArrayTwo.add(two.get(One.size() - 1));
        }
        if (tempArrayThree.size() < One.size()) {
            tempArrayThree.add(three.get(One.size() - 1));
        }

        tempArrayTwo.forEach(str -> System.out.print(str + " / "));
        System.out.println();
        tempArrayThree.forEach(str -> System.out.print(str + " / "));
    }
}