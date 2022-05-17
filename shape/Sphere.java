// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


import java.util.Objects;


/**
 * Sphere - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public class Sphere implements Shape {
    
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
    public double getSurface(){ return 4.0 * Math.PI * radius*radius; }
    
    @Override
    public double getVolume(){ return 4.0/3.0 * Math.PI * radius*radius*radius; }
    
    
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
     */
    public boolean isAcceptedAsEqualEqual( final Object otherObject, final double tolerance ){  // NICHT eingefordert - bewusst andere Schreibweise zur Abgrenzung
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
    public int hashCode(){                                                      // NICHT eingefordert und KRITISCH ! Siehe equals()
        return Objects.hash( center, radius );
    }//method()
    
    /*
    "scheinbar brauchbares" equals() bricht aber contract - Siehe isSimiliar() - dieses equals ist auch NICHT transitiv
    @Override
    public boolean equals( final Object otherObject ){                          // NICHT eingefordert
        if( this==otherObject )  return true;                                   // beide Objekte identisch?
        if( null==otherObject )  return false;                                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;                 // Class-Objekte identisch?
        //
        final Sphere other = (Sphere)( otherObject );
        final double delta = radius - other.radius;
        if( delta < -epsilon || epsilon < delta ) return false;                 // Vergleich der Attribute
        return true;
    }//method()
    //
    @Override
    public int hashCode(){                                                      // NICHT eingefordert und KRITISCH ! Siehe equals()
        if( true )  throw new UnsupportedOperationException( "contract broken :  equals()<->hashCode()" );
        return 42;
    }//method()
    
    
    
    "ausgeschriebener" hashCode für unkritisches equals()
    @Override                                                                   // NICHT eingefordert
    public int hashCode() {                                                     
        final int prime = 31;
        int result = ((center == null) ? 0 : center.hashCode());
        long temp = Double.doubleToLongBits(radius);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }//method()
    */
    
}//class
