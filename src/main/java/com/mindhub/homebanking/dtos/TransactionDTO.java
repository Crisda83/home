package com.mindhub.homebanking.dtos;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;

import java.time.LocalDateTime;
import java.util.Set;

public class TransactionDTO {

private long Id;

private TransactionType type;

private  LocalDateTime date;

private  String description;

private double amount;

    public TransactionDTO() {
    }


public TransactionDTO(Transaction transaction){
    this.Id = transaction.getId();
    this.type = transaction.getType();
    this.date = transaction.getDate();
    this.description = transaction.getDescription();
    this.amount = transaction.getAmount();

}

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
