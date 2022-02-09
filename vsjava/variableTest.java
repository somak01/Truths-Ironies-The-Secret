class VariableTest
{
    public static void main(String[] args)
    {
        int numInDec = 12;
        int numInHex = 0x10;
        
        System.out.println(numInDec + "\n" + numInHex);

        double numDbInHex = 0x12;
        double numExponent = 0x12e-5;
        System.out.println(numDbInHex  + "\n" + numExponent);
        float numFInHex = 0x12323;
        System.out.println(numFInHex);
        float numF = 12.32342424241241f;
        double numD = 12.32342424241241f;
        System.out.println(numF + "\n" + numD);
        NumberComparer(numD, numF);

    }
    public static void NumberComparer(double num1, double num2)
    {
        if (num1 > num2)
        {
            System.out.println("The first input is the bigger number");
        }
        else if(num2 > num1)
        {
            System.out.println("The second input is the bigger number");

        }
        else
        {
            System.out.println("They're equal.");
        }
    }
}