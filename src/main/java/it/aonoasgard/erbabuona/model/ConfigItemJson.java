package it.aonoasgard.erbabuona.model;

import java.io.Serializable;

public class ConfigItemJson implements Serializable {

    private static final long serialVersionUID = 1L;

    private String itemID;
    private int healQuantity;

    public ConfigItemJson(){}

    public ConfigItemJson(String itemID, int healQuantity) {
        this.itemID = itemID;
        this.healQuantity = healQuantity;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getHealQuantity() {
        return healQuantity;
    }

    public void setHealQuantity(int healQuantity) {
        this.healQuantity = healQuantity;
    }

    @Override
    public String toString() {
        return "ConfigItemJson{" +
                "itemID='" + itemID + '\'' +
                ", healQuantity=" + healQuantity +
                '}';
    }
}
