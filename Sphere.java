
public class Sphere implements Field {
    
    static public boolean isValid( final Point point, final double radius ){
        return radius>=0;
    }//isValid()
    
    
    
    
    
    private final Point center;
    private final double radius;
    
    
    
    
    
    public Sphere( final Point center, final double radius ){
        assert radius >= 0 : "invalid parameter : positive radius expected";
        this.center = center;
        this.radius = radius;
    }//Sphere
    
    
    
    
    
    @Override
    public Point getCenter(){ return center; }
    
    @Override
    public double getSurface(){ return 4.0 * Math.PI * radius*radius; }
    
    @Override
    public double getVolume(){ return 4.0/3.0 * Math.PI * radius*radius*radius; }
    
    
    
    @Override
    public boolean equals( final Object otherObject ){
        if( this==otherObject )  return true;                   // beide Objekte identisch?
        if( null==otherObject )  return false;                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false; // Class-Objekte identisch?
        //
        final Sphere other = (Sphere)( otherObject );
        final double delta = radius - other.radius;
        if( delta < -epsilon || epsilon < delta ) return false; // Vergleich der Attribute
        return true;
    }//method()
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = ((center == null) ? 0 : center.hashCode());
        long temp = Double.doubleToLongBits(radius);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }//method()    
    
    
    @Override
    public String toString(){
        return String.format( "[<%s>: center=%s, radius=%f]",  Sphere.class.getSimpleName(), center, radius );
    }//method()
    
}//Sphere
