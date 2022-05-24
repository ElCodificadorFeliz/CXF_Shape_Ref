// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


/**
 * Cube - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 */
public class Cube extends Cuboid {
    
    public Cube( final Point... point ){                                        // Varargs nur optional - NICHT mehr im Pflichtteil - Array ok
        super( point );
        assert super.sortedEdgeLength[0]<=super.sortedEdgeLength[1] && super.sortedEdgeLength[1]<=super.sortedEdgeLength[2] : "internal bug in cuboid class - edgeLength is NOT ordered";
        assert super.sortedEdgeLength[2]-super.sortedEdgeLength[0]<Shape.epsilon : "Illegal Argument : valid cube expected, but shape is NOT cube";
    }//constructor()
    
    
    
    
    
    @Override
    public String toString(){
        return String.format(
            "[<%s>: super=%s]",
            Cube.class.getSimpleName(),
            super.toString()
        );
    }//method()
    
    
    
    
    
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    static public boolean isValid( final Point... point ){                      // Varargs nur optional - NICHT mehr im Pflichtteil - Array ok
        final double[] lineLength = Cuboid.computeLineLength( point );
        return lineLength[11]-lineLength[ 0] <= epsilon
            && lineLength[23]-lineLength[12] <= epsilon
            && lineLength[27]-lineLength[24] <= epsilon;
    }//method()
    
    
    
    @Override
    public boolean isValid(){
        return Cube.isValid( point );
    }//method()
    
}//class
