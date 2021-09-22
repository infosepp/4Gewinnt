import sas.*;
import sasio.*;
import java.awt.Color;
/**
 * Beschreiben Sie hier die Klasse VierGewinnt. => Modell
 * 
<<<<<<< HEAD
 * @author (Huhu) 
 * @version (eine Versionsnummer oder ein Datum)
=======
 * @author (Tom, Joshua) 
 * @version (21.09.2021)
>>>>>>> 37e19d8a6757cecb7abd9db8e8b509e97d7424e7
 */
public class Controller
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    private Anzeige anzeige;
    private Modell modell;

    /**
     * Konstruktor für Objekte der Klasse VierGewinnt
     */
    public Controller()
    {

    }

    /**
     * Diese Methode ermöglicht es zu Spielen (Spielschleife). Über die Buttons der Anzeige wird
     * die Spalte ermittlet in die der Spieler den Stein werfen möchte.
     */
    public void spielen()
    {
        while(modell.pruefeGewonnen() == false)
        {
            for(int i = 0; i < anzeige.getButtons().length; i++)
            {
                if(anzeige.getButtons()[i].clicked())
                {
                    modell.setzeStein(i);
                    updateView();
                }
            }
            anzeige.getView().wait(10);
        }
    }
    
    /**
     * 
     * Diese Methode aktualisiert View
     * 
     */
    private void updateView()
    {
        
    }
}
