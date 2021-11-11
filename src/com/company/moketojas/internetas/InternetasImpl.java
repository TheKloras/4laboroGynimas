package com.company.moketojas.internetas;

import com.company.moketojas.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas{
    private String ip;

    public InternetasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, String ip) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.ip = ip;
    }

    @Override
    public String getIP() {
        return this.ip;
    }

    @Override
    public void setIP(String ip) {
        this.ip = ip;
    }
}
