import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Modell.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Modell
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Stein [][] modell;
    private Spieler aktuellerSpieler;
    private Spieler spieler1;
    private Spieler spieler2;

    /**
     * Konstruktor für Objekte der Klasse Modell
     */
    public Modell()
    {
        
    }

    public Stein [][] gibSteine()
    {
        
    }

    /**
     * Wenn der Spieler noch Steine vorhanden hat, holt sich das Modell den Stein vom aktuellen Spieler.
     * Die aktuell mögliche Zeile wird ermittelt. Sollte diese != -1 sein, wird das Modell mit dem
     * Stein an aktueller Position erweitert. Sollte noch kein Spieler gewionnen haben, wird der 
     * Spieler gewechselt.
     */
    public void setzeStein(int spalte)
    {
        
    }

    /**
     * Hier wird die aktuelle Zeile zurückgegeben. Sollte auch die oberste Zeile belegt sein, wird - 1
     * zurück gegeben.
     */
    public int gibZeile(int spalte)
    {
        
    }

    public Color gibFarbeAktuellerSpieler()
    {
        
    }

    private void spielerWechseln()
    {
       
    }

    /**
     * Hier werden alle Pruefemethoden aufgerufen. 
     */
    public boolean pruefeGewonnen ()
    {
        
    }

    private boolean pruefeVierInEinerSpalte ()
    {
        
    }       

    private boolean pruefeVierInEinerZeile ()
    {
        
    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von links nach rechts vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalLR ()
    {
        
    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von rechts nach links vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalRL ()
    {
        
    }
}
