public class Main {
    public static void main(String[] args) {

        //SALARIED EMPLOYEE
        SalariedEmployee salariedEmployee=new SalariedEmployee("Huzair", 1000000.0);
        salariedEmployee.salariedEmployeeMethod();

        //HOURLY EMPLOYEE
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Shree",100.0,180.0);
        hourlyEmployee.hourlyEmployeeMethod();
    }
}

class Calculate{
    //salariedWorker calculatePay Method
    public Double calculatePay(Double salary){
        return salary;
    }

    //HourlyEmployee calculatePay
    public Double calculatePay(Double hourlyRate,Double hoursWorked){
        return (hoursWorked*hourlyRate);
    }
}

class SalariedEmployee extends Calculate{
    String name;
    Double salary;

    //Salaried workers constructor
    public SalariedEmployee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void salariedEmployeeMethod (){
        System.out.println(calculatePay(this.salary));
    }
}

class HourlyEmployee extends Calculate{
    String name;
    Double hourlyLate;
    Double hourlyWorked;

    //Hourly Employee Constructor
    public HourlyEmployee(String name, Double hourlyLate, Double hourlyWorked) {
        this.name = name;
        this.hourlyLate = hourlyLate;
        this.hourlyWorked = hourlyWorked;
    }

    public void hourlyEmployeeMethod (){
        System.out.println(calculatePay(this.hourlyLate,this.hourlyWorked));
    }
}