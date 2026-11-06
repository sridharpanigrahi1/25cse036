class test10
{
    public static void main(String args[])
    {
        if(args.length != 4)
        {
            System.out.println("Enter exactly 4 integer numbers");
            return;
        }

        int a[][] = new int[2][2];
        int k = 0;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                a[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        System.out.println("The 2 x 2 Array is:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}
