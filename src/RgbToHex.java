import java.util.Arrays;
import java.util.stream.Collectors;

public class RgbToHex //https://www.codewars.com/kata/513e08acc600c94f01000001
{
    public static String rgb(int r, int g, int b)
    {

        String[] outputString = new String[3];
        int[] rgbArray = {r,g,b};

        for(int i = 0; i < rgbArray.length; i++)
        {
            if(rgbArray[i] < 0)
            {
                outputString[i] = "00";
            }
            else if(rgbArray[i] > 255)
            {
                outputString[i] = "FF";
            }
            else
            {
                if(rgbArray[i] < 16)
                {
                    outputString[i] = String.join("","0", Integer.toHexString(rgbArray[i]).toUpperCase());
                }
                else
                {
                    outputString[i] = Integer.toHexString(rgbArray[i]).toUpperCase();
                }
            }
        }

        return Arrays.stream(outputString).collect(Collectors.joining(""));
    }
}
