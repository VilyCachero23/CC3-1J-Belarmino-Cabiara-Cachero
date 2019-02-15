public abstract class Character{
    protected String name;
    protected int strength, dexterity, intelligence, currentLife, damage, lifeUp;
    final protected int maxLife;
    Dice dice = new Dice();
    public Character(){
        name = "";
        strength = 0;
        dexterity = 0;
        intelligence = 0;
        maxLife = dice.roll()*10;
        currentLife = maxLife;
    }
    public Character(String n, int s, int d, int i){
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        maxLife = dice.roll()*10;
        currentLife = maxLife;
    }
    public abstract int attack();
    
    public void wound(){
        currentLife -= damage;
    }
    public int heal(){
        lifeUp = dice.roll();
        currentLife += lifeUp;
        return lifeUp;
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getCurrentLife(){
        return currentLife;
    }
    public int getMaxLife(){
        return maxLife;
    }
}