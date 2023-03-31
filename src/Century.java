public class Century //https://www.codewars.com/kata/52fb87703c1351ebd200081f
{
    public static String whatCentury(int year)
    {
        String[] sArray = String.valueOf(year).split("");

        int boundLow = (Integer.valueOf(sArray[0]) * 10 + Integer.valueOf(sArray[1])) * 100 + 1;
        int boundHigh = (Integer.valueOf(sArray[0]) * 10 + Integer.valueOf(sArray[1]) + 1) * 100;

        String digitsString = (year >= boundLow && year <= boundHigh)
                ? String.valueOf((Integer.valueOf(sArray[0]) * 10 + Integer.valueOf(sArray[1]) + 1))
                : String.valueOf((Integer.valueOf(sArray[0]) * 10 + Integer.valueOf(sArray[1])));

        String lettersString = "";

        if(Integer.valueOf(digitsString) > 19)
        {
            switch(digitsString.charAt(1))
            {
                case '1':
                {
                    lettersString = "st";
                }
                break;

                case '2':
                {
                    lettersString = "nd";
                }
                break;

                case '3':
                {
                    lettersString = "rd";
                }
                break;

                default: lettersString = "th";
            }
        }
        else lettersString = "th";

        return digitsString.concat(lettersString);
    }
}
