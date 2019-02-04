package com.example.Patient;

public class Patient {
    private int id;
    private String LastName;
    private String FirstName;
    private String Patronymic;
    private String Address;
    private String Telephone;
    private String MedicalCardNumber;
    private String Diagnosis;
    private String[][] patient = new String[17][8];

    public Patient() {
    }

    public String[][] getPatient() {

        return patient;
    }

    public void setPatient(String[][] patient) {

        this.patient = patient;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        getId();
        LastName = patient[1][getId()];
        return LastName;
    }


    public void setLastName(String LastName) {
        LastName = LastName;
        patient[1][getId()] = LastName;
    }

    public String getFirstName() {

        FirstName = patient[2][getId()];
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        FirstName = FirstName;
        patient[3][getId()] = FirstName;
    }

    public String getPatronymic() {
        Patronymic = patient[3][getId()];
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getAddress() {
        Address = patient[4][getId()];
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephone() {
        Telephone = patient[5][getId()];
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        Telephone = Telephone;
    }

    public String getMedicalCardNumber() {
        MedicalCardNumber = patient[6][getId()];
        return MedicalCardNumber;
    }

    public void setMedicalCardNumber(String MedicalCardNumber) {
        MedicalCardNumber = MedicalCardNumber;
    }

    public String getDiagnosis() {
        Diagnosis = patient[7][getId()];
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        Diagnosis = Diagnosis;
    }


}