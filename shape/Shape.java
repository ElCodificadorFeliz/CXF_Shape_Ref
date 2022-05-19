// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


/**
 * Shape - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public interface Shape {                                                        // <=> abstract
    
    /**
     * TODO ...
     */
    double epsilon = 1e-12;                                                     // <=> public static final
    
    
    
    
    
    /**
     * TODO ...
     */
    Point getCenter();                                                          // <=> public abstract
    
    /**
     * TODO ...
     */
    double getSurface();                                                        // <=> public abstract
    
    /**
     * TODO ...
     */
    double getVolume();                                                         // <=> public abstract
    
}//class