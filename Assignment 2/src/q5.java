class q5
{
    public static void main(String[] args)
    {
        person1 p1= new person1("ABC",24);
        employee e1= new employee("ABC",24,11223344,1234567);
        e1.empDisplay();
    }
}
class person1
{
    String name;    int age;
    person1(String name, int age)
    {
        this.name=name; this.age=age;
    }
}
class employee extends person1
{
        int empId;  int salary;
        employee(String name, int age, int empId, int salary)
        {
            super(name,age);
            this.empId=empId;   this.salary=salary;
        }
        void empDisplay()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Employee id: "+empId);
            System.out.println("Salary: "+salary);
        }
}
