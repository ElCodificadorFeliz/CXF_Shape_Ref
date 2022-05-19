// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package test;


import shape.*;


/**
 * TestFrame for  ...
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2015/11/13
 */
public class TestFrame {
    
    /**
     * Testing ...
     */
    public static void main( final String... unused ){
        
        System.out.printf( "Sphere\n" );
        Shape k1 = new Sphere( new Point(0,0,0), 1 );
        printIt( k1, "k1" );
        System.out.printf( "\n\n" );
        
        System.out.printf( "Cuboid\n" );
        Shape q1 = new Cuboid(
            new Point(0,0,0), new Point(0,1,0), new Point(0,0,1), new Point(0,1,1),
            new Point(1,0,0), new Point(1,1,0), new Point(1,0,1), new Point(1,1,1)
        );
        printIt( q1, "q1" );
        System.out.printf( "\n\n" );
        
        System.out.printf( "Cube\n" );
        Shape w1 = new Cube(
            new Point(0,0,0), new Point(0,1,0), new Point(0,0,1), new Point(0,1,1),
            new Point(1,0,0), new Point(1,1,0), new Point(1,0,1), new Point(1,1,1)
        );
        printIt( w1, "w1" );
        System.out.printf( "\n\n" );
        
        
        
        // Cube:
        System.out.printf( "Cube\n" );
        Shape t0w = null;
        try{
            t0w = new Cube(
                new Point( 6.7,  3.9, 1.3),  new Point(-8.3,  4.9, 5.3),  new Point(-6.3, -1.1, 14.3),  new Point(2.7,  4.9, 16.3),
                new Point(-0.3, -8.1, 8.3),  new Point( 0.7, 10.9, 7.3),  new Point(-2.3, -2.1, -0.7),  new Point(8.7, -2.1, 10.3)
            );
            printIt( t0w, "t0w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t0w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        // Cube:
        System.out.printf( "Cube\n" );
        Shape t1w = null;
        try{
            t1w = new Cube(
                new Point(0,0,0), new Point(0,5,0), new Point(5,0,0), new Point(5,5,0),
                new Point(0,0,5), new Point(0,5,5), new Point(5,0,5), new Point(5,5,5)
            );
            printIt( t1w, "t1w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t1w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        
        // "nix":
        System.out.printf( "nix\n" );
        Shape t2w = null;
        try{
            t2w = new Cube(
                new Point(0,0,0), new Point(0,3,4), new Point(5,0,0), new Point(5,3,4),
                new Point(0,5,0), new Point(0,6,4), new Point(5,5,0), new Point(5,8,4)
            );
            printIt( t2w, "t2w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t2w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t2q = null;
        try{
            t2q = new Cuboid(
                new Point(0,0,0), new Point(0,3,4), new Point(5,0,0), new Point(5,3,4),
                new Point(0,5,0), new Point(0,8,4), new Point(5,5,0), new Point(5,8,4)
            );
            printIt( t2q, "t2q" );
        }catch( final AssertionError ex ){
            System.out.printf( "t2q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid:
        System.out.printf( "Cuboid\n" );
        Shape t3w = null;
        try{
            t3w = new Cube(
                new Point(-2, -3, -5),  new Point(-2,  3, -5),  new Point( 2, -3, -5),  new Point( 2,  3, -5),
                new Point(-2, -3,  5),  new Point(-2,  3,  5),  new Point( 2, -3,  5),  new Point( 2,  3,  5)
            );
            printIt( t3w, "t3w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t3w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t3q = null;
        try{
            t3q = new Cuboid(
                new Point(-2, -3, -5),  new Point(-2,  3, -5),  new Point( 2, -3, -5),  new Point( 2,  3, -5),
                new Point(-2, -3,  5),  new Point(-2,  3,  5),  new Point( 2, -3,  5),  new Point( 2,  3,  5)
            );
            printIt( t3q, "t3q" );
        }catch( final AssertionError ex ){
            System.out.printf( "t3q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // "nix": (-3,4,0), (-3,4,5), (0,0,0), (0,0,5), (2,4,0), (2,4,5), (5,0,0), (5,0,5)
        // Kein Wuerfel und kein Quader, aber Kantenlaenge immer 5
        System.out.printf( "nix\n" );        
        Shape t4w = null;
        try{
            t4w = new Cube(
                new Point(-3, 4, 0),  new Point(0, 0, 0),  new Point( 2, 4, 0),  new Point( 5, 0, 0),
                new Point(-3, 4, 5),  new Point(0, 0, 5),  new Point( 2, 4, 5),  new Point( 5, 0, 5)
            );
            printIt( t4w, "t4w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t4w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t4q = null;
        try{
            t4q = new Cuboid(
                new Point(-3, 4, 0),  new Point(0, 0, 0),  new Point( 2, 4, 0),  new Point( 5, 0, 0),
                new Point(-3, 4, 5),  new Point(0, 0, 5),  new Point( 2, 4, 5),  new Point( 5, 0, 5)
            );
            printIt( t4q, "t4q" );
        }catch( final AssertionError ex ){
            System.out.printf( "t4q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // "nix":
        System.out.printf( "nix\n" );
        Shape t5w = null;
        try{
            t5w = new Cube(
                new Point(-6.0, 1.5, 2.5),  new Point(1.0, 0.0, 0.0),  new Point(1.0, 3.0, 0.0),  new Point(3.0, 1.5, 2.5),
                new Point(-1.0, 1.5, 2.5),  new Point(1.0, 0.0, 5.0),  new Point(1.0, 3.0, 5.0),  new Point(8.0, 1.5, 2.5)
            );
            printIt( t5w, "t5w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t5w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t5q = null;
        try{
            t5q = new Cuboid(
                new Point(-6.0, 1.5, 2.5),  new Point(1.0, 0.0, 0.0),  new Point(1.0, 3.0, 0.0),  new Point(3.0, 1.5, 2.5),
                new Point(-1.0, 1.5, 2.5),  new Point(1.0, 0.0, 5.0),  new Point(1.0, 3.0, 5.0),  new Point(8.0, 1.5, 2.5)
            );
            printIt( t5q, "t5q" );
        }catch( final AssertionError ex ){
            System.out.printf( "t5q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cube:
        System.out.printf( "Cube\n" );
        Shape t6w = null;
        try{
            t6w = new Cube(
                new Point(-8.3, +4.9,  5.3),  new Point(-2.3, -2.1, -0.7),  new Point(0.7, 10.9,  7.3),  new Point(6.7, +3.9,  1.3),
                new Point(-6.3, -1.1, 14.3),  new Point(-0.3, -8.1, +8.3),  new Point(2.7,  4.9, 16.3),  new Point(8.7, -2.1, 10.3)
            );
            printIt( t6w, "t6w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t6w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n" );
        try{
            t6w = new Cube(
                new Point(+6.7, 3.9, 1.3),  new Point(-6.3, -1.1, 14.3),  new Point(-0.3, -8.1, 8.3),  new Point(-2.3, -2.1, -0.7),
                new Point(-8.3, 4.9, 5.3),  new Point(+2.7, +4.9, 16.3),  new Point(+0.7, 10.9, 7.3),  new Point(+8.7, -2.1, 10.3)
            );
            printIt( t6w, "t6w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t6w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        
        // Cube: ( -1.3, -2.3, -4.7 )   "+"     (4,4,7),    (1,-8,4)     (-8,1,4)
        System.out.printf( "Cube\n" );
        Shape t7w = null;
        try{
            t7w = new Cube(
                new Point(-1.3, -2.3, -4.7),  new Point(-0.3, -10.3, -0.7),  new Point(+3.7, -6.3, 6.3),  new Point(-8.3, -9.3,  3.3),
                new Point(+2.7, +1.7, +2.3),  new Point(-9.3,  -1.3, -0.7),  new Point(-5.3, +2.7, 6.3),  new Point(-4.3, -5.3, 10.3)
            );
            printIt( t7w, "t7w" );
        }catch( final AssertionError ex ){
            System.out.printf( "test1w -> %s\n",  ex.getMessage() );
        }//try
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid: ( -3.7, -1.7, -4.3 )   "+"   5*(4,4,7)   3*(1,-8,4)   2*(-8,1,4)
        System.out.printf( "Cuboid\n" );
        Shape t8w = null;
        try{
            t8w = new Cube(
                new Point(-3.7, -1.7, -4.3),  new Point( -0.7, -25.7, 7.7),  new Point(19.3, -5.7, 42.7),  new Point(-16.7, -23.7, 15.7),
                new Point(16.3, 18.3, 30.7),  new Point(-19.7,   0.3, 3.7),  new Point( 0.3, 20.3, 38.7),  new Point(  3.3,  -3.7, 50.7)
            );
            printIt( t8w, "t8w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t8w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t8q = null;
        try{
            t8q = new Cuboid(
                new Point(-3.7, -1.7, -4.3),  new Point( -0.7, -25.7, 7.7),  new Point(19.3, -5.7, 42.7),  new Point(-16.7, -23.7, 15.7),
                new Point(16.3, 18.3, 30.7),  new Point(-19.7,   0.3, 3.7),  new Point( 0.3, 20.3, 38.7),  new Point(  3.3,  -3.7, 50.7)
            );
            printIt( t8q, "t8q" );
        }catch( final AssertionError ex ){
            System.out.printf( "t8q -> %s\n",  ex.getMessage() );
        }//try
        //
        System.out.printf( "\n\n" );
        
        
        
        // Cuboid: ( -1.9, -0.7, -3.1 )   "+"   2.5*(2,2,1)   (1,-2,2)   1.5*(-4,2,4)
        System.out.printf( "Cuboid\n" );
        Shape t9w = null;
        try{
            t9w = new Cube(
                new Point(-4.9, 0.8, -0.1),  new Point(-0.9, -2.7, -1.1),  new Point( 3.1,  4.3, -0.6),  new Point(-1.9, -0.7, -3.1),
                new Point( 4.1, 2.3,  1.4),  new Point( 0.1,  5.8,  2.4),  new Point(-3.9, -1.2,  1.9),  new Point( 1.1,  3.8,  4.4)
            );
            printIt( t9w, "t9w" );
        }catch( final AssertionError ex ){
            System.out.printf( "t9w -> %s\n",  ex.getMessage() );
        }//try
        //
        Shape t9q = null;
        try{
            t9q = new Cuboid(
                new Point(-4.9, 0.8, -0.1),  new Point(-0.9, -2.7, -1.1),  new Point( 3.1,  4.3, -0.6),  new Point(-1.9, -0.7, -3.1),
                new Point( 4.1, 2.3,  1.4),  new Point( 0.1,  5.8,  2.4),  new Point(-3.9, -1.2,  1.9),  new Point( 1.1,  3.8,  4.4)
            );
            printIt( t9q, "t9q" );
        }catch( AssertionError ex ){
            System.out.printf( "t9q -> %s\n",  ex.getMessage() );
        }//try
        
    }//method()
    
    
    
    private static void printIt( final Shape f, final String name ){
        System.out.printf( "%s.volume  = %f\n",  name, f.getVolume() );
        System.out.printf( "%s.surface = %f\n",  name, f.getSurface() );
        System.out.printf( "%s.center  = %s\n",  name, f.getCenter() );
        System.out.printf( "%s=%s\n",  name, f );     
    }//method()
    
}//class
