public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        if (logger1 == logger2)
            System.out.println("Instances logger1 and logger2 are pointing to the same object.");
        else {
            System.out.println("Instances logger1 and logger2 are not pointing to the same object.");
        }
    }
}