import java.util.HashMap;

public class IDandPass {
    HashMap<String, String> account = new HashMap<String, String>();

    IDandPass() {
        account.put("John", "45689");
        account.put("Jack", "45789");
        account.put("Mack", "45876");
    }

    protected HashMap getAccountInfo() {
        return account;
    }
}
