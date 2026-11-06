class test9
{
    public static void main(String args[])
    {
        int a[] = {10, 20, 30, 20, 40, 10, 50};
        int b[] = new int[a.length];
        int count = 0;

        for(int i = 0; i < a.length; i++)
        {
            boolean found = false;

            for(int j = 0; j < count; j++)
            {
                if(a[i] == b[j])
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                b[count] = a[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < count; i++)
            System.out.print(b[i] + " ");
    }
}
