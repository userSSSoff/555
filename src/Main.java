

public class Main {
    public static void main(String[] args) {
        method("meerimka");
    }
    public static String[] method(String... soz) {
        String[] array = soz;
        for (String i : array) {
            int s = i.length()/2;
            if (s==i.length()){
                System.out.println(i.substring(2));
            }
            System.out.println(i.substring(5));
        }
        return soz;
    }
    static void String(){}
}



