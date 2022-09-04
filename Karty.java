package uloha9_karty;

/**
 * trieda Karty obsahuje premenne skratka, typKarty. typKarty1, farbaKarty
 */
public class Karty {

    public String skratka;
    public char typKarty;
    public char typKarty1;
    public char farbaKarty;


    /**
     * konstruktor vytvori novy objekt s parametrom skratka
     * @param skratka skrateny popis, ktory zada uzivatel
     */
    public Karty(String skratka) {
        this.skratka = skratka;
    }

    /**
     * metoda rozparsuje skrateny popis karty, porovna a vypise na vystup plny popis karty
     * @return popis karty
     */
    public String getPopis() {
        String popis = "";
        typKarty = skratka.charAt(0);
        farbaKarty = skratka.charAt(1);

        if (skratka.length() == 2) {

            switch (typKarty) {

                case '2':
                    popis = "Dvojka ";
                    break;
                case '3':
                    popis = "Trojka ";
                    break;
                case '4':
                    popis = "Stvorka ";
                    break;
                case '5':
                    popis = "Patka ";
                    break;
                case '6':
                    popis = "Sestka ";
                    break;
                case '7':
                    popis = "Sedmicka ";
                    break;
                case '8':
                    popis = "Osmicka ";
                    break;
                case '9':
                    popis = "Deviatka ";
                    break;
                case 'E':
                    popis = "Eso ";
                    break;
                case 'K':
                    popis = "Kral ";
                    break;
                case 'D':
                    popis = "Dolnik ";
                    break;
                case 'H':
                    popis = "Hornik ";
                    break;
                default:
                    popis = "Neznamy typ karty";

            }


            switch (farbaKarty) {
                case 'G':
                    popis += "Gulova/y";
                    break;
                case 'M':
                    popis += "Makova/y";
                    break;
                case 'Z':
                    popis += "Zelena/y";
                    break;
                case 'C':
                    popis += "Cervena/y";
                    break;
                default:
                    popis = "Neznamy typ karty";

            }

        }
        else if (skratka.length() == 3) {

            typKarty = skratka.charAt(0);
            typKarty1 = skratka.charAt(1);
            farbaKarty = skratka.charAt(2);

            if (skratka.startsWith("10")) {
                popis = "Desiatka ";

            } else {
                popis = "Neznamy typ karty";
            }


            char farbaKarty = skratka.charAt(2);
            switch (farbaKarty) {
                case 'G':
                    popis += "Gulova";
                    break;
                case 'M':
                    popis += "Makova";
                    break;
                case 'Z':
                    popis += "Zelena";
                    break;
                case 'C':
                    popis += "Cervena";
                    break;
                default:
                    popis = "Neznamy typ karty";

            }
        }

        return popis;
    }
}



