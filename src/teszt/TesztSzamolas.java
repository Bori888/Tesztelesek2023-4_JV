package teszt;
import beugrok.Haromszog;
import beugrok.Szamolas;

public class TesztSzamolas {
    public static void main(String[] args) {
        osszegzesTesztek();
        gyokszamTesztek();
        HaromszogTesztek();
        
        
    }

    private static void osszegzesTesztek() {
        osszegzesAzonosokkalTeszt();
        osszegzesKulonbozoekkelTeszt();
        osszegzesAzonosokkalTeszt();
        osszegzesMnuszEsNullaTeszt();
        osszegzesTombel();
    }
    private static void gyokszamTesztek() {
        /*minuszGyokszammalTeszt();*/
        pluszGyokszammalTeszt();
        nullaGyokszammalTeszt();
        negyzetszamGyokszammalTeszt();
        
    }
    private static void HaromszogTesztek() {
                /*jo testesetek*/

        pozitivHaromszogKeruleteTeszt();
        egyformaHaromszogKeruleteTeszt();
        azonosOldaluTeszt();
        azonosBefogoTesz();
        derekszogTeszt();

        /*rossz testesetek*/
        negativHaromszogKeruleteTeszt();
        nullaHaromszogKeruleteTeszt();

        

        
    }

    private static void osszegzesAzonosokkalTeszt() {
        System.out.println("teszt: osszegzesAzonosokkalTeszt()");
        int kapott = Szamolas.osszegzes(2,2);
        int vart =4;
        assert kapott ==vart: "hiba:azonos osszegzes(int,int)";
    }
    private static void osszegzesKulonbozoekkelTeszt() {
        System.out.println("teszt: osszegzesKulonbozoekkelTeszt()");
        int kapott = Szamolas.osszegzes(2,2);
        int vart =4;
        assert kapott ==vart: "hiba:kulonbozo osszegzes(int,int)";
    }
    private static void osszegzesMnuszEsNullaTeszt() {
        System.out.println("teszt: osszegzesMnuszEsNullaTeszt()");
        int kapott = Szamolas.osszegzes(-2,0);
        int vart =-2;
        assert kapott ==vart: "hiba:minusz nulla osszegzes(int,int)";
    }
    public static void osszegzesTombel() {
        System.out.println("teszt: tomb");
        int [] tomb ={-1,2,0,4};
        int kapott = Szamolas.osszegzes(tomb);
        int vart =5;
        assert kapott ==vart: "hiba: osszegzes(int tomb)";
    }
    public static void pluszGyokszammalTeszt() {
        System.out.println("teszt: pozitiv gyokvonas");
        int kapott = (int)Szamolas.gyokvonas(2);
        int vart =1;
        assert kapott ==vart: "hiba: pozitivgyokvonas(int )";
    }
    
    public static void minuszGyokszammalTeszt() {
        System.out.println("teszt: minusz gyokvonas");
        double kapott = (int)Szamolas.gyokvonas(-2);
        double vart = 2.449489742783178;
        assert kapott ==vart: "hiba: minusz gyokvonas(int )";
    }
    public static void nullaGyokszammalTeszt() {
        System.out.println("teszt:  nulla gyokvonas");
        int kapott = (int)Szamolas.gyokvonas(0);
        int vart = 0 ;
        assert kapott ==vart: "hiba: nulla gyokvonas(int )";
    }
    public static void negyzetszamGyokszammalTeszt() {
        System.out.println("teszt:  negyzetszam gyokvonas");
        int kapott = (int)Szamolas.gyokvonas(4);
        int vart = 2 ;
        assert kapott ==vart: "hiba: negyzetszam gyokvonas(int )";
    }
    public static void pozitivHaromszogKeruleteTeszt() {
        System.out.println("teszt:  pozitivHaromszogKeruleteTeszt");
        double kapott = (double)Haromszog.haromszogKerulete(4,5,6);
        double vart = 15 ;
        assert kapott ==vart: "hiba: pozitivHaromszogKeruleteTeszt(double ,double,double)";
    }
        public static void negativHaromszogKeruleteTeszt() {
        System.out.println("teszt:  negativHaromszogKeruleteTeszt de nem értelmezük a negativ kerületet");
        double kapott = (double)Haromszog.haromszogKerulete(-4,-5,-6);
        double vart = -15 ;
        assert kapott ==vart: "hiba: negativHaromszogKeruleteTeszt(double ,double,double)";
    }
   public static void nullaHaromszogKeruleteTeszt() {
        System.out.println("teszt:  nullaHaromszogKeruleteTeszt de ha egy 3szogy egyik oldala 0 akkor az nme  háromszög");
        double kapott = (double)Haromszog.haromszogKerulete(0,4,5);
        double vart = 9 ;
        assert kapott ==vart: "hiba: nullaHaromszogKeruleteTeszt(double ,double,double)";
    }
    public static void egyformaHaromszogKeruleteTeszt() {
        System.out.println("teszt:  egyformaHaromszogKeruleteTeszt ");
        double kapott = (double)Haromszog.haromszogKerulete(4,4,5);
        double vart = 13 ;
        assert kapott ==vart: "hiba: egyformaHaromszogKeruleteTeszt(double ,double,double)";
    }
    public static void azonosOldaluTeszt() {
        System.out.println("teszt:  azonosOldaluTeszt ");
        double kapott = (double)Haromszog.haromszogKerulete(4,4,4);
        double vart = 12 ;
        assert kapott ==vart: "hiba: azonosOldaluTeszt(double ,double,double)";
    }
    public static void azonosBefogoTesz() {
        System.out.println("teszt:  azonosBefogoTesz ");
        double kapott = (double)Haromszog.haromszogKerulete(4,4,5);
        double vart = 13 ;
        assert kapott ==vart: "hiba: azonosBefogoTesz(double ,double,double)";
    }
    public static void derekszogTeszt() {
        System.out.println("teszt:  derekszogTeszt ");
        double kapott = (double)Haromszog.haromszogKerulete(3,4,5);
        double vart = 12 ;
        assert kapott ==vart: "hiba: derekszogTeszt(double ,double,double)";
    }


   
    
    
    
    
}
