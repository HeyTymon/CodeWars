import java.util.ArrayList;
import java.util.List;

public class MexicanWave //https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
{
    public static String[] wave(String str)
    {
        List<String> strList = new ArrayList<>();

        if (str.isEmpty())  return new String[]{};
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                char c = str.charAt(i);
                if(Character.isWhitespace(c)) continue;
                strList.add(str.substring(0,i) + Character.toUpperCase(c) + str.substring(i+1));
            }
        }
        return strList.toArray(String[]::new);
    }
}
