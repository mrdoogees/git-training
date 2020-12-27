import java.util.stream.*;

public class PrintStreamElementByForeachMethod {
    public static void main(String[] args) {
        // Here of() method of Stream interface is used to get the stream
        Stream stm = Stream.of("Java", "is", "a", "programming", "language");

        // we are printing the stream by using forEach() method
        stm.forEach(stm1 -> System.out.println(stm1));
    }
}