import java.lang.*;

public class Main {

    public static void main(String[] args) {
        try {
            childMethod();
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
        }
    }

    private static void childMethod() throws Exception {
        String str = null;
        try {
            if (str.isEmpty()) {
                System.out.println("Hello World!");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
