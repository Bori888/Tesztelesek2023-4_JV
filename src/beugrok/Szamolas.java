
package beugrok;


public class Szamolas {
public static void main(String[] args) {
        nehanySzamOsszegenekGyoke();
    }

    public static void nehanySzamOsszegenekGyoke() {
        haromSzamGyokeKonzolon();
        otSzamGyokeKonzolon();
    }

    public static void haromSzamGyokeKonzolon() {

        int osszeg = osszegzes(2, osszegzes(3,4));
        double gyok = gyokvonas(osszeg);
        String kimenet = "%d gyöke: %.4f\n".formatted(osszeg, gyok);
        konzolraIr(kimenet);
    }
    
    public static void otSzamGyokeKonzolon() {

        int osszeg = osszegzes(new int[]{3,5,12,2,3});
        double gyok = gyokvonas(osszeg);
        String kimenet = "%d gyöke: %.4f\n".formatted(osszeg, gyok);
        

        konzolraIr(kimenet);
    }
    

    public static int osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
    public static int osszegzes(int a, int b) {

        return osszegzes(new int[]{a, b});
    }
    
    public static double gyokvonas(int osszeg) {
        return Math.sqrt(osszeg);
    }


    public static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }
    
}
