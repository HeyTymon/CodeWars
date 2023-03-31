public class Nerd //https://www.codewars.com/kata/59e9f404fc3c49ab24000112
{
    public static String nerdify(String txt)
    {
        return txt.chars().map( c -> {
            if (c == 'a' || c == 'A') return '4';
            else if(c == 'l') return '1';
            else if(c == 'e' || c == 'E') return '3';
            else return c;
        }).collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
