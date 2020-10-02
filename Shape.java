package lab34;
public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(Boolean filled){
        this.filled = filled;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}