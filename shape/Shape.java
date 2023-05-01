// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Das Interface {@link Shape} .. - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedInterfaceVersion}
 */
public interface Shape {                                                        // <=> abstract
    //
    //--VERSION:-------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                   #___~version~___YYYY_MM_DD__dd_
    long encodedInterfaceVersion = 2___00002_002___2023_05_01__01L;             // <=> public static final
    //-----------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    Version shapeInterfaceVersion = new Version( encodedInterfaceVersion );     // <=> public static final
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return shapeInterfaceVersion.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
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
