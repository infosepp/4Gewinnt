import sas.*;
import sasio.*;
import java.awt.Color;
/**
 * Die Klasse Anzeige regelt die Grafik des Spiels
 * 
 * @author (Luka und Leon) 
 * 
 * @version (21.09.2021)
 */
public class Anzeige
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private View fenster;
    private Modell modell;
    private Button [] buttons;

    /**
     * Konstruktor für Objekte der Klasse Anzeige
     * @param modell Modell übergibt das Modell
     */
    public Anzeige(Modell modell)
    {
        fenster = new View(700, 700, "4 Gewinnt");
    }

    /**
     * Aktuallisiert die Anzeige. Dabei wird das Spielfeld auf dem Frame der durch die 
     * SAS-Bibliothek erzeugt wurde (fenster) gezeichnet. In der oberen Zeile werden dabei
     * Buttons erzeugt, auf die der Spieler klicken kann um die Spalte für seinen nächsten
     * Wurf zu bestimmen.     * 
     * Bisher geworfene Steine werden
     * über die Verknüpfung zum Modell (modell) geholt und ebenfalls gezeichnet.
     */
    public void updateView()
    {
        for(int i = 0; i < 700; i = i + 100)
        {
            buttons[i/100] = new Button(i,0, 100, 100,"V", modell.gibFarbeAktuellerSpieler());
        }
        // weitere Spielfeldgestaltung
    }

    /**
     * Methode gibt die Buttons zurück
     *
     * @return Button[]  
     */
    public Button [] getButtons()
    {

    }

    /**
     * Gibt das Fenster(View) zurück
     * 
     * @return View 
     */
    public View getView()
    {

    }
}

