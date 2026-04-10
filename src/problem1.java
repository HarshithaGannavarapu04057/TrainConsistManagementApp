class Transaction  {
    String id;
    double fee;
    String timestamp;

    Transaction (String id, double fee, String timestamp) {
        this.id = id;
        this.fee = fee;
        this.timestamp = timestamp;
    }
}