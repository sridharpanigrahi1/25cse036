import java.util.Scanner;

class test11
{
    double width, height, depth;

    test11(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    void display()
    {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Depth = " + depth);
        System.out.println("Volume = " + (width * height * depth));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        test11 b = new test11(w, h, d);
        b.display();
    }
}
