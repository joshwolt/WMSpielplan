import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Gruppen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gruppen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Laender> gruppe;
    

    /**
     * Konstruktor für Objekte der Klasse Gruppen
     */
    public Gruppen()
    {
        // Instanzvariable initialisieren
        gruppe= new ArrayList<Laender>();
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void addToGroup( Laender land )
    {
        // tragen Sie hier den Code ein
        gruppe.add(land);
    }
}
