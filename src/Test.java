import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        //223.130.195.95
    try {
        InetAddress ip;
        ip = InetAddress.getByName("www.naver.com");
        System.out.println(ip.getAddress());
        System.out.println(ip.getHostName());
        System.out.println(ip.toString());
    }catch (UnknownHostException E) {
        E.printStackTrace();
        }
    }
}
