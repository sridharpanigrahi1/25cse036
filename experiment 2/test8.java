class test8
{
    public static void main(String args[])
    {
        int a[] = {10, 50, 20, 80, 5, 90, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++)
        {
            int n = a[i];

            if(n > largest)
            {
                secondLargest = largest;
                largest = n;
            }
            else if(n > secondLargest && n != largest)
            {
                secondLargest = n;
            }

            if(n < smallest)
            {
                secondSmallest = smallest;
                smallest = n;
            }
            else if(n < secondSmallest && n != smallest)
            {
                secondSmallest = n;
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Second largest number = " + secondLargest);
        System.out.println("Smallest number = " + smallest);
        System.out.println("Second smallest number = " + secondSmallest);
    }
}
