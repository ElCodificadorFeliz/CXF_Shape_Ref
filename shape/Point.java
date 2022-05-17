package shape;
 

import java.util.Arrays;


/**
 * Point - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public class Point {
    
    final double[] dim;
    
    
    
    
    
    public Point( final double... dim ){
        assert dim.length == 3 : "invalid parameter - 3 dimensions are expected";
        this.dim = dim;
    }//Point()
    
    
    
    
    
    @Override
    public String toString(){
        return String.format( "[<%s>:(%.2f;%.2f;%.2f)]",  Point.class.getSimpleName(), dim[0], dim[1], dim[2] );
    }//toString()
    
    
    
    
    
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    @Override
    public boolean equals( final Object other ){
        return  this == other
            || (    other != null )
                &&  getClass() == other.getClass()
                &&  internalIsEqual( (Point)( other ) );
    }//equals()
    //
    private boolean internalIsEqual( final Point other ){                       // internal subfunction of equals()
        return Arrays.equals( dim, other.dim );
    }//internalIsEqual()
    //
    public boolean isEqual( final Point other, final double tolerance ){
        return  getClass() == other.getClass()
            &&  Math.abs(dim[0]-other.dim[0])<Shape.epsilon
            &&  Math.abs(dim[1]-other.dim[1])<Shape.epsilon
            &&  Math.abs(dim[2]-other.dim[2])<Shape.epsilon;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(dim);
        return result;
    }//hashCode()
    
}//Point
