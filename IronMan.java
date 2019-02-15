public class IronMan extends Character {
    // IronMan AKA Tony Stark
    protected int currentPower;
    final protected int maxPower;
    
    public IronMan(String n, int s, int d, int i, int p){
        super(n,s,d,i);
        maxPower = p;
        currentPower = maxPower;
    }
    
    public int handRepulser(){
        if(currentPower > 5){
            currentPower -= 5;
            damage = dice.roll() + dexterity;
            wound();
            heal();
            return damage;
       
        }else{
            return 0;
        }
    }
    
    public int chestRepulser(){
        if(currentPower > 7){
            currentPower -= 7;
            damage = dice.roll() + dexterity;
            wound();
            heal();
            return damage;
        }else{
            return 0; 
        }
    }
    
    public int getCurrentPower(){
        return currentPower;
    }

    @Override
    public int attack() {
        {
        damage = dice.roll()+strength;
        wound();
        return damage;
    
    }
   
    
}
}
