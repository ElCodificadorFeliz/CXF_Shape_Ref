// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package shape;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link Cube} .. - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class Cube extends Cuboid {
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
