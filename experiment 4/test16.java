class test16
{
    public static void main(String args[])
    {
        Employee e = new Employee(
            "Rahul", 500000, "01-01-2024", "NI12345"
        );

        System.out.println("Employee Name = " + e.getName());

        System.out.println("Annual Salary = " +
                           e.getAnnualSalary());

        System.out.println("Start Date = " +
                           e.getStartDate());

        System.out.println("National Insurance Number = " +
                           e.getNationalInsuranceNumber());
    }
}