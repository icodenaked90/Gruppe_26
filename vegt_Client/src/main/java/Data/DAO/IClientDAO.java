package Data.DAO;

import java.io.IOException;

public interface IClientDAO {


    double getWeight() throws IOException; // S crlf			           			S S        5.234 kg  crlf //returnerer hvad vægten er lige nu


    double getTaraWeight() throws IOException; // T crlf			    				T S        1.234 kg  crlf //vægt tarares


    void printOnWeightDisplay(String text) throws IOException; // D ”TEST” crlf		    			D A crlf     // skriver TEST i veje display


    void printOnTextDisplay(String text) throws IOException; // P111 ”TEST” crlf					P111 A crlf (plads op til 30 karakterer)


    void displayWeight() throws IOException; // DW crlf			    				DW A  crlf //retunerer/skifter til vægt visning


    //RM20 8 ”INDTAST NR” ”” ”&3” crlf  			RM20 B crlf
    // Skriver INDTAST NR (lille display). Afventer indtastning (her 123), som så retunerer: RM20 A ”123” crlf
    void printOnSmallAndWait(); //  Virker mærkelig at bruge - kan ikke finde ud af den.



}
