public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int wynik = suma(2,6);
        System.out.println(wynik);
        przywitajSie("Ania");
        wypiszLiczbyDwucyfroweParzyste();
        System.out.println(sumaLiczbOdADoB(2,7));
        System.out.println(sumaLiczbOdADoB(7,2));

    }

    private static int suma(int a,int b){
        return a+b;
    }

    private static void przywitajSie(String imie){
        System.out.println("Dzień dobry "+imie);
    }

    /**
     * wypiszLiczbyDwucyfroweParzyste - wypisuje wszystkie liczby parzyste od 10 do 98
     * argumenty brak
     * zwracana wartość brak
     */
    private static void wypiszLiczbyDwucyfroweParzyste(){

    }

    /**
     * sumaLiczbOdADoB - oblicza sume wszystkich liczb całkowitych ppomiędzy a i b
     * @param a - początek zakresu należy dodać do sumy
     * @param b - koniec zakresu należy do sumy
     * @return - suma wszystkich liczb od a do b
     */
    private static int sumaLiczbOdADoB(int a,int b){
        int suma =0;

        return suma;
    }

    /**
     * @param liczba
     * @return
     */
    private static boolean czyPierwsza(int liczba){

        return true;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    private static int nwd(int a, int b){

        return a;
    }

    /**
     * @param liczba
     * @return
     */
    private static int ileDzielnikawMaLiczba(int liczba){

        return 0;
    }
}