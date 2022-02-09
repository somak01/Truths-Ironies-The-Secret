 class CharTypeTest
{
    public static void main(String[] args)
    {
        char ch = 'á';
        System.out.println("The code of '" + ch + "' is " + charCode(ch));

    }
    public static int charCode(char ch)
    {
        return ((int)ch);
    }
}