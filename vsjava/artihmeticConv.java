import java.util.Scanner;

class ArithmeticTypeTest
{
    public static void main(String[] args)
    {
        Scanner inputObj = new Scanner(System.in);
        int intNum = Integer.parseInt(inputObj.nextLine());

        float floatNum = Float.parseFloat(inputObj.nextLine());

        inputObj.close();

        System.out.println(intNum * floatNum);
    }
}