
public class MainPage {
    public static void main(String[] args) {
        IDandPass ac = new IDandPass();
        AdminPass adAc = new AdminPass();

        Login login = new Login(ac.getAccountInfo(), adAc.getAdmin());
        System.out.println();
    }
}
