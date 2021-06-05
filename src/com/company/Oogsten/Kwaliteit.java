package com.company.Oogsten;

import com.company.AskForInput;

public abstract class Kwaliteit {
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit) {
        this.kwaliteit = geldigeKwaliteit(Kwaliteit);
    }

    private String geldigeKwaliteit(String kwaliteit){
        String correcteKwaliteit = kwaliteit;
        while (true) {
            if (kwaliteitStringVoorwaarden(correcteKwaliteit)) {
                return correcteKwaliteit;
            }
            else {
                System.out.println(geldigeKwaliteitSoortenString());
                correcteKwaliteit = AskForInput.vraagEenString();
            }
        }
    }

    public abstract String geldigeKwaliteitSoortenString();

    public abstract boolean kwaliteitStringVoorwaarden(String kwaliteit);

    public String getKwaliteitString() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }
}
