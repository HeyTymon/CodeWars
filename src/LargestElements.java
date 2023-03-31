import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestElements //https://www.codewars.com/kata/53d32bea2f2a21f666000256
{
    public static int[] largest(int n, int[] arr)
    {
        int[] intArray = new int[n];

        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        integerList.sort(Comparator.naturalOrder());

        for(int i = 0; i < n; i++)
        {
            intArray[i] = integerList.get(integerList.size()- n + i);
        }

        return intArray;
    }
}
