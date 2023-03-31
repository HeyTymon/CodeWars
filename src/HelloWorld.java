import java.util.stream.Collectors;
public class HelloWorld //https://www.codewars.com/kata/523b4ff7adca849afe000035
{
    static String helloWorld = "hello world!";

    public static String greet()
    {
        return helloWorld.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }
}
