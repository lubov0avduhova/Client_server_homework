import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String message = "Один: @Три привет!!! Как дела?";

        String[] mes = message.split("@");
        int buf = mes[1].indexOf(" ");

        System.out.println(mes[1].substring(0, buf));
        System.out.println(mes[1].substring(buf+1));

//        System.out.println(mes[0] + "____" + mes[1]);
//        String[] userNameNMessage = mes[1].split("\\s+");
//        System.out.println(userNameNMessage[0] + "++++" + userNameNMessage[1]);
    }
}
