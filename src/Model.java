public class Model {

    public static String[] data = new String[10];
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);


    public static String inputUser(String label) {
        System.out.print(label + " : ");
        return scanner.nextLine();

    }
}
