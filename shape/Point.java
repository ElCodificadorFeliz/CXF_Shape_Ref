// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;
 

import java.util.Arrays;
import java.util.Objects;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link Point} .. - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class Point {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2023_05_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    final double[] dim;                                                         // package scope on purpose - alien childs are not supported
    
    
    
    
    
    /**
     * TODO ...
     * 
     * @param dim  ...
     */
    public Point( final double... dim ){                                        // Varargs nur optional - NICHT mehr im Pflichtteil- Array ok
        assert dim.length == 3 : "Illegal Argument : 3 dimensions are expected";
        this.dim = dim;
    }//constructor()
    
    
    
    
    
    @Override
    public String toString(){
        return String.format(
            "[<%s>:(%f;%f;%f)]",
            Point.class.getSimpleName(),
            dim[0],
            dim[1],
            dim[2]
        );
    }//method()
    
    
    
    
    
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    /**
     * TODO ...
     * 
     * @param otherObject  ...
     * @param tolerance  ...
     * @return  ...
     */
    public boolean isAcceptedAsEqual( final Object otherObject,  final double tolerance ){
        assert 0<=tolerance: "Illegal Argument : Negative tolerance is NOT supported";
        //
        if( this==otherObject )  return true;                                   // beide Objekte identisch?
        if( null==otherObject )  return false;                                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;                 // Class-Objekte identisch?
        final Point other = ((Point) otherObject );
        if( dim.length != other.dim.length )  return false;
        for( int d=dim.length; --d>=0; ){
            if( Math.abs( dim[d]-other.dim[d] ) > tolerance ) return false;
        }//for
        return true;                                                            // Keine Erbmasse
    }//method()
    
    
    
    @Override
    public boolean equals( final Object otherObject ){                          // NICHT eingefordert
        if( this==otherObject )  return true;                                   // beide Objekte identisch?
        if( null==otherObject )  return false;                                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;                 // Class-Objekte identisch?
        final Point other = (Point)( otherObject );
        if( ! Arrays.equals( dim, other.dim ))  return false;                   // Vergleich der Attribute
        return true;                                                            // Keine Erbmasse
    }//method()
    //
    @Override
    public int hashCode(){                                                      // NICHT eingefordert
        return Objects.hash( dim );
    }//method()
    
}//Point
