package pl.sda.mateusz;


import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        System.out.println( "Podaj znak zodiaku pisany w języku polskim, małymi literami" );
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        String requestResult = Connector.getPage(userInput);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)){
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);
    }
}
