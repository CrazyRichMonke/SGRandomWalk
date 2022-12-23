public class SGRandomWalk {
    private static int steps;
    public static void main (String[]args){
        int deltaX;
        int deltaY;
        Rectangle box = new Rectangle(0, 0, 300, 300);
        box.setColor(Color.BLUE);
        box.fill();  
        Ellipse RandomWalk = new Ellipse(120, 120, 10, 10);
        RandomWalk.setColor(Color.YELLOW);
        RandomWalk.fill();
        Ellipse egg = new Ellipse(25, 25, 200, 200);
        egg.setColor(Color.RED);
        egg.fill();  
        egg.draw();
        int x1 = RandomWalk.getX();
        int y1 = RandomWalk.getY();

        while(RandomWalk.getX() < x1+100 && RandomWalk.getY() <y1+100){
            deltaX = (int)((Math.random()*21)-10);
            deltaY = (int)((Math.random()*21)-10);
            RandomWalk.translate(deltaX, deltaY);
            steps++;
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            

            
           

            
        }
        System.out.println("Escaped in " + steps + " steps.");
        
        
    }
    
}
