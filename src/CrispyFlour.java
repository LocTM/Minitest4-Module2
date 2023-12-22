import java.time.LocalDate;

public class CrispyFlour extends Material {
    public double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }


    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

}
