package java_projects;

// /**
//  * program
//  */
public class program {
    public static void main(String[] args) {
        // System.out.println("world");
        // String s = null;
        // s=s+" 1";
        // System.out.println(s);
        short age = 10;
        int salary = 123456;
        System.out.println(age);        
        System.out.println(salary);
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);        
        System.out.println(pi);
        char ch = '1';
        System.out.println(Character.isDigit(ch));  // true
        ch = 'a';
        System.out.println(Character.isDigit(ch));  // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);  // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);  // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);  // false
        var a = 123;
        System.out.println(a);  // 123
        var d = 123.456;
        System.out.println(d);  // 123.456
        System.out.println(getType(a));  // Integer
        System.out.println(getType(d));  // Double
        d = 1022;
        System.out.println(d);  // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
        int i = 23_234_45;
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        String s = "qwer";
        System.out.println(s.charAt(1));
    

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
    
}


