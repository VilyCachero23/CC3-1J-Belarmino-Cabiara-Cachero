import java.util.Scanner;
public class CharacterDuel {
    
    static Wizard strange = new Wizard("Stephen Strange", 8, 6, 6, 50);
    static IronMan tony = new IronMan("Tony Stark", 8, 9, 10, 50);
    static Scanner sc = new Scanner(System.in);
    static char strangeAttack, tonyAttack;
    
 public static void main(String[]args){
     
     int i = 1;
     
     
     while((strange.getCurrentLife()) > 0 && (tony.getCurrentLife()) > 0){
         System.out.println("\nRound " + i + "\n"); i++;
         System.out.println(strange.getName() + "(Wizard)" + ": \nLife:" + strange.getCurrentLife() + "\nMagic: " + strange.getCurrentMagic() + "\n");
         System.out.println(tony.getName() + "(Iron Man)" + ": \nLife: " + tony.getCurrentLife() + "\nPower: " + tony.getCurrentPower() + "\n");
        
            attackTypeStrange();
            if(strange.getCurrentLife() <= 0 && tony.getCurrentLife() <= 0 ){
                System.out.println("\nDraw\n");
                System.out.println("Final Health: " + strange.getName() + " : " + strange.getCurrentLife());
                System.out.println("Final Health: " + tony.getName() + " : " + tony.getCurrentLife());
                System.out.println("\nStan Lee: Excelsior!! Well, nuff said.");
                break;
            }else if(strange.getCurrentLife() <= 0){
                System.out.println(tony.getName() + " Wins!! ");
                System.out.println("Final Health: " + strange.getName() + " : " + strange.getCurrentLife());
                System.out.println("Final Health: " + tony.getName() + " : " + tony.getCurrentLife());
                System.out.println("\nDr. Strange: It was the only way. I'm in the End Game now.");
                break;
            }else if(tony.getCurrentLife() <= 0){
                System.out.println(strange.getName() + " Wins!! ");
                System.out.println("Final Health: " + strange.getName() + " : " + strange.getCurrentLife());
                System.out.println("Final Health: " + tony.getName() + " : " + tony.getCurrentLife());
                System.out.println("\nTony: Dude, you're embarrasing me in front of the Wizards. ");
                break;
            }
            attackTypeTony();
            if((strange.getCurrentLife() <= 0) && (tony.getCurrentLife() > 0)){
                System.out.println(tony.getName() + " Wins!!");
                System.out.println(strange.getName() + " Final Health: " + strange.getCurrentLife());
                System.out.println(tony.getName() + " Final Health: " + tony.getCurrentLife());
                System.out.println("\nDr. Strange: It was the only way. I'm in the End Game now.");
                break;
            }
            if((strange.getCurrentLife( )> 0)&&(tony.getCurrentLife() <= 0)){
                System.out.println(strange.getName() + " Wins!!");
                System.out.println(strange.getName() + "Final Health: " + strange.getCurrentLife());
                System.out.println(tony.getName( )+ "Final Health: " + tony.getCurrentLife());
                System.out.println("\nTony: Dude, you're embarrasing me in front of the Wizards. ");
                break;
            }
            if((strange.getCurrentLife() <= 0)&&(tony.getCurrentLife() <= 0)){
                System.out.println("\nDraw!\n");
                System.out.println(strange.getName() + "Final Health: " + strange.getCurrentLife());
                System.out.println(tony.getName()+ "Final Health: " + tony.getCurrentLife());
                System.out.println("\nStan Lee: Excelsior!! Well, nuff said.");
                break;
            
             }
        }
     
    }
    
    static void attackTypeStrange(){
        System.out.println("\nChoose an attck type for " + strange.getName() + ": ");
        System.out.println("[Q] - Lightning Bolt \n[W] - Normal Attack \n[E] Heal \n");
        strangeAttack = sc.next().charAt(0);
        
        switch(strangeAttack){
            case 'q':
            case 'Q':
                System.out.println("\n" +strange.getName() + " attacks " + tony.getName() + " with a Lightning Bolt for " + tony.attack() + "\n");
                break;
                
            case 'w':
            case 'W':
                System.out.println("\n" + strange.getName() + " attacks " + tony.getName() + " for " + tony.attack() + "\n");
                break;
                
            case 'e':
            case 'E':
                if(strange.castHeal() >= strange.getMaxLife()){
                    System.out.println("Sorry, you cannot use your healing power right now");
                }else{
                System.out.println("\n" + strange.getName() + " has been healed and gained " + strange.castHeal() + " health" + "\n");
                
                break;
                }
                
            default:
                System.out.println("The Attack Type is Not Recognized\n");
                attackTypeStrange();
        }
    }
    
    static void attackTypeTony(){
        System.out.println("\nChoose an attack type for " + tony.getName() + ": ");
        System.out.println("[Q] - Hand Repulser \n[W] - Normal Attack \n[E] Chest Repulser \n");
        tonyAttack = sc.next().charAt(0);
        
        switch (tonyAttack){
            case 'q':
            case 'Q':
                System.out.println(tony.getName() + " attacks " + strange.getName() + " using his Hand Repulser for " + strange.attack() + "\n");
                break;
                
            case 'w':
            case 'W':
                System.out.println(tony.getName() + " attacks " + strange.getName() + " for " + strange.attack() + "\n");
                break;
                
            case 'e':
            case 'E':
                System.out.println(tony.getName() + " attacks" + strange.getName() + " using his Chest Repulser for" + strange.attack() + "\n");
                break;
            
            default:
                System.out.println("\nThe Attack Type is Not Recognized\n ");
                attackTypeTony();
           
        }
    }

   



}
        
      

