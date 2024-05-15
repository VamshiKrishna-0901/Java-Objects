public class StringExample {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over a lazy dog";

        print_nextline("Char at index 0: " + string.charAt(0));
        print_nextline("Unicode or ascii value of char at index 0: " + string.codePointAt(0));
    }

    static <T> void print (T string) { System.out.print(string + " "); }
    static <T> void print_nextline(T string) { System.out.println(string); }
}
