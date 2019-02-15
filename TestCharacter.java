public class TestCharacter {
    
    public static void main(String[]args){
        Character p1 = new Character("Vily" , 10, 23, 19);
        Character p2 = new Character("Jasmine" , 8, 5, 20);
        
        for (int i = 1; p1.getCurrentLife() >= 0 && p2.getCurrentLife() >= 0; i++){
            System.out.println("Round " + i + "\n");
            System.out.println(p1.getName() + "'s Life : " + p1.getCurrentLife());
            System.out.println(p2.getName() + "'s Life : " + p2.getCurrentLife());
            System.out.println("----------------------");
            
            int a = p1.attack();
            p2.wound(a);
            
            int b = p2.attack();
            p1.wound(b);
            
            System.out.println(p1.getName() + " Attacks " + p2.getName() + " : "  + a);
            System.out.println(p2.getName() + " Attacks " + p1.getName() + " : " + b);
            System.out.println("=======================");
            System.out.println(p1.getName() + "'s Current Life : " + p1.getCurrentLife());
            System.out.println(p2.getName() + "'s Current Life : " + p2.getCurrentLife());
            
            System.out.println("\n\n");
            
            if(p1.getCurrentLife() <= 0 && p2.getCurrentLife() <= 0){
                System.out.println("\nDraw\n");
                System.out.println("Final Health: " + p1.getName() + " : " + p1.getCurrentLife());
                System.out.println("Final Health: " + p2.getName() + " : " + p2.getCurrentLife());
            }else if(p1.getCurrentLife() <= 0){
                System.out.println(p2.getName() + " Wins!! ");
                System.out.println("Final Health: " + p1.getName() + " : " + p1.getCurrentLife());
                System.out.println("Final Health: " + p2.getName() + " : " + p2.getCurrentLife());
            }else if(p2.getCurrentLife() <= 0){
                System.out.println(p1.getName() + " Wins!! ");
                System.out.println("Final Health: " + p1.getName() + " : " + p1.getCurrentLife());
                System.out.println("Final Health: " + p2.getName() + " : " + p2.getCurrentLife());
            }
            
        }
        
    }
    
}
