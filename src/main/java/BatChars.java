public class BatChars {
    public String name;  
    public String alias;
    public String gimic; 
    public boolean hasCostume;

    public BatChars(String name, String alias, String gimic) {
        this.name = name; 
        this.alias = alias; 
        this.gimic = gimic; 
        this.hasCostume = true; 
    }

    public void noCostume() {
        this.hasCostume = false; 
    }
}

enum Alignment {
    lawfulGood, 
    neutralGood,
    chaoticGood,
    lawfulNeutral,
    trueNeutral,
    chaoticNeutral,
    lawfulEvil,
    neutralEvil,
    chaoticEvil
}    
