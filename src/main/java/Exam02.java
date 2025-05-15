public class Exam02 {
    public static void main(String[] abcd) {

        String log = "127.0.01 - frank [10/Oct/2000:13:55:36-0700] \"Get /apache.pb.gif HTTP/1.0\" 200";
        int a = log.indexOf("/", log.indexOf("\"")),
                b = log.indexOf(" ", a);

        System.out.print(log.substring(a, b));
    }
}
