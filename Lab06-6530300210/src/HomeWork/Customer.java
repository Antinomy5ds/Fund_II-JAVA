package HomeWork;

public class Customer {
    private String id, firstName, lastName;

    // เซ็ทข้อมูลลูกค้า
    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ส่งเลข id คืน
    public String getId() {
        return this.id;
    }

    // ส่งข้อมูลชื่อจริง
    public String getFirstName() {
        return this.firstName;
    }

    // ส่งข้อมูลขามสกุล
    public String getLastName() {
        return this.lastName;
    }
}
