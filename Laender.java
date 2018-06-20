
/**
 * Beschreiben Sie hier die Klasse Laender.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Laender
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int punkte;
    

    /**
     * Konstruktor für Objekte der Klasse Laender
     */
    public Laender(String name)
    {
        // Instanzvariable initialisieren
        punkte=0;
        this.name=name;
    }

    public int gibPunkte()
    {
        return punkte;
    }
}
