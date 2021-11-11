package com.company;

import com.company.moketojas.MoketojasImpl;
import com.company.moketojas.internetas.Internetas;
import com.company.moketojas.internetas.InternetasImpl;
import com.company.moketojas.sildymas.SildymasImpl;
import com.company.moketojas.telefonas.Telefonas;
import com.company.moketojas.telefonas.TelefonasImpl;

public class Main {

    public static void main(String[] args) {
        MoketojasImpl moketojas1 = new MoketojasImpl(521455, "Voldemaras", "Kazlauskas", "Girios g. 6", 6558.71);
        MoketojasImpl moketojas2 = new MoketojasImpl(512646, "Voldemaras", "Kazlauskas", "Girios g. 6", 41.10);
        MoketojasImpl moketojas3 = new MoketojasImpl(645654, "Voldemaras", "Kazlauskas", "Girios g. 6", 985.40);

        TelefonasImpl moketojas4 = new TelefonasImpl(68465,"Voldemaras", "Kazlauskas", "Girios g. 6", 215.01, 869512448);
        TelefonasImpl moketojas5 = new TelefonasImpl(23135,"Voldemaras", "Kazlauskas", "Girios g. 6", 9554.99, 864432615);
        TelefonasImpl moketojas6 = new TelefonasImpl(6518998,"Voldemaras", "Kazlauskas", "Girios g. 6", 8541.10, 869954782);

        SildymasImpl moketojas7 = new SildymasImpl(65451, "Voldemaras", "Kazlauskas", "Girios g. 6", 3655.48, 80);
        SildymasImpl moketojas8 = new SildymasImpl(656548, "Voldemaras", "Kazlauskas", "Girios g. 6", 9558.74, 55);
        SildymasImpl moketojas9 = new SildymasImpl(654654, "Voldemaras", "Kazlauskas", "Girios g. 6", 124.78, 25);

        InternetasImpl moketojas10 = new InternetasImpl(894654, "Voldemaras", "Kazlauskas", "Girios g. 6", 666.20, "145.88.45.125");
        InternetasImpl moketojas11 = new InternetasImpl(6456448, "Voldemaras", "Kazlauskas", "Girios g. 6", 845, "245.55.84.146");
        InternetasImpl moketojas12 = new InternetasImpl(5645684,"Voldemaras", "Kazlauskas", "Girios g. 6", 654, "155.244.155.5");

        MoketojasImpl[] moketojai = new MoketojasImpl[12];
        moketojai[0] = moketojas1;
        moketojai[1] = moketojas2;
        moketojai[2] = moketojas3;
        moketojai[3] = moketojas4;
        moketojai[4] = moketojas5;
        moketojai[5] = moketojas6;
        moketojai[6] = moketojas7;
        moketojai[7] = moketojas8;
        moketojai[8] = moketojas9;
        moketojai[9] = moketojas10;
        moketojai[10] = moketojas11;
        moketojai[11] = moketojas12;

        double internetas = 0;
        double sildymas = 0;
        double telefonas = 0;

        for(MoketojasImpl moketojas : moketojai){
            if(moketojas instanceof TelefonasImpl){
                telefonas += moketojas.getSuma();
            }
            else if(moketojas instanceof  SildymasImpl){
                sildymas += moketojas.getSuma();
            }
            else if(moketojas instanceof InternetasImpl){
                internetas += moketojas.getSuma();
            }
        }
        System.out.println("Internetas: " + internetas);
        System.out.println("Sildymas: " + sildymas);
        System.out.println("Telefonas " + telefonas);
    }
}
