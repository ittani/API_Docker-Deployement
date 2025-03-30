package API.API_workflow;

public class Services {
private int id;
private String service;
private String businesspur;
private long payment;

    public Services(int id, String service, String businesspur, long payment) {
        this.id = id;
        this.service = service;
        this.businesspur = businesspur;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getBusinesspur() {
        return businesspur;
    }

    public void setBusinesspur(String businesspur) {
        this.businesspur = businesspur;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", businesspur='" + businesspur + '\'' +
                ", payment=" + payment +
                '}';
    }
}
