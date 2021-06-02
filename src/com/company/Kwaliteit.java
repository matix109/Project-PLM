package com.company;

class Kwaliteit {
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit) {
        this.kwaliteit = geldigeKwaliteit(Kwaliteit);
    }

    private String geldigeKwaliteit(String kwaliteit){
        String correcteKwaliteit = kwaliteit;
        while (true) {
            if (kwaliteitString(correcteKwaliteit)) {
                return correcteKwaliteit;
            }
            else {
                System.out.println("Dat is geen geldige Kwaliteit. Voer Slecht,Algemeen of Goed in: ");
            correcteKwaliteit = AskForInput.vraagEenString();
            }
        }
    }

    private boolean kwaliteitString(String kwaliteit){
        return kwaliteit.equalsIgnoreCase("slecht") || kwaliteit.equalsIgnoreCase("algemeen") || kwaliteit.equalsIgnoreCase("goed");
    }

    public String getKwaliteitString() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }
}
