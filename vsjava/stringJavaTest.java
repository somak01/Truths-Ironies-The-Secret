class StringTest
{
    public static void main(String[] args)
    {
        //String space = " ";
        String firstName = "Poopy";
        String lastName = "Weenie";
        //System.out.println(firstName + space + lastName);

        System.out.println(NameConcat(firstName, lastName));
    }
    public static String NameConcat(String firstName, String lastName)
    {
        String fullName = firstName + " " +lastName;
        return(fullName);
    }
}