package collections;
class Order {
    private String id;
    private boolean isdelivered;

    public Order(String id, boolean isdelivered) {
        this.id = id;
        this.isdelivered = isdelivered;
    }

    public boolean isdelivered() {
        return isdelivered;
    }

    @Override
    public String toString() {
        return "Order{id='" + id + "', isdelivered=" + isdelivered + "}";
    }
}
