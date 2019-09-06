
public class Worker {
    private String name;
    private int age;
    private int weeklyPay;
    private int employeeID;
    private static int idGen = 0;

    public Worker(String n, int a, int w){
        name = n;
        age = a;
        weeklyPay = w;
        employeeID = idGen;
        idGen++;
    }
    public Worker(String n){
        this(n, 40, 1000);
    }

    public void goToWork(String equipment, int workHours) {
        System.out.println(name + " with employeeID " + employeeID + " went to work with " + equipment + " for " + workHours + " hours");
    }

    public void goToWork(int workHours) {
        goToWork("the usual stuff", workHours);
    }


}
