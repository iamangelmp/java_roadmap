package enumeracion;

public enum Continentes {
    AMERICA(36),
    EUROPA(23),
    AFRICA(22),
    OCEANIA(53),
    ASIA(43);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
