package pl.sda.mateusz;


import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        System.out.println( "Hej, jak masz na imię?" );
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println( userName + " którego dnia miesiąca się urodziłeś?");
        Integer day = scan.nextInt();
        System.out.println( userName + " w którym miesiącu się urodziłeś? Podaj liczbę");
        Integer month = scan.nextInt();
        String sign = ZodiacSignRecogniser.getSign(day, month);
        String requestResult = Connector.getPage(sign);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)){
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);
    }
}
