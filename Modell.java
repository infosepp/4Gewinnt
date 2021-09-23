import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse Modell.
 * 
 * @author (Henning Ainödhofer) 
 * @version (22.09.21, 16:20)
 */
public class Modell
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Stein [][] modell; //6/7 erste Stelle Zeilen, zweite Stelle die Spalten
    private Spieler aktuellerSpieler;
    private Spieler spieler1;
    private Spieler spieler2;

    /**
     * Konstruktor für Objekte der Klasse Modell
     */
    public Modell()
    {
        modell = new Stein[6][7];
        spieler1 = new Spieler(Color.red);
        spieler2 = new Spieler(Color.yellow);
    }

    /**
     * Gibt ein 2D-Array mit allen im Attribut modell gespeicherten Steinen zurück
     * 
     * @return Stein[][]
     */    
    public Stein [][] gibSteine()
    {
        return modell;
    }

    /**
     * Wenn der Spieler noch Steine vorhanden hat, holt sich das Modell den Stein vom aktuellen Spieler.
     * Die aktuell mögliche Zeile wird ermittelt. Sollte diese != -1 sein, wird das Modell mit dem
     * Stein an aktueller Position erweitert. Sollte noch kein Spieler gewionnen haben, wird der 
     * Spieler gewechselt.
     * 
     * @param spalte - gibt die Spalte an, die vom Spieler gewählt wurde (Spaltenzählung ab 0)
     */
    public void setzeStein(int spalte)
    {
        if (gibZeile(spalte) != -1)
        {
            modell[gibZeile(spalte)][spalte] = aktuellerSpieler.setzeStein();
        }
    }

    /**
     * Hier wird die aktuelle Zeile zurückgegeben. Sollte auch die oberste Zeile belegt sein, wird - 1
     * zurück gegeben.
     * 
     * @param spalte - gibt die Spalte an, die vom Spieler gewählt wurde (Spaltenzählung ab 0)
     * @return zeilenwert - gibt die Zeile an, die von oben gesehen noch frei ist
     */
    public int gibZeile(int spalte)
    {
<<<<<<< HEAD
        for(int i = modell.length -1; i > 0 ; i--)
        {
            if(modell[i][spalte].getColor() == null)
            {
                return i;
            }                    
        }
        return -1;
=======

>>>>>>> 0d6c163b659b3163ac5b406fbe228b21648e3a4b
    }

    /**
     * Gib die Farbe des Attributes aktuellerSpieler zurück
     * 
     * @return Color
     */
    public Color gibFarbeAktuellerSpieler()
    {
        return aktuellerSpieler.getColor();
    }

    /**
     * Überprüft, welcher Spieler im Attribut AktuellerSpieler gespeichert ist und setzt den anderen 
     * Spieler als AktuellerSpieler. 
     */
    private void spielerWechseln()
    {
<<<<<<< HEAD
       if(aktuellerSpieler == spieler1)
       {
           aktuellerSpieler = spieler2;
       }
       else
       {
           aktuellerSpieler = spieler1;
       }
=======

>>>>>>> 0d6c163b659b3163ac5b406fbe228b21648e3a4b
    }

    /**
     * Hier werden alle Pruefemethoden aufgerufen.
     * @return Wahrheitswert
     */
    public boolean pruefeGewonnen ()
    {

    }

    /**
     * Wenn vier Steine einer gleichen Farbe in einer Spalte nebeneinanderliegen gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierInEinerSpalte ()
    {

    }       

    /**
     * Wenn vier Steine einer gleichen Farbe in einer Zeile nebeneinanderliegen gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierInEinerZeile ()
    {

    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von links nach rechts vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalLR ()
    {
<<<<<<< HEAD
        int zahl = 0;
        int laenge = 0;
        if (modell.length < modell[0].length){
            laenge = modell.length;
        }
        else {
            laenge = modell[0].length;
        }
        for (int i = 0; i < laenge; i++)
        {
            if (modell[i][i] == modell[i+1][i+1])
            {
                zahl++;
            }
            else
            {
                zahl = 0;   
            }
        }
        if (zahl >= 4)
        {
            return true;
        }
        else 
        {
            return false;   
        }
=======
>>>>>>> 0d6c163b659b3163ac5b406fbe228b21648e3a4b

    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von rechts nach links vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalRL ()
    {

    }
}
