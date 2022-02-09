import java.util.Scanner;



class BoolAndIfTest
{
    public static void main(String[] args)
    {
        //boolean boolFalse = false;
        //boolean boolTrue = true;
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num = Integer.parseInt(inputObj.nextLine());
        inputObj.close();
        //System.out.println(boolFalse + "\n" + boolTrue);

        if (isEven(num))
        {
            System.out.println(num + " is indeed an even number"); 
        }
        else
        {
            System.out.println(num + " is indeed an odd number");
        }
    }

    private static boolean isEven(int num)//the function takes in an int type number and returns with true if it is even and false if it's true
    {
        if (num%2 == 1)
        {
            return (false);
        }
        else
        {
            return (true);
        }
    }
}
