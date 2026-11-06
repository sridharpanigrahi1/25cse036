import java.util.Scanner;

class test7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == n)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }
}
