package com.company.moketojas;

public class MoketojasImpl implements Moketojas{
    private int moketojoKodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;

    public MoketojasImpl(int moketojoKodas,String vardas, String pavarde, String adresas, double suma){
        this.moketojoKodas = moketojoKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    @Override
    public int getMoketojoKodas() {
        return this.moketojoKodas;
    }

    @Override
    public void setMoketojoKodas(int moketojoKodas) {
        this.moketojoKodas = moketojoKodas;
    }

    @Override
    public String getVardas() {
        return this.vardas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String getPavarde() {
        return this.pavarde;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public String getAdresas() {
        return this.adresas;
    }

    @Override
    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    @Override
    public double getSuma() {
        return this.suma;
    }

    @Override
    public void setSuma(double suma) {
        this.suma = suma;
    }
}
