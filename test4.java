import java.util.Scanner;

class Test4
{
    int num;
    boolean isPrime = true;

    public void prime()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= num / 2; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println(num + " is not a Prime Number");
        }
    }

    public static void main(String args[])
    {
        Test4 ob = new Test4();
        ob.prime();
    }
}
