class test5
{
    public static void main(String args[])
    {
        int count = 0;
        int n = 1;
        System.out.println("First 5 numbers divisible by 2, 3 and 5:");
        while(count < 5)
        {
            if(n % 2 == 0 && n % 3 == 0 && n % 5 == 0)
            {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
