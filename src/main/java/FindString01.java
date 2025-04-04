public class FindString01 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";
// 통신하는 서버의 규격의 예시라서, 해당 문장을 썼다.
        int a = log.indexOf("\"") + 1, b = log.indexOf(" ", a);
        System.out.print(log.substring(a, b));
    }
}
