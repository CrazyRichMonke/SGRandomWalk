public class SGRandomWalk {
    private static int steps;
    public static void main (String[]args){
        int deltaX;
        int deltaY;
        int totalX = 0;
        int totalY = 0;
        boolean insideCircle = true;
        Rectangle box = new Rectangle(0, 0, 300, 300);
        box.setColor(Color.BLUE);
        box.fill();  
        Ellipse RandomWalk = new Ellipse(150, 150, 10, 10);
        RandomWalk.setColor(Color.YELLOW);
        RandomWalk.fill();
        Ellipse egg = new Ellipse(50, 50, 200, 200);
        egg.setColor(Color.RED);
        egg.fill();  
        egg.draw();

        while(insideCircle){
            deltaX = (int)((Math.random()*21)-10);
            deltaY = (int)((Math.random()*21)-10);

            RandomWalk.translate(deltaX, deltaY);
            steps++;
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            totalX += deltaX;
            totalY += deltaY;

            if ((totalX > 100)||(totalY >= 100)||(totalX <= -100)||(totalY <= -100)){
                insideCircle = false;
            }
           

            
        }
        System.out.println("Escaped in " + steps + " steps.");
        
        
    }
    
}
