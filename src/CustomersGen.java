import java.io.*;

/**
 * Created by xiongkuang on 2/11/17.
 */
public class CustomersGen {


    public static void main(String[] args){
        try {
            File fout = new File("Customers");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 10; i++){
                Customer customer = new Customer(i + 1);
                bw.write(customer.getID()+","+customer.getName()
                        +","+customer.getAge()+","+customer.getCountryCode()
                        +","+customer.getSalary());
                bw.newLine();

            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
