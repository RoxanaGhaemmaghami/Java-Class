 class Customer {

    private int customerNumber;
    private String name;
    private Address address;
    private static int lastCustomerNumber = 0;


    public Customer(String name, Address address) {
        this.customerNumber = ++lastCustomerNumber;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    // نمایش اطلاعات مشتری
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}