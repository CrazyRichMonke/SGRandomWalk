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
        int totalX = 0;
        int totalY = 0;
        boolean insideCircle = true
            while (insideCircle) {
            deltaX = (int) (21 * Math.random()) - 10;
            deltaY = (int) (21 * Math.random()) - 10;
            
            RandomWalk.translate(deltaX, deltaY);
            steps++;
            try { Thread.sleep(100);}
            catch(Exception ex) {};

            totalX += deltaX;
            totalY += deltaY;

            if ((Math.pow(totalX, 2) + Math.pow(totalY, 2)) > (Math.pow(110, 2))){
                insideCircle = false;
            

            System.out.println(totalX + " " + totalY);
        }

        System.out.println("Escaped in " + steps + " steps.");

    }
    
}
