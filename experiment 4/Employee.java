class Employee extends Person
{
    double annualSalary;
    String startDate;
    String nationalInsuranceNumber;

    Employee(String n, double s, String d, String ni)
    {
        super(n);
        annualSalary = s;
        startDate = d;
        nationalInsuranceNumber = ni;
    }

    double getAnnualSalary()
    {
        return annualSalary;
    }

    String getStartDate()
    {
        return startDate;
    }

    String getNationalInsuranceNumber()
    {
        return nationalInsuranceNumber;
    }

    void setAnnualSalary(double s)
    {
        annualSalary = s;
    }

    void setStartDate(String d)
    {
        startDate = d;
    }

    void setNationalInsuranceNumber(String ni)
    {
        nationalInsuranceNumber = ni;
    }
}