package shape;


/**
 * Shape - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public abstract interface Shape {
    
    public static final double epsilon = 1e-12;
    
    
    
    public abstract Point getCenter();
    public abstract double getSurface();
    public abstract double getVolume();
    
}//class
