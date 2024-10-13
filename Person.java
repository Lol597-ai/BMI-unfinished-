public class Person {
    
    //Attribute
    private float aGewicht = 0;
    private float aGewichtVarianz = 2;
    private int aGroesse = 170;
    private int[] aGrooeseBereich;
    private boolean aMarkiert;


    //Eigenschaften
    public float getGewicht() {
        return aGewicht;
    }
    public void setGewicht(float pGewicht) {
        this.aGewicht = pGewicht;
    }
    public int getGroesse() {
        return aGroesse;
    }
    public void setGroesse(int pGroesse) {
        this.aGroesse = pGroesse;
    }
    public boolean getMarkiert() {
        return aMarkiert;
    }
    public String gibAlleDaten(){
        return "Gewicht: " + aGewicht + ", Größe: " + aGroesse;

    }
    public float pruefeGewicht( float pGewicht) {
        return pGewicht;
    }
}
