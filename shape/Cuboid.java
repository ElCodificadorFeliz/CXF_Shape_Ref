// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


import java.util.Arrays;

import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Cuboid - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class Cuboid implements Shape {
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
    
    
    
    
    
    final Point[] point;                                                        // package scope on purpose - alien childs are not supported
    
    // edgeLength ist NICHT eingefordert, macht es aber angenehmer
    // Studenten muessen "jetzt" nur private und public beherrschen
    final double[] sortedEdgeLength;                                            // package scope on purpose - alien childs are not supported
    
    
    
    
    
    // Konstruktor liegt Annahme zugrund, dass Koerper statisch sind - sich also nicht ueber die Zeit veraendern
    public Cuboid( final Point... point ){                                      // Varargs nur optional - NICHT mehr im Pflichtteil- Array ok
        assert point.length==8 : String.format( "Illegal Argument : 8 points were expected and %d received", point.length );
        final double[] lineLength = Cuboid.iComputeLineLength( point );
        assert Cuboid.isValid( lineLength ) : "Illegal Argument : valid cuboid expected, but shape is NOT cuboid";
        
        this.point = point;
        final double x = lineLength[0];
        final double y = lineLength[4];
        double z = lineLength[8];
        if ( Math.abs( x*x+y*y - z*z ) < Shape.epsilon ){                       // ist z Flaechendiagonale (und NICHT 3.Kante) ? 
            z = lineLength[12];                                                 // "Die Alternative" ist dann die 3.Kante
        }//if
        
        sortedEdgeLength = new double[]{ x,y,z };
    }//constructor()
    
    
    
    
    
    @Override
    public Point getCenter(){
        double[] vec = { 0,0,0 };
        for ( int i=0; i<vec.length; i++ ){
            for ( final Point p : point ) vec[i] += p.dim[i];
            vec[i] = vec[i]/8;
        }//for
        return new Point( vec );
    }//method()
    
    @Override
    public double getSurface(){
        return 2*(sortedEdgeLength[0]*sortedEdgeLength[1]
                + sortedEdgeLength[0]*sortedEdgeLength[2]
                + sortedEdgeLength[1]*sortedEdgeLength[2] );
    }//method()
    
    @Override
    public double getVolume(){
        return sortedEdgeLength[0]*sortedEdgeLength[1]*sortedEdgeLength[2];
    }//method()
        
    
    @Override
    public String toString() {
        return String.format(
            "[<%s>: edgeLength=%s; point=%s]",
            Cuboid.class.getSimpleName(),
            Arrays.toString( sortedEdgeLength ),
            Arrays.toString( point )
        );
    }//method()
    
    
    
    
    
    // Das folgende wird teilweise von mir genutzt
    // Der zugehoerige Code muesste (wenn er genutzt wird) also "irgendwo" auftauchen
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    static public boolean isValid( final Point... point ){
        return Cuboid.isValid( computeLineLength( point ) );
    }//method()
    //
    // "isValid" is subfunction of "isValid" and requires sorted array as parameter
    static private boolean isValid( final double[] lineLength ){                // private on purpose - used by constructor
        assert lineLength.length==28 : String.format( "invalid parameter - 28 line length were expected and %d received", lineLength.length );
        return ( lineLength[ 3]-lineLength[ 0] <= epsilon )                     // "1.Kante"
            && ( lineLength[ 7]-lineLength[ 4] <= epsilon )                     // "2.Kante"
            && ( lineLength[11]-lineLength[ 8] <= epsilon )                     // "3.Kante" oder "1.Flächendiagonale"
            && ( lineLength[15]-lineLength[12] <= epsilon )                     // "1.Flächendiagonale" oder "3.Kante"
            && ( lineLength[19]-lineLength[16] <= epsilon )                     // "2.Flächendiagonale"
            && ( lineLength[23]-lineLength[20] <= epsilon )                     // "3.Flächendiagonale"
            && ( lineLength[27]-lineLength[24] <= epsilon );                    // Raumdiagonale
    }//method()
    //
    static double[] computeLineLength( final Point... point ){                  // package scope on purpose - alien childs are not supported
        return iComputeLineLength( point );
    }//method()
    //
    static private double[] iComputeLineLength( final Point... point ){         // private on purpose - used by constructor
        assert point.length==8 : String.format( "invalid parameter - 8 points were expected and %d received", point.length );
        int i = 0;
        double[] lineLength = new double[28];
        for ( int j=point.length; --j>=0; ){
            for ( int k=j; --k>=0; ){
                lineLength[i++] = Math.sqrt(  Math.pow( point[j].dim[0]-point[k].dim[0], 2)
                                            + Math.pow( point[j].dim[1]-point[k].dim[1], 2)
                                            + Math.pow( point[j].dim[2]-point[k].dim[2], 2)
                );
            }//for
        }//for
        Arrays.sort( lineLength );
        return lineLength;
    }//method()
    
    
    
    
    public boolean isValid(){                                                   // Sollte gar nicht noetig sein, da Konstruktor "falsche" Objekte verhindert
        return Cuboid.isValid( computeLineLength( point ) );
    }//method()
    
    
    @Override
    public boolean equals( final Object otherObject ){
        if( this==otherObject )  return true;
        if( null==otherObject )  return false;
        if( getClass()!=otherObject.getClass() )  return false;
        //
        final Cuboid other = (Cuboid)( otherObject );
        for( int i=0; i<point.length; i++ ){
            if( ! point[i].isAcceptedAsEqual( other.point[i], epsilon ))   return false;
        }//for
        return true;
    }//method()
    
    
    @Override
    public int hashCode() {
        return Arrays.hashCode( point );
    }//method()
    
}//class
