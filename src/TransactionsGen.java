import java.io.*;

/**
 * Created by xiongkuang on 2/11/17.
 */
public class TransactionsGen {

    public static void main(String[] args){
        try {
            File fout = new File("Transactions");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 10; i++){
                Transaction transaction = new Transaction(i + 1);
                bw.write(transaction.getTransID()+","+transaction.getCustID()
                        +","+transaction.getTransTotal()+","+transaction.getTransNumItems()
                        +","+transaction.getDesc());
                bw.newLine();

            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
