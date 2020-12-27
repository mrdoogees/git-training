import java.util.stream.*;

public class PrintStreamElementByPeekMethod {
    public static void main(String[] args) {
        // Here of() method of Stream interface is used to get the stream
        Stream stm = Stream.of("Java", "is", "a", "programming", "language");

        //  we are printing the stream by using peek() method 
        //  and it provides the facility count() method to terminate 
        stm.peek(stm1 -> System.out.println(stm1)).count();
    }
}