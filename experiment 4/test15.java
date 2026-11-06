class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }

    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Bat extends Animal
{
    void eat()
    {
        System.out.println("Bat is eating");
    }

    void sleep()
    {
        System.out.println("Bat is sleeping");
    }

    void fly()
    {
        System.out.println("Bat is flying");
    }
}

class test15
{
    public static void main(String args[])
    {
        Animal a = new Animal();

        a.eat();
        a.sleep();

        Bat b = new Bat();

        b.eat();
        b.sleep();
        b.fly();
    }
}