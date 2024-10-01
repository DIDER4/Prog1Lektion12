package opgave03;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean fan;
    private double radius;
    String color;

    public int getSpeed() {
        return speed;
    }
    public boolean isFan(){
        return fan;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setFan (boolean fan){
        this.fan = fan;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }
    public void setColor (String color){
        this.color = color;
    }

    public Fan(){
        speed = SLOW;
        fan = false;
        radius = 5.0;
        color = "blue";
    }

    public String toString (){
        if (fan){
            return "The speed of the fan is: " + speed +
                    "\nThe color of the fan is: " + color +
                    "\nThe radius of the fan is: " + radius;
        } else {
            return "The fan is off" +
                    "\nThe color of the fan is: " + color +
                    "\nThe radius of the fan is: " + radius
                    ;
        }
    }

}


