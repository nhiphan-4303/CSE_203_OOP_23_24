/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab._22_01;

/**
 *
 * @author hanie
 */
public class PetServicesTicket {

    private int ticketID;
    private String customerName;
    private String phoneNumber;
    private String type;
    private String size;
    private float basePrice;
    private String services;
    private float voucher;

    public PetServicesTicket() {
        this.ticketID = 0;
        this.customerName = "";
        this.phoneNumber = "";
        this.type = "";
        this.size = "";
        this.basePrice = 0.0f;
        this.services = "";
        this.voucher = 0.0f;
    }

    public PetServicesTicket(int ticketID, String customerName, String phoneNumber, String type, String size, float basePrice, String services, float voucher) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.size = size;
        this.basePrice = basePrice;
        this.services = services;
        this.voucher = voucher;
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public float getVoucher() {
        return voucher;
    }

    public void setVoucher(float voucher) {
        this.voucher = voucher;
    }

    public float getPayment() {
        float payment;

        // base on type price formula
        float typePrice;
        if (type.equalsIgnoreCase("Dog")) {
            typePrice = basePrice * 2;
        } else {
            typePrice = basePrice;
        }

        // base on size price formula
        float sizePrice = 0.0f;
        switch (size) {
            case "Small" ->
                sizePrice = (float) (typePrice * 0.5);
            case "Medium" ->
                sizePrice = typePrice;
            case "Large" ->
                sizePrice = (float) (typePrice * 1.5);
            case "Extra Large" ->
                sizePrice = (float) (typePrice * 2);
        }

        // base on Service Price formula
        float servicePrice = 0.0f;
        if (services.contains("General Check")) {
            servicePrice += sizePrice * 0.5;
        }
        if (services.contains("Washing")) {
            servicePrice += sizePrice;
        }
        if (services.contains("Grooming")) {
            servicePrice += sizePrice * 0.5;
        }
        if (services.contains("Clipping")) {
            servicePrice += sizePrice * 0.5;
        }
        if (services.contains("Brushing")) {
            servicePrice += sizePrice * 0.5;
        }

        payment = servicePrice - voucher;
        return payment;
    }
}
