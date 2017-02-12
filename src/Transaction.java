import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by xiongkuang on 2/11/17.
 */
public class Transaction {
    private int TransID;
    private int CustID;
    private double TransTotal;
    private int TransNumItems;
    private String Desc;

    public Transaction(int ID){
        this.TransID = ID;
        this.CustID = ThreadLocalRandom.current().nextInt(1, 50001);
        this.TransTotal = ThreadLocalRandom.current().nextDouble(10, 1001);
        this.TransNumItems = ThreadLocalRandom.current().nextInt(1, 11);
        this.Desc = randomDesc();
    }

    private String randomDesc(){
        String alpahbet = "abcdefghijklmnopqrstuvwxyz0123456789";
        int N = ThreadLocalRandom.current().nextInt(20, 51);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(alpahbet.charAt(ThreadLocalRandom.current().nextInt(alpahbet.length())));
        }
        return sb.toString();
    }

    public int getTransID() {
        return TransID;
    }

    public int getCustID() {
        return CustID;
    }

    public double getTransTotal() {
        return TransTotal;
    }

    public int getTransNumItems() {
        return TransNumItems;
    }

    public String getDesc() {
        return Desc;
    }
}
