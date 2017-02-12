import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by xiongkuang on 2/11/17.
 */
public class Customer {
    private int ID;
    private String Name;
    private int Age;
    private int CountryCode;
    private double Salary;

    public Customer(int ID){
        this.ID = ID;
        this.Name = randomName();
        this.Age = ThreadLocalRandom.current().nextInt(10, 70);
        this.CountryCode = ThreadLocalRandom.current().nextInt(1, 11);
        this.Salary = ThreadLocalRandom.current().nextDouble(100, 10001);
    }

    private String randomName(){
        String alpahbet = "abcdefghijklmnopqrstuvwxyz0123456789";
        int N = ThreadLocalRandom.current().nextInt(10, 21);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(alpahbet.charAt(ThreadLocalRandom.current().nextInt(alpahbet.length())));
        }
        return sb.toString();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public double getSalary() {
        return Salary;
    }
}
