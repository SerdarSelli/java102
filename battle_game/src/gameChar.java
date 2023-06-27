public abstract class gameChar {
    private String characterName;
    private int charDamage;
    private int charHealth;
    private int charMoney;

    public gameChar(String characterName, int charDamage, int charHealth, int charMoney) {
        this.characterName = characterName;
        this.charDamage = charDamage;
        this.charHealth = charHealth;
        this.charMoney = charMoney;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }


    public int getCharDamage() {
        return charDamage;
    }

    public void setCharDamage(int charDamage) {
        this.charDamage = charDamage;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }

    public int getCharMoney() {
        return charMoney;
    }

    public void setCharMoney(int charMoney) {
        this.charMoney = charMoney;
    }
}
