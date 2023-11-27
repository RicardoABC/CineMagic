package com.Booster.CineMagic.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transactions")
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;
    private String customerName;
    private Long billboardID;
    private String seat;
    private String paymentDetails;

    // Constructor
    public Transaction()
    {}

    public Transaction(Long idTransaction, String customerName, Long billboardID, String seat, String paymentDetails)
    {
        this.idTransaction = idTransaction;
        this.customerName = customerName;
        this.billboardID = billboardID;
        this.seat = seat;
        this.paymentDetails = paymentDetails;
    }

    // Getters
    public Long getIdTransaction()
    {
        return this.idTransaction;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public Long getBillboardID()
    {
        return this.billboardID;
    }

    public String getSeat()
    {
        return this.seat;
    }

    public String getPaymentDetails()
    {
        return this.paymentDetails;
    }

    // Setters
    public void setIdTransaction(Long idTransaction)
    {
        this.idTransaction = idTransaction;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setBillboardID(Long billboardID)
    {
        this.billboardID = billboardID;
    }

    public void setSeat(String seat)
    {
        this.seat = seat;
    }

    public void setPaymentDetails(String paymentDetails)
    {
        this.paymentDetails = paymentDetails;
    }
}