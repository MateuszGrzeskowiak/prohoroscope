package pl.sda.mateusz;


import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        System.out.println( "Podaj znak zodiaku pisany w języku polskim, małymi literami" );
        Scanner scan = new Scanner(System.in);
        String requestResult = Connector.getPage(scan.nextLine());
        System.out.println(requestResult);
        if (requestResult.equals(Connector.NOT_FOUND)){
            System.out.println(requestResult);
        }


    }
}
