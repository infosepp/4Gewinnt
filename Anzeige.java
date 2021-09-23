
import sas.*;
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
    private Circle [] buttons;
    private Circle [][]steinCircles = new Circle[6][7];

    /**
     * Konstruktor für Objekte der Klasse Anzeige
     * @param modell Modell übergibt das Modell
     */
    public Anzeige(Modell modell)
    {
        fenster = new View(700, 700, "4 Gewinnt");
        steinCircles = new Circle[6][7];
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
            buttons[i/100] = new Circle(i+50,50,100,modell.gibFarbeAktuellerSpieler());
        }

        // weitere Spielfeldgestaltung
        Stein[][] steine = modell.gibSteine();
        
        for(int i = 0; i< steine.length; i++){
            for(int j = 0; j< steine[i].length; j++){
                steinCircles[i][j] = new Circle(j*100+50,i*100+150,100, steine[steine.length-1 -i][j].getColor());
            }
        }

    }

    /**
     * Methode gibt die Buttons zurück
     *
     * @return Button[]  
     */
    public Circle [] getButtons()
    {
        return buttons;
    }

    /**
     * Gibt das Fenster(View) zurück
     * 
     * @return View 
     */
    public View getView()
    {
        return fenster;
    }
}

