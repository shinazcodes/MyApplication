package com.example.myapplication.table;

public class TableData {
    String Date, SalesmanName, MOP, chequeNO, Dated, Bank;
    Integer slNo, ReceiptNo, Amount;

    public void setDate(String date) {
        Date = date;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public void setMOP(String MOP) {
        this.MOP = MOP;
    }

    public void setChequeNO(String chequeNO) {
        this.chequeNO = chequeNO;
    }

    public void setDated(String dated) {
        Dated = dated;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public void setSlNo(Integer slNo) {
        this.slNo = slNo;
    }

    public void setReceiptNo(Integer receiptNo) {
        ReceiptNo = receiptNo;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public String getMOP() {
        return MOP;
    }

    public String getChequeNO() {
        return chequeNO;
    }

    public String getDated() {
        return Dated;
    }

    public String getBank() {
        return Bank;
    }

    public Integer getSlNo() {
        return slNo;
    }

    public Integer getReceiptNo() {
        return ReceiptNo;
    }

    public Integer getAmount() {
        return Amount;
    }
}
