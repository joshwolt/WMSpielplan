
/**
 * Beschreiben Sie hier die Klasse Laender.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mannschaft
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int punkte;
    private int tore;

    /**
     * Konstruktor für Objekte der Klasse Laender
     */
    public Mannschaft(String name)
    {
        // Instanzvariable initialisieren
        punkte=0;
        this.name=name;
    }

    public int gibPunkte()
    {
        return punkte;
    }
    
    public String gibName()
    {
       return name;
    }
    
    public int gibTore()
    {
        return tore;
    }
    
    public void addPunkte(int punkte)
    {
        this.punkte += punkte;
    }
    
    public void addTore(int tore)
    {
        this.tore+=tore;
    }
}