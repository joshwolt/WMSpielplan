
/**
 * Beschreiben Sie hier die Klasse Spie.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft;
    private String datum;
    private String ort;
    private int heimtore;
    private int gasttore;

    /**
     * Konstruktor für Objekte der Klasse Spie
     */
    public Spiel()
    {
       
    }
    
    public Mannschaft gibHeimmannschaft()
    {
        return heimmannschaft;
    }

    public Mannschaft gibGastmannschaft()
    {
        return gastmannschaft;
    }
    
    public String gibDatum()
    {
        return datum;
    }
    
    public String gibOrt()
    {
        return ort;
    }
    
    public int gibHeimtore()
    {
        return heimtore;
    }
    
    public int gibGasttore()
    {
        return gasttore;
    }
}
