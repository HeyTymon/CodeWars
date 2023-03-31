import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase //https://www.codewars.com/kata/587731fda577b3d1b0001196
{
    public static String camelCase(String str)
    {
        return Arrays.stream(str.split(" "))
                .filter(s -> !s.isEmpty())
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .collect(Collectors.joining(""));
    }
}
