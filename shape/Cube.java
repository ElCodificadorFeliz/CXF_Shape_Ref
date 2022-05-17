package shape;


public class Cube extends Cuboid {
    
    public Cube( final Point... point ){
        super( point );
        assert super.edgeLength[0]<=super.edgeLength[1] && super.edgeLength[1]<=super.edgeLength[2] : "internal bug in cuboid class - edgeLength is NOT ordered";
        assert super.edgeLength[2]-super.edgeLength[0]<Shape.epsilon : "invalid parameter/points - valid cube expected";
    }//method()
    
    
    @Override
    public String toString(){
        return String.format( "[<%s>: super=%s]",  Cube.class.getSimpleName(), super.toString() );
      //return String.format( "[<Cube>: super=%s]", super.toString());          // ist dieses Semester auch ok bzw. KEIN Cube.class.getSimpleName() als "Schutz" vor Refactoring eingefordert
    }//method()
    
    
    
    
    
    // NICHT eingefordert !!! vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    
    static public boolean isValid( final Point... point ){
        final double[] lineLength = Cuboid.computeLineLength( point );
        return lineLength[11]-lineLength[ 0]<epsilon
            && lineLength[23]-lineLength[12]<epsilon
            && lineLength[27]-lineLength[24]<epsilon;
    }//isValid()
    
    
    
    @Override
    public boolean isValid(){
        return Cube.isValid( point );
    }//method()
    
}//class
