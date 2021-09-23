import java.awt.Color;
import java.util.Arrays;

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
<<<<<<< HEAD

=======
        modell = new Stein[6][7];
        spieler1 = new Spieler(Color.red);
        spieler2 = new Spieler(Color.yellow);
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Gibt ein 2D-Array mit allen im Attribut modell gespeicherten Steinen zurück
     * 
     * @return Stein[][]
     */    
    public Stein [][] gibSteine()
    {
<<<<<<< HEAD

=======
        return modell;
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
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
<<<<<<< HEAD

=======
        if (gibZeile(spalte) != -1)
        {
            modell[gibZeile(spalte)][spalte] = aktuellerSpieler.setzeStein();
        }
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
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

=======
        for(int i = modell.length -1; i > 0 ; i--)
        {
            if(modell[i][spalte].getColor() == null)
            {
                return i;
            }                    
        }
        return -1;
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Gib die Farbe des Attributes aktuellerSpieler zurück
     * 
     * @return Color
     */
    public Color gibFarbeAktuellerSpieler()
    {
<<<<<<< HEAD

=======
        return aktuellerSpieler.getColor();
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Überprüft, welcher Spieler im Attribut AktuellerSpieler gespeichert ist und setzt den anderen 
     * Spieler als AktuellerSpieler. 
     */
    private void spielerWechseln()
    {
<<<<<<< HEAD

=======
       if(aktuellerSpieler == spieler1)
       {
           aktuellerSpieler = spieler2;
       }
       else
       {
           aktuellerSpieler = spieler1;
       }
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Hier werden alle Pruefemethoden aufgerufen.
     * @return Wahrheitswert
     */
    public boolean pruefeGewonnen ()
    {
<<<<<<< HEAD

=======
        if(pruefeVierInEinerSpalte() == true || pruefeVierInEinerZeile() == true)
        {
            return true;
        }
        else if(pruefeVierDiagonalLR() == true || pruefeVierDiagonalRL() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Wenn vier Steine einer gleichen Farbe in einer Spalte nebeneinanderliegen gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierInEinerSpalte ()
    {
<<<<<<< HEAD

    }       
=======
        
        for (int i=0; i < modell[0].length; i++)
        {
            for (int j= modell.length-1; j > 2; j--)
            {
                if (modell[i][j].getColor() == aktuellerSpieler.getColor() && modell[i][j] != null)
                {
                    if (
                    modell[i-1][j].getColor() == aktuellerSpieler.getColor() &&
                    modell[i-2][j].getColor() == aktuellerSpieler.getColor() &&
                    modell[i-3][j].getColor() == aktuellerSpieler.getColor())
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306

    /**
     * Wenn vier Steine einer gleichen Farbe in einer Zeile nebeneinanderliegen gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierInEinerZeile ()
    {
<<<<<<< HEAD
        Color col = gibFarbeAktuellerSpieler();
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(modell[i][j] != null)
                {
                    if(modell[i][j].getColor() == col)
                    {
                        if(modell[i][j+1] != null && modell[i][j+2] != null && modell[i][j+3] != null)
                        {
                            if(modell[i][j+1].getColor() == col && modell[i][j+2].getColor() == col && modell[i][j+3].getColor() == col)
                            {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
=======

>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von links nach rechts vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalLR(Spieler pAktuellerSpieler)
    {

<<<<<<< HEAD
=======

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                Color steinFarbe = modell[i][j].getColor();
                if(steinFarbe == pAktuellerSpieler.getColor()){
                    if(steinFarbe == modell[i+1][j+1].getColor() && 
                    steinFarbe == modell[i+2][j+2].getColor() &&
                    steinFarbe == modell[i+3][j+3].getColor()){

                        return true;

                    }
                }
            }
        }
        return false;


>>>>>>> 7280f99af0fb86dae41946a017b86d440d201306
    }

    /**
     * Wenn vier Steine einer Farbe in einer Diagonalen von rechts nach links vorhanden sind, gebe true zurück, ansonsten false.
     * @return Wahrheitswert
     */
    private boolean pruefeVierDiagonalRL ()
    {

    }
}
