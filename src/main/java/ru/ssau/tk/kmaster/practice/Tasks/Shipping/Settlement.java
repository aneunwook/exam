package ru.ssau.tk.kmaster.practice.Tasks.Shipping;

public class Settlement extends Location {

    private int settlement;
    private SettlementType type;

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public int getSettlement() {
        return settlement;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public SettlementType getType() {
        return type;
    }
}
