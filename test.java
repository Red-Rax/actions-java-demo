public class test {

    public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    if (s1 == s2) { System.out.println("These two elements have the same reference"); }
    if (s1.equals(s2)) { System.out.println("These two elements have the same reference"); }
}
