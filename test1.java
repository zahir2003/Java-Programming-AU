class Employee
{
    String name="Zahir";
    int emp_id=101;
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Emp id="+emp_id);
    }
}
class test1
{
    public static void main(String [] args)
    {
        Employee emp=new Employee();
        System.out.println(emp.name);
        System.out.println(emp.emp_id);
    }
}