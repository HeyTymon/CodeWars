import java.util.Arrays;

public class Gloves //https://www.codewars.com/kata/58235a167a8cb37e1a0000db
{
    public static int numberOfPairs(String[] gloves)
    {
        String[] colors = Arrays.stream(gloves).distinct().toArray(String[]::new);
        int[] numberOfGloves = new int[colors.length];
        int numberOfPairs = 0;

        for(int i = 0; i < gloves.length; i++)
        {
            for(int j = 0; j < colors.length; j++)
            {
                if(gloves[i].equals(colors[j])) numberOfGloves[j]++;
            }
        }

        for(Integer i: numberOfGloves)
        {
            numberOfPairs += Math.floor(i/2);
        }

        return numberOfPairs;
    }
}
