package info.Podkowinski.HomePharmacy.Medicine;

public class AddMedicineDTO {
    private int id;

    private String name;

    private String description;

    private boolean isPrescriptionNeeded;

    private boolean isSteroid;

    private boolean isAntibiotic;

    private boolean isVitamin;

    private boolean isToBuy;

    private Double officialPrice;

    public AddMedicineDTO(int id, String name, String description, boolean isPrescriptionNeeded, boolean isSteroid, boolean isAntibiotic, boolean isVitamin, boolean isToBuy, Double officialPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isPrescriptionNeeded = isPrescriptionNeeded;
        this.isSteroid = isSteroid;
        this.isAntibiotic = isAntibiotic;
        this.isVitamin = isVitamin;
        this.isToBuy = isToBuy;
        this.officialPrice = officialPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPrescriptionNeeded() {
        return isPrescriptionNeeded;
    }

    public void setPrescriptionNeeded(boolean prescriptionNeeded) {
        isPrescriptionNeeded = prescriptionNeeded;
    }

    public boolean isSteroid() {
        return isSteroid;
    }

    public void setSteroid(boolean steroid) {
        isSteroid = steroid;
    }

    public boolean isAntibiotic() {
        return isAntibiotic;
    }

    public void setAntibiotic(boolean antibiotic) {
        isAntibiotic = antibiotic;
    }

    public boolean isVitamin() {
        return isVitamin;
    }

    public void setVitamin(boolean vitamin) {
        isVitamin = vitamin;
    }

    public boolean isToBuy() {
        return isToBuy;
    }

    public void setToBuy(boolean toBuy) {
        isToBuy = toBuy;
    }

    public Double getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(Double officialPrice) {
        this.officialPrice = officialPrice;
    }
}