import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Spielplan.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielplan
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Gruppe> gruppe;
     
    /**
     * Konstruktor für Objekte der Klasse Spielplan
     */
    public Spielplan()
    {
        // Instanzvariable initialisieren
        gruppe= new ArrayList<Gruppe>();
    }
    
    public void fügeGruppeHinzu(Gruppe gruppe)
    {
        this.gruppe.add(gruppe);
    }

    
}
     
