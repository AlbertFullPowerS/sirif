package mx.edu.utez.sirif.models.Object;

public class Payment {
    private long id_payment;
    private String payment_type;
    private int payment_checkout;
    private Team team;
    public Payment()
    {

    }

    public Payment(long id_payment, String payment_type, int payment_checkout, Team team) {
        this.id_payment = id_payment;
        this.payment_type = payment_type;
        this.payment_checkout = payment_checkout;
        this.team = team;
    }

    public long getId_payment() {
        return id_payment;
    }

    public void setId_payment(long id_payment) {
        this.id_payment = id_payment;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public int getPayment_checkout() {
        return payment_checkout;
    }

    public void setPayment_checkout(int payment_checkout) {
        this.payment_checkout = payment_checkout;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
