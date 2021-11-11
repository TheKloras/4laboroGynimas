package com.company.moketojas.telefonas;

import com.company.moketojas.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements Telefonas{
    private int numeris;

    public TelefonasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, int numeris) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.numeris = numeris;
    }

    @Override
    public int getNumeris() {
        return this.numeris;
    }

    @Override
    public void setNumeris(int numeris) {
        this.numeris = numeris;
    }
}
