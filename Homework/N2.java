import java.util.Arrays;

// 1.Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
// 2.Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
// 3.Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
// 4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5.символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7.Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder. 


public class N2 {
    public static void main(String[] args) {
// Задание №1
        System.out.println("Задание №1");
        String string1First = "Завтра занятий не будет";
        String string1Second = "будет";
        compareStr(string1First, string1Second);
// Задание №2
        System.out.println("Задание №2");
        String string2First = "топот";
        String string2Second = "топот";
        isReverseStrings(string2First, string2Second);
// Задание №3
        System.out.println("Задание №3");
        StringBuilder sb3 = new StringBuilder("колодец");
        reversRecurs(sb3);
        System.out.println();
// Задание №4
        System.out.println("Задание №4");
        int first4 = 3;
        int second4 = 56;
        printExamples(first4, second4);
// Задание №5
        System.out.println("Задание №5");
        String str5 = "3 + 56 = 59";
        changeEquals(str5);
// Задание №6
        System.out.println("Задание №6");
        String str6 = "3 + 56 = 59";
        System.out.println(replaceEquals(str6));

// Задание №7
        System.out.println("Задание №7");
        String str7 = fillString();
        long start = System.currentTimeMillis();
        replaceEquals(str7);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        replaceEqStr(str7);
        System.out.println(System.currentTimeMillis() - start);

    }


    static void compareStr(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        String[] arr3 = new String[arr1.length < arr2.length ? arr1.length : arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].compareTo(arr2[j]) == 0) {
                    arr3[count++] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
    


    static void isReverseStrings(String s1, String s2){
        StringBuilder sTemp = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0 ; i--) {
            sTemp.append(s1.charAt(i)) ;
        }
        System.out.println(sTemp);
        System.out.println(s2.compareTo(sTemp.toString()) == 0);
    }



    static StringBuilder reversRecurs (StringBuilder sb) {
        System.out.print(sb.charAt(sb.length()-1));
        if (sb.length() == 1) {
            return sb;
        }
        return reversRecurs(sb.deleteCharAt(sb.length()-1));
    }



    static void printExamples(int n1, int n2){
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        StringBuilder res3 = new StringBuilder();
        res1.append(n1);
        res1.append(" + ");
        res1.append(n2);
        res1.append(" = ");
        res1.append(n1 + n2);
        res2.append(n1);
        res2.append(" - ");
        res2.append(n2);
        res2.append(" = ");
        res2.append(n1 - n2);
        res3.append(n1);
        res3.append(" * ");
        res3.append(n2);
        res3.append(" = ");
        res3.append(n1 * n2);
        System.out.println(res1.toString());
        System.out.println(res2.toString());
        System.out.println(res3.toString());
    }



    static void changeEquals(String x){
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.deleteCharAt(eq);
        sb.insert(eq, "равно");
        System.out.println(sb.toString());
    }


    static String replaceEquals(String x){
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.replace(eq, eq+1,"равно" );
        return sb.toString();
    }



        static String fillString(){
            String str = "";
                for (int i = 0; i <= 10000 ; i++) {
                    str += "=";
                }
            return str;
        }
        static String replaceEqStr(String x){
            x.replace("=", "равно");
            return x;
        }
}