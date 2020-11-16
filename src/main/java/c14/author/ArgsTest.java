package c14.author;

public class ArgsTest {
    public static void main(String[] args) {
        try {
            //schema: 格式化字符串,表示:l:boolean值,p:数字,d:字符串
            Args arg = new Args("l,p#,d*", args);
            //获取传入的值
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            //使用传入的值执行程序
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {//有可能程序异常
            System.out.printf("ArgumentError:%s\n", e.errorMessage());
        }
    }

    public static void executeApplication(boolean logging, int port, String directory) {
        System.out.printf("logging->%b,port->%d,directory->%s", logging, port, directory);
    }
}
