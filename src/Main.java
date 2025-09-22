public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int wynik = suma(2, 6);
        System.out.println(wynik);
        przywitajSie("Ania");
        wypiszLiczbyDwucyfroweParzyste();
        System.out.println(sumaLiczbOdADoB(2, 7));
        System.out.println(sumaLiczbOdADoB(7, 2));
        System.out.println(czyPierwsza(23)); //true
        System.out.println(czyPierwsza(2)); //true
        System.out.println(czyPierwsza(1)); //false
        System.out.println(czyPierwsza(25)); //false
        System.out.println(czyPierwsza(24)); //false

        System.out.println(ileDzielnikawMaLiczba(12)); //6
        System.out.println(ileDzielnikawMaLiczba(1)); //1
        System.out.println(nwd(48,34)); //2
        System.out.println(nwd(48,0)); //48
        System.out.println(nwd(0,10)); //10
    }

    private static int suma(int a, int b) {
        return a + b;
    }

    private static void przywitajSie(String imie) {
        System.out.println("Dzień dobry " + imie);
    }

    /**
     * wypiszLiczbyDwucyfroweParzyste - wypisuje wszystkie liczby parzyste od 10 do 98
     * argumenty brak
     * zwracana wartość brak
     */
    private static void wypiszLiczbyDwucyfroweParzyste() {
        System.out.println("Liczby dwucyfrowe parzyste");
        for (int i = 10; i < 100; i += 2) {
            System.out.print(i + ", ");
        }
    }

    /**
     * sumaLiczbOdADoB - oblicza sume wszystkich liczb całkowitych ppomiędzy a i b
     *
     * @param a - początek zakresu należy dodać do sumy
     * @param b - koniec zakresu należy do sumy
     * @return - suma wszystkich liczb od a do b
     */
    private static int sumaLiczbOdADoB(int a, int b) {
        int suma = 0;
        if (a > b) {
            //a=2 b =5
            a = a + b;//7
            b = a - b;//2
            a = a - b;//5
            //b=2 a= 5
        }
        for (int i = a; i <= b; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * czyPierwsza - sprawdza czy liczba jest pierwsza
     *
     * @param liczba - liczba całkowita dodatnia dla której sprawdzane jest czy jest pierwsza
     * @return zwraca true jeżeli liczba jest liczbą pięrwszą, false w przeciwnym wypadku
     */
    private static boolean czyPierwsza(int liczba) {
        if (liczba == 1) {
            return false;
        }
        int pierwiastek = (int) (Math.sqrt(liczba));
        for (int i = 2; i <= pierwiastek; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Zwraca nwd metodą euklidesa
     * @param a pierwsza liczba >=0
     * @param b druga liczba >=0
     * @return najwiekszy wspolny dzielnik
     */
    private static int nwd(int a, int b) {
        while(b!=0){
            int reszta = a%b;
            a=b;
            b=reszta;
        }
        return a;
    }

    /**
     * @param liczba
     * @return
     */
    private static int ileDzielnikawMaLiczba(int liczba) {
        int licznikDzielnikow = 0;
        for (int i = 1; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                if (i == liczba / i) {
                    licznikDzielnikow++;
                    break;
                } else {
                    licznikDzielnikow = licznikDzielnikow + 2;
                }
            }
        }
        return licznikDzielnikow;
    }
}