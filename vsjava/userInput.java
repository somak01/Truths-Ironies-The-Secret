import java.util.Scanner;

class UserInputTest
{
    public static void main(String[] args)
    {
        Scanner sObject = new Scanner(System.in);
        System.out.println("Enter your username:");

        String username = sObject.nextLine();
        System.out.println("YOur username is: " + username);

        System.out.println("Enter your age and I can tell you how old are you going to be in 5 years!");
        int age = Integer.parseInt(sObject.nextLine());
        System.out.println("You will be " + (age+5) + " in five years.");
        sObject.close();

    }
}