package edu.pradita.oop.session02;

import java.util.Date;

/**
 * TUGAS 001: BankAccount System
 * 
 * Soal 1-3:
 * - Constructor dengan validation
 * - Getter/Setter methods
 * - Currency validation (ID/US only)
 * - Date handling (gunakan new Date() untuk tanggal hari ini)
 */
public class BankAccount {
    
    // TODO 1: Deklarasi atribut private (Soal 1)
     private String accountNumber;
     private double balance;
    
    // TODO 2: Deklarasi atribut tambahan (Soal 2)
     private Date cardOpeningDate;
     private String currency;

    // TODO 3: Constructor Soal 1
     public BankAccount(String accountNumber) {
         // Initialize accountNumber
         // Set balance = 0.0
            this.accountNumber = accountNumber;
            this.balance = 0.0;
     }

    // TODO 4: Constructor Soal 2 dengan validasi currency (Soal 3)
    public BankAccount(String accountNumber, String currency, Date cardOpeningDate) {
        // TODO: Set accountNumber
        // TODO: Set cardOpeningDate (atau gunakan new Date() jika null)
        // TODO: Validasi currency - hanya "ID" atau "US"
        //       Jika tidak valid, print "WARNING: The currency available only on ID and US!"
        //       dan set currency = "ID" (default)
        // TODO: Set balance = 0.0
        this.accountNumber = accountNumber;
        this.cardOpeningDate = (cardOpeningDate != null) ? cardOpeningDate : new Date();
        if (currency.equals("ID") || currency.equals("US")) {
            this.currency = currency;
        } else {
            System.out.println("WARNING: The currency available only on ID and US!");
            this.currency = "ID";
        }
    }

    // TODO 5: Getter accountNumber (Soal 1)
     public String getAccountNumber() {
         return accountNumber;
     }

    // TODO 6: Getter balance (Soal 1)
     public double getBalance() {
         return balance;
     }

    // TODO 7: Method save (Soal 1)
    public void save(double amount) {
        // TODO: Tambahkan amount ke balance
        // TODO: Validasi amount > 0
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("WARNING: Amount to save must be greater than 0!");
        }
    }

    // TODO 8: Method withdraw (Soal 1)
    public void withdraw(double amount) {
        // TODO: Kurangi balance dengan amount
        // TODO: Validasi amount > 0 dan amount <= balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("WARNING: Amount to withdraw must be greater than 0!");
        } else {
            System.out.println("WARNING: Insufficient balance!");
        }
    }

    // TODO 9: Getter cardOpeningDate (Soal 2)
     public Date getCardOpeningDate() {
         return cardOpeningDate;
     }

    // TODO 10: Getter currency (Soal 2)
     public String getCurrency() {
         return currency;
     }

    // TODO 11: Setter currency dengan validasi (Soal 2 + 3)
    public void setCurrency(String currency) {
        // TODO: Validasi currency - hanya "ID" atau "US"
        // TODO: Jika tidak valid, print WARNING dan jangan ubah
        if (currency.equals("ID") || currency.equals("US")) {
            this.currency = currency;
        } else {
            System.out.println("WARNING: The currency available only on ID and US!");
        }
    }

    // Helper method untuk print info (opsional)
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", cardOpeningDate=" + cardOpeningDate +
                '}';
    }
}
