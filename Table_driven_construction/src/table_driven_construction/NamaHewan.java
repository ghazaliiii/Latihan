/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_driven_construction;

/**
 *
 * @author faishal
 */
public class NamaHewan {
        private static String checkName(String name){
        switch (name) {
            case "ayam":
                return "(A1) Ayam Jago";
            case "buaya":
                return "(B2) Buaya Putih";
            case "cacing":
                return "(C3) Cacing Tanah";
            case "domba":
                return "(D4) Domba Garut";
            case "elang":
                return "(E5) Elang Jawa";
            case "flamingo":
                return "(F6) Flamingo Australia";
            case "gajah":
                return "(G7) Gajah Lampung";             
            case "harimau":
                return "(H8) Harimau Sumatra";
            case "ikan":
                return "(I9) Ikan Koi";
            case "jerapah":
                return "(J10) Jerapah Ragunan";
            case "kura-kura":
                return "(K11) Kura-Kura Aldabra";
            case "laba-laba":
                return "(L12) Laba-Laba Tarantula";
            case "monyet":
                return "(M13) Monyet Beruk";
            case "nyamuk":
                return "(N14) Nyamuk Aedes Aegypti";
            case "orang utan":
                return "(015) Orang Utan Kalimantan";
            case "panda":
                return "(P16) Panda Australia";
            default:
                return "NULL";
        }
    }
    public static String getNamaHewan(String Hewan) {
        Hewan = Hewan.toLowerCase();
        return checkName(Hewan);
    }
}

