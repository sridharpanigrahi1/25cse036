class test12
{
    static int powerInt(int num1, int num2)
    {
        return (int)Math.pow(num1, num2);
    }

    static double powerDouble(double num1, double num2)
    {
        return Math.pow(num2, num1);
    }

    public static void main(String args[])
    {
        int result1 = powerInt(2, 3);
        double result2 = powerDouble(2.0, 5.0);

        System.out.println("Integer Power = " + result1);
        System.out.println("Double Power = " + result2);
    }
}
