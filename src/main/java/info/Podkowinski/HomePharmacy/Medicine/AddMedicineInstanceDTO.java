package info.Podkowinski.HomePharmacy.Medicine;

import java.sql.Date;


public class AddMedicineInstanceDTO {

    private int id;

    private Medicine medicine;

    private Long medicine_id;

    private Integer quantityLeft;

    private Date expiryDate;

    private Double price;

    public AddMedicineInstanceDTO(int id, Medicine medicine, Long medicine_id, Integer quantityLeft, Date expiryDate, Double price) {
        this.id = id;
        this.medicine = medicine;
        this.medicine_id = medicine_id;
        this.quantityLeft = quantityLeft;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public AddMedicineInstanceDTO() {
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }


    public Integer getQuantityLeft() {
        return quantityLeft;
    }

    public void setQuantityLeft(Integer quantityLeft) {
        this.quantityLeft = quantityLeft;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getMedicine_id() {
        return medicine_id;
    }

}
