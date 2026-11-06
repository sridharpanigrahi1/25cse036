class Fruit
{
    String name, taste, size;

    Fruit(String n, String t, String s)
    {
        name = n;
        taste = t;
        size = s;
    }

    void eat()
    {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit
{
    Apple(String n, String t, String s)
    {
        super(n, t, s);
    }

    void eat()
    {
        System.out.println("Apple tastes sweet");
    }
}

class Orange extends Fruit
{
    Orange(String n, String t, String s)
    {
        super(n, t, s);
    }

    void eat()
    {
        System.out.println("Orange tastes sour");
    }
}

class test18
{
    public static void main(String args[])
    {
        Apple a = new Apple("Apple", "Sweet", "Medium");

        Orange o = new Orange("Orange", "Sour", "Medium");

        a.eat();
        o.eat();
    }
}tes