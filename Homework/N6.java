// Урок 6. Хранение и обработка данных ч3: множество коллекций Set

// Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество. 
// Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел. 
// Объявить и инициализировать TreeSet использующий ваш компаратор. 
// Добавить несколько эллементов в сет и вывести в консоль.


import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class N6 {
    public static void main(String[] args) {
        SetFromTreeMap set1 = new SetFromTreeMap();
        System.out.println(set1);

        set1.add("Зима");
        set1.add("Лето");
        set1.add("Весна");
        set1.add("Осень");
        set1.add("Дождь");
        set1.add("Солнце");
        set1.add("Снег");
        set1.add("Ветер");

        System.out.println("Множество 1: " + set1.read());
        System.out.printf("Размер множества 1: " + set1.getSize() + "\n");

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("Зима");
        set2.add("Лето");
        set2.add("Весна");
        set2.add("Осень");
        set2.add("Доджь");
        set2.add("Солнце");
        set2.add("Снег");
        set2.add("Ветер");

        System.out.println("Множество 2: " + set2);

        //Объявить и инициализировать компаратор сот большего к меньшеvу c логикой сортировки.
        SetComparator setComp = new SetComparator();
        //Объявить и инициализировать TreeSet использующий ваш компаратор.
        TreeSet<String> set3 = new TreeSet<>(setComp);
        set3.add("Зима");
        set3.add("Лето");
        set3.add("Весна");
        set3.add("Осень");
        set3.add("Дождь");
        set3.add("Солнце");
        set3.add("Снег");
        set3.add("Ветер");
        //Добавить несколько эллементов в сет и вывести в консоль.
        System.out.println("Множество 3: " + set3);

    }

}
// Реализовать множество (set) с помощью TreeMap.
class SetFromTreeMap implements Iterable<String> {
    private static final Map<String, Object> MAPINTERNAL = new TreeMap<>();
    private static final Object OBJ = new Object();

    public void add(String str) {
        MAPINTERNAL.put(str, OBJ);
    }

    public int getSize() {
        return MAPINTERNAL.size();
    }

    public String read() {
        return MAPINTERNAL.keySet().toString();
    }

    @Override
    public String toString() {
        String res = "";
        for (String element : MAPINTERNAL.keySet()) {
            res += element.toString() + ", ";

        }
        return res;
    }

    @Override
    public Iterator<String> iterator() {
        return MAPINTERNAL.keySet().iterator();

    }

}
//Объявить и инициализировать компаратор от большего к меньшему c логикой сортировки.
class SetComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}