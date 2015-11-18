
public abstract interface Field {
    
    public static final double epsilon = 1e-12;
    
    
    
    public abstract Point getCenter();
    public abstract double getSurface();
    public abstract double getVolume();
    
}//class
