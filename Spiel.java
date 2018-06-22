
/**
 * Beschreiben Sie hier die Klasse Spie.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse Spie
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void verechneSpiel(Laender land1, Laender land2)
    {
        if(land1.gibTore() < land2.gibTore())
        {
            land2.addPunkte(3);
        }
        else if(land1.gibTore() > land2.gibTore())
        {
            land1.addPunkte(3);
        }
        else
        {
            land2.addPunkte(1);
            land1.addPunkte(1);
        }
    }
}
