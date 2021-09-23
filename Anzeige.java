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
<<<<<<< HEAD
            buttons[i/100] = new Button(i,0, 100, 100,"V", modell.gibFarbeAktuellerSpieler());
        }
        // weitere Spielfeldgestaltung
=======
            buttons[i/100] = new Circle(i+50,50, 100, modell.gibFarbeAktuellerSpieler());
        }
        // weitere Spielfeldgestaltung
        Stein[][] steine = modell.gibSteine();
        
        for(int i = 0; i< steine.length; i++){
            for(int j = 0; j< steine[i].length; j++){
                
            }
        }
        
>>>>>>> 345a1e42d0fdc79ddccb749bbb9557d1538cb201
    }

    /**
     * Methode gibt die Buttons zurück
     *
     * @return Button[]  
     */
    public Button [] getButtons()
    {
<<<<<<< HEAD

=======
        return buttons;
>>>>>>> d94246adf4e6f54eb921123d1b8ad06d3db05650
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

