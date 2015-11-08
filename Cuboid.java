
import java.util.Arrays;


public class Cuboid implements Field {
    
    static public boolean isValid( final Point... point ){
        return isValid( computeLineLength( point ) );
    }//method()
    //
    // "isValid" is subfunction of "isValid" and requires sorted array as parameter
    static private boolean isValid( final double[] lineLength ){                // private on purpose
        return ( lineLength[ 3]-lineLength[ 0] < epsilon )                      // 1.Kante
            && ( lineLength[ 7]-lineLength[ 4] < epsilon )                      // 2.Kante
            && ( lineLength[11]-lineLength[ 8] < epsilon )                      // 3.Kante oder 1.Flächendiagonale
            && ( lineLength[15]-lineLength[12] < epsilon )                      // 1.Flächendiagonale oder 3.Kante
            && ( lineLength[19]-lineLength[16] < epsilon )                      // 2.Flächendiagonale
            && ( lineLength[23]-lineLength[20] < epsilon )                      // 3.Flächendiagonale
            && ( lineLength[27]-lineLength[24] < epsilon );                     // Raumdiagonale
    }//method()
    //
    static protected double[] computeLineLength( final Point... point ){        // protected on purpose
        assert point.length==8 : "invalid parameter - 8 points are expected";
        int i = 0;
        double[] lineLength = new double[28];
        for ( int j=point.length; --j>=0; ){
            for ( int k=j; --k>=0; ){
                lineLength[i++] = Math.sqrt(
                                          Math.pow( point[j].dim[0]-point[k].dim[0], 2)
                                        + Math.pow( point[j].dim[1]-point[k].dim[1], 2)
                                        + Math.pow( point[j].dim[2]-point[k].dim[2], 2)
                                  );
            }//for
        }//for
        Arrays.sort( lineLength );
        return lineLength;
    }//method()
    //
    static Point getCenter( final Point... point ){
        double[] vec = { 0,0,0 };
        for ( int i=0; i<vec.length; i++ ){
            for ( Point p : point ) vec[i] += p.dim[i];
            vec[i] = vec[i]/8;
        }//for
        return new Point( vec );
    }//method()
    
    
    
    
    
    public final Point[] point;
    protected double[] edgeLength;                                              // protected on purpose - needed in sub classes
    
    
    
    
    public Cuboid( final Point... point ){
        assert point.length == 8 : "invalid parameter - 8 points are expected";
        final double[] lineLength = computeLineLength( point );
        assert isValid( lineLength ) : "invalid parameter/points - valid cuboid expected";
        this.point = point;
        
        final double x = lineLength[0];
        final double y = lineLength[4];
        double z = lineLength[8];
        if ( Math.abs( x*x+y*y - z*z ) < Field.epsilon ){                       // ist z Flächendiagonale (und NICHT 3.Kante) ? 
            z = lineLength[12];                                                 // "Die Alternative" ist dann die 3.Kante
        }//if
        
        edgeLength = new double[]{ x,y,z };
    }//constructor()
    
    
    
    
    
    @Override
    public Point getCenter(){
        double[] vec = { 0,0,0 };
        for ( int i=0; i<vec.length; i++ ){
            for ( Point p : point ) vec[i] += p.dim[i];
            vec[i] = vec[i]/8;
        }//for
        return new Point( vec );
    }//method()
    
    @Override
    public double getSurface(){
        return 2*(edgeLength[0]*edgeLength[1] + edgeLength[0]*edgeLength[2] + edgeLength[1]*edgeLength[2] );
    }//method()
    
    @Override
    public double getVolume(){
        return edgeLength[0]*edgeLength[1]*edgeLength[2];
    }//method()
    
    
    
    @Override
    public boolean equals( final Object other ){
        if( this==otherObject )  return true;                       // beide Objekte identisch?
        if( null==otherObject )  return false;                      // existiert other?
        if( getClass()!=otherObject.getClass() )  return false;     // Class-Objekte identisch?
        //
        final Cuboid other = (Cuboid)( otherObject );
        for( int i=0; i<point.lenght; i++ ){
            double delta = radius - other.radius
            if( delta < -epsilon || epsilon < delta ) return false; // Vergleich der Attribute
        }//for
        return true;
    }//method()
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime * result + Arrays.hashCode( point );
        return result;
    }//method()
    
    
    @Override
    public String toString() {
        return String.format( "[<%s>: edgeLength=%s; point=%s]",  Cuboid.class.getSimpleName(), Arrays.toString( edgeLength ), Arrays.toString( point ) );
    }//method()
    
}//Cuboid
