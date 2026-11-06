import java.util.Scanner;

class test13
{
    String name;
    double height, weight;

    test13(String n, double h, double w)
    {
        name = n;
        height = h;
        weight = w;
    }

    double computeBMI()
    {
        return weight / (height * height);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String n = sc.nextLine();

        System.out.print("Enter height in meters: ");
        double h = sc.nextDouble();

        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble();

        test13 p = new test13(n, h, w);

        System.out.println("Patient Name = " + p.name);
        System.out.println("BMI = " + p.computeBMI());
    }
}
