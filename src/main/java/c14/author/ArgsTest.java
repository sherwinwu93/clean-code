package c14.author;

public class ArgsTest {
    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            System.out.printf("ArgumentError:%s\n", e.errorMessage());
        }
    }

    public static void executeApplication(boolean logging, int port, String directory) {
        System.out.printf("logging->%b,port->%d,directory->%s", logging, port, directory);
    }
}
