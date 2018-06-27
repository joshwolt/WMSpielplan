import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Gruppen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Mannschaft> gruppe;
    private ArrayList<Spiel> spiele;
    

    /**
     * Konstruktor für Objekte der Klasse Gruppen
     */
    public Gruppe()
    {
        // Instanzvariable initialisieren
        gruppe= new ArrayList<Mannschaft>();
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void addToGroup( Mannschaft mannschaft )
    {
        // tragen Sie hier den Code ein
        gruppe.add(mannschaft);
    }
}
