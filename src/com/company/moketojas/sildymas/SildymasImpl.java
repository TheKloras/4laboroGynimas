package com.company.moketojas.sildymas;

import com.company.moketojas.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas{
    private double kubai;

    public SildymasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, double kubai) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.kubai = kubai;
    }

    @Override
    public double getKubai() {
        return this.kubai;
    }

    @Override
    public void setKubai(double kubai) {
        this.kubai = kubai;
    }
}
