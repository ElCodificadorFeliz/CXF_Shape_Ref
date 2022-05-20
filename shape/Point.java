// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;
 

import java.util.Arrays;
import java.util.Objects;


/**
 * Point - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public class Point {
    
    final double[] dim;
    
    
    
    
    
    /**
     * TODO ...
     * 
     * @param dim  ...
     */
    public Point( final double... dim ){
        assert dim.length == 3 : "Illegal Argument : 3 dimensions are expected";
        this.dim = dim;
    }//constructor()
    
    
    
    
    
    @Override
    public String toString(){
        return String.format(
            "[<%s>:(%.20f;%.20f;%.20f)]",
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
    public int hashCode(){                                                      // NICHT eingefordert und KRITISCH ! Siehe equals()
        return Objects.hash( dim );
    }//method()
    
}//Point
