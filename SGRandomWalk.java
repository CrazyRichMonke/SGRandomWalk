public class TestClass {
    public static void main (String[]args){
        Rectangle box = new Rectangle(100, 100, 300, 300);
        box.setColor(Color.BLUE);
        box.fill();  
        box.draw();
        Ellipse RandomWalk = new Ellipse(200, 200, 10, 10);
        RandomWalk.setColor(Color.YELLOW);
        RandomWalk.fill();
        Ellipse egg = new Ellipse(150, 150, 100, 100);
        egg.setColor(Color.RED);
        egg.fill();  
        egg.draw();   
    }
    
}
