class Author
{
    private String name, email, gender;

    Author(String n, String e, String g)
    {
        name = n;
        email = e;
        gender = g;
    }

    String getName() { return name; }
    String getEmail() { return email; }
    String getGender() { return gender; }

    void setName(String n) { name = n; }
    void setEmail(String e) { email = e; }
    void setGender(String g) { gender = g; }
}

class Book
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String n, Author a, double p, int q)
    {
        name = n;
        author = a;
        price = p;
        qtyInStock = q;
    }

    String getName() { return name; }
    Author getAuthor() { return author; }
    double getPrice() { return price; }
    int getQtyInStock() { return qtyInStock; }

    void setName(String n) { name = n; }
    void setAuthor(Author a) { author = a; }
    void setPrice(double p) { price = p; }
    void setQtyInStock(int q) { qtyInStock = q; }

    void display()
    {
        System.out.println("Book Name = " + name);
        System.out.println("Price = " + price);
        System.out.println("Quantity in Stock = " + qtyInStock);
        System.out.println("Author Name = " + author.getName());
        System.out.println("Author Email = " + author.getEmail());
        System.out.println("Author Gender = " + author.getGender());
    }
}

class test14
{
    public static void main(String args[])
    {
        Author a = new Author("John", "john@gmail.com", "Male");
        Book b = new Book("Java Programming", a, 500, 10);

        b.display();
    }
}
