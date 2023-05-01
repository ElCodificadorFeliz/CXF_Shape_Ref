// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


import java.util.Objects;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link Sphere} .. - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class Sphere implements Shape {
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
    
    
    
    
    
    private final Point center;
    private final double radius;
    
    
    
    
    
    /**
     * TODO ...
     * 
     * @param center  ...
     * @param radius  ...
     */
    public Sphere( final Point center, final double radius ){
        assert isValidPoint( radius ) : "Illegal Argument : positive radius expected";
        
        this.center = center;
        this.radius = radius;
    }//contructor()
    
    
    
    
    
    @Override
    public Point getCenter(){ return center; }
    
    @Override
    public double getSurface(){ return Math.PI * radius*radius * 4.0; }
    
    @Override
    public double getVolume(){ return Math.PI * radius*radius*radius * 4.0/3.0; }
    
    
    @Override
    public String toString(){
        return String.format( "[<%s>: center=%s, radius=%f]",  Sphere.class.getSimpleName(), center, radius );
      //return String.format( "[<Sphere>: center=%s, radius=%f]",  center, radius );    // ist dieses Semester auch ok bzw. KEIN Sphere.class.getSimpleName() als "Schutz" vor Refactoring eingefordert
    }//method()
    
    
    
    
    
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    /**
     * TODO ...
     */
    static public boolean isValidPoint( final double radius ){                  // NICHT eingefordert und Studenten sind NICHT auf static trainiert
        return radius>=0;
    }//method()
    
    
    /**
     * TODO ...
     * 
     * @param otherObject  ...
     * @param tolerance  ...
     * @return  ...
     */
    public boolean isAcceptedAsEqual( final Object otherObject, final double tolerance ){  // NICHT eingefordert - bewusst andere Schreibweise zur Abgrenzung
        assert 0<=tolerance: "Illegal Argument : Negative tolerance is NOT supported";
        //
        if( this==otherObject )  return true;                                   // beide Objekte identisch?
        if( null==otherObject )  return false;                                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;                 // Class-Objekte identisch?
        final Sphere other = (Sphere)( otherObject );
        final double delta = radius - other.radius;                             // Vergleich der Attribute
        if( delta < -tolerance || tolerance < delta ) return false;
        return true;
    }//method()
    
    
    
    @Override
    public boolean equals( final Object otherObject ){                          // NICHT eingefordert
        if( this==otherObject )  return true;                                   // beide Objekte identisch?
        if( null==otherObject )  return false;                                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;                 // Class-Objekte identisch?
        final Sphere other = (Sphere)( otherObject );
        if( ! Objects.equals( center, other.center ))  return false;            // Vergleich der Attribute
        if( Double.doubleToLongBits( radius ) != Double.doubleToLongBits( other.radius ))  return false;                
        return true;
    }//method()
    
    @Override
    public int hashCode(){                                                      // NICHT eingefordert
        return Objects.hash( center, radius );
    }//method()
    /*
    @Override                                                                   // NICHT eingefordert
    public int hashCode() {                                                     
        final int prime = 31;
        int result = ((center == null) ? 0 : center.hashCode());
        long temp = Double.doubleToLongBits(radius);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }//method()
    //
    @Override
    public int hashCode(){                                                      // NICHT eingefordert und KRITISCH(!!!) - waere noetig wenn equals() Rundungsfehler toleriert
        throw new UnsupportedOperationException( "contract broken :  equals()<->hashCode()" );
    }//method()
    */
    
}//class
