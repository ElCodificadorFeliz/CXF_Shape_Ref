 


public class TestFrame {
    
    static void doTest( final Field f, final String name ){
        System.out.printf( "%s.volume  = %f\n",  name, f.getVolume() );
        System.out.printf( "%s.surface = %f\n",  name, f.getSurface() );
        System.out.printf( "%s.center  = %s\n",  name, f.getCenter() );
        System.out.printf( "%s=%s\n",  name, f );     
    }//dotest()
    
    
    
    
    
    public static void main( final String[] unused ){
        
        Field k1 = new Sphere( new Point(0,0,0), 1 );
        doTest( k1, "k1" );
        System.out.printf( "\n\n" );
        
        
        
        Field q1 = new Cuboid(
                        new Point(0,0,0), new Point(0,1,0), new Point(0,0,1), new Point(0,1,1),
                        new Point(1,0,0), new Point(1,1,0), new Point(1,0,1), new Point(1,1,1)
                   );
        doTest( q1, "q1" );
        System.out.printf( "\n\n" );
        
        
        Field w1 = new Cube(
                        new Point(0,0,0), new Point(0,1,0), new Point(0,0,1), new Point(0,1,1),
                        new Point(1,0,0), new Point(1,1,0), new Point(1,0,1), new Point(1,1,1)
                   );
        doTest( w1, "w1" );
        System.out.printf( "\n\n" );
        
        
        
        // Cube:
        Field t0w = null;
        try{
            t0w = new Cube(
                        new Point( 6.7,  3.9, 1.3),  new Point(-8.3,  4.9, 5.3),  new Point(-6.3, -1.1, 14.3),  new Point(2.7,  4.9, 16.3),
                        new Point(-0.3, -8.1, 8.3),  new Point( 0.7, 10.9, 7.3),  new Point(-2.3, -2.1, -0.7),  new Point(8.7, -2.1, 10.3)
                   );
            doTest( t0w, "t0" );
        }catch( AssertionError ex ){
            System.out.printf( "t0w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        // Cube:
        Field t1w = null;
        try{
            t1w = new Cube(
                        new Point(0,0,0), new Point(0,5,0), new Point(5,0,0), new Point(5,5,0),
                        new Point(0,0,5), new Point(0,5,5), new Point(5,0,5), new Point(5,5,5)
                   );
            doTest( t1w, "t1" );
        }catch( AssertionError ex ){
            System.out.printf( "t1w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        
        // "nix":
        Field t2w = null;
        try{
            t2w = new Cube(
                        new Point(0,0,0), new Point(0,3,4), new Point(5,0,0), new Point(5,3,4),
                        new Point(0,5,0), new Point(0,6,4), new Point(5,5,0), new Point(5,8,4)
                   );
            doTest( t2w, "t2" );
        }catch( AssertionError ex ){
            System.out.printf( "t2w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field t2q = null;
        try{
            t2q = new Cube(
                        new Point(0,0,0), new Point(0,3,4), new Point(5,0,0), new Point(5,3,4),
                        new Point(0,5,0), new Point(0,8,4), new Point(5,5,0), new Point(5,8,4)
                   );
            doTest( t2q, "t2" );
        }catch( AssertionError ex ){
            System.out.printf( "t2q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid:
        Field t3w = null;
        try{
            t3w = new Cube(
                        new Point(-2, -3, -5),  new Point(-2,  3, -5),  new Point( 2, -3, -5),  new Point( 2,  3, -5),
                        new Point(-2, -3,  5),  new Point(-2,  3,  5),  new Point( 2, -3,  5),  new Point( 2,  3,  5)
                   );
            doTest( t3w, "t3" );
        }catch( AssertionError ex ){
            System.out.printf( "t3w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field t3q = null;
        try{
            t3q = new Cuboid(
                        new Point(-2, -3, -5),  new Point(-2,  3, -5),  new Point( 2, -3, -5),  new Point( 2,  3, -5),
                        new Point(-2, -3,  5),  new Point(-2,  3,  5),  new Point( 2, -3,  5),  new Point( 2,  3,  5)
                   );
            doTest( t3q, "t3" );
        }catch( AssertionError ex ){
            System.out.printf( "t3q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // "nix": (-3,4,0), (-3,4,5), (0,0,0), (0,0,5), (2,4,0), (2,4,5), (5,0,0), (5,0,5)
        // Kein Würfel und kein Quader, aber Kantenlänge immer 5
        Field t4w = null;
        try{
            t4w = new Cube(
                        new Point(-3, 4, 0),  new Point(0, 0, 0),  new Point( 2, 4, 0),  new Point( 5, 0, 0),
                        new Point(-3, 4, 5),  new Point(0, 0, 5),  new Point( 2, 4, 5),  new Point( 5, 0, 5)
                   );
            doTest( t4w, "t4" );
        }catch( AssertionError ex ){
            System.out.printf( "t4w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field t4q = null;
        try{
            t4q = new Cuboid(
                        new Point(-3, 4, 0),  new Point(0, 0, 0),  new Point( 2, 4, 0),  new Point( 5, 0, 0),
                        new Point(-3, 4, 5),  new Point(0, 0, 5),  new Point( 2, 4, 5),  new Point( 5, 0, 5)
                   );
            doTest( t4q, "t4" );
        }catch( AssertionError ex ){
            System.out.printf( "t4q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // "nix":
        Field t5w = null;
        try{
            t5w = new Cube(
                        new Point(-6.0, 1.5, 2.5),  new Point(1.0, 0.0, 0.0),  new Point(1.0, 3.0, 0.0),  new Point(3.0, 1.5, 2.5),
                        new Point(-1.0, 1.5, 2.5),  new Point(1.0, 0.0, 5.0),  new Point(1.0, 3.0, 5.0),  new Point(8.0, 1.5, 2.5)
                   );
            doTest( t5w, "t5" );
        }catch( AssertionError ex ){
            System.out.printf( "t5w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field t5q = null;
        try{
            t5q = new Cuboid(
                        new Point(-6.0, 1.5, 2.5),  new Point(1.0, 0.0, 0.0),  new Point(1.0, 3.0, 0.0),  new Point(3.0, 1.5, 2.5),
                        new Point(-1.0, 1.5, 2.5),  new Point(1.0, 0.0, 5.0),  new Point(1.0, 3.0, 5.0),  new Point(8.0, 1.5, 2.5)
                   );
            doTest( t5q, "t5" );
        }catch( AssertionError ex ){
            System.out.printf( "t5q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cube:
        Field t6w = null;
        try{
            t6w = new Cube(
                        new Point(-8.3, +4.9,  5.3),  new Point(-2.3, -2.1, -0.7),  new Point(0.7, 10.9,  7.3),  new Point(6.7, +3.9,  1.3),
                        new Point(-6.3, -1.1, 14.3),  new Point(-0.3, -8.1, +8.3),  new Point(2.7,  4.9, 16.3),  new Point(8.7, -2.1, 10.3)
                   );
            doTest( t6w, "t6" );
        }catch( AssertionError ex ){
            System.out.printf( "t6w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n" );
        try{
            t6w = new Cube(
                        new Point(+6.7, 3.9, 1.3),  new Point(-6.3, -1.1, 14.3),  new Point(-0.3, -8.1, 8.3),  new Point(-2.3, -2.1, -0.7),
                        new Point(-8.3, 4.9, 5.3),  new Point(+2.7, +4.9, 16.3),  new Point(+0.7, 10.9, 7.3),  new Point(+8.7, -2.1, 10.3)
                   );
            doTest( t6w, "t6" );
        }catch( AssertionError ex ){
            System.out.printf( "t6w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        System.out.printf( "--------------------------------------------------------------------------------" );
        System.out.printf( "\n\n" );
        
        
        
        // Cube: ( -1.3, -2.3, -4.7 )   "+"     (4,4,7),    (1,-8,4)     (-8,1,4)
        Field test1w = null;
        try{
            test1w = new Cube(
                        new Point(-1.3, -2.3, -4.7),  new Point(-0.3, -10.3, -0.7),  new Point(+3.7, -6.3, 6.3),  new Point(-8.3, -9.3,  3.3),
                        new Point(+2.7, +1.7, +2.3),  new Point(-9.3,  -1.3, -0.7),  new Point(-5.3, +2.7, 6.3),  new Point(-4.3, -5.3, 10.3)
                   );
            doTest( test1w, "test1" );
        }catch( AssertionError ex ){
            System.out.printf( "test1w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid: ( -3.7, -1.7, -4.3 )   "+"   5*(4,4,7)   3*(1,-8,4)   2*(-8,1,4)
        Field test2w = null;
        try{
            test2w = new Cube(
                        new Point(-3.7, -1.7, -4.3),  new Point( -0.7, -25.7, 7.7),  new Point(19.3, -5.7, 42.7),  new Point(-16.7, -23.7, 15.7),
                        new Point(16.3, 18.3, 30.7),  new Point(-19.7,   0.3, 3.7),  new Point( 0.3, 20.3, 38.7),  new Point(  3.3,  -3.7, 50.7)
                   );
            doTest( test2w, "test2" );
        }catch( AssertionError ex ){
            System.out.printf( "test2w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field test2q = null;
        try{
            test2q = new Cuboid(
                        new Point(-3.7, -1.7, -4.3),  new Point( -0.7, -25.7, 7.7),  new Point(19.3, -5.7, 42.7),  new Point(-16.7, -23.7, 15.7),
                        new Point(16.3, 18.3, 30.7),  new Point(-19.7,   0.3, 3.7),  new Point( 0.3, 20.3, 38.7),  new Point(  3.3,  -3.7, 50.7)
                   );
            doTest( test2q, "test2" );
        }catch( AssertionError ex ){
            System.out.printf( "test2q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid: ( -1.9, -0.7, -3.1 )   "+"   2.5*(2,2,1)   (1,-2,2)   1.5*(-4,2,4)
        Field test3w = null;
        try{
            test3w = new Cube(
                        new Point(-4.9, 0.8, -0.1),  new Point(-0.9, -2.7, -1.1),  new Point( 3.1,  4.3, -0.6),  new Point(-1.9, -0.7, -3.1),
                        new Point( 4.1, 2.3,  1.4),  new Point( 0.1,  5.8,  2.4),  new Point(-3.9, -1.2,  1.9),  new Point( 1.1,  3.8,  4.4)
                   );
            doTest( test3w, "test3" );
        }catch( AssertionError ex ){
            System.out.printf( "test3w -> %s\n",  ex.getMessage() );
        }//try
        //
        Field test3q = null;
        try{
            test3q = new Cuboid(
                        new Point(-4.9, 0.8, -0.1),  new Point(-0.9, -2.7, -1.1),  new Point( 3.1,  4.3, -0.6),  new Point(-1.9, -0.7, -3.1),
                        new Point( 4.1, 2.3,  1.4),  new Point( 0.1,  5.8,  2.4),  new Point(-3.9, -1.2,  1.9),  new Point( 1.1,  3.8,  4.4)
                   );
            doTest( test3q, "test3" );
        }catch( AssertionError ex ){
            System.out.printf( "test3q -> %s\n",  ex.getMessage() );
        }//try
        
    }//main()
    
}//TestFrame
