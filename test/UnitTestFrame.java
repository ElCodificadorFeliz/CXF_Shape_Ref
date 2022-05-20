package test;


import static org.junit.jupiter.api.Assertions.*;
import static shape.Shape.epsilon;

import java.util.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import shape.Cube;
import shape.Cuboid;
import shape.Point;
import shape.Shape;
import test.support.Permutationer;
import test.support.SimplePermutationer;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;




/**
 * UnitTestFrame : ...
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2015/11/13
 */
@TestMethodOrder(OrderAnnotation.class)
public class UnitTestFrame {
    
    @BeforeAll
    public static void init(){
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n\n" );
        System.out.printf( "Release:\n" );
        System.out.printf( "    ...\n" );
        System.out.printf( "\n\n" );
        System.out.printf( "Environment:\n" );
        System.out.printf( "    ...\n" );
        System.out.printf( "\n\n\n\n" );
        System.out.printf( "Start of actual tests\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        System.out.flush();
    }//method()    
    
    
    
    
    
    @Test
    @Order(100_0101)
    public void testWithCubePoints01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( +0.0,  +0.0,  +0.0),   new Point( +0.0,  +1.0,  +0.0),   new Point( +0.0,  +0.0,  +1.0),   new Point( +0.0,  +1.0,  +1.0),
            new Point( +1.0,  +0.0,  +0.0),   new Point( +1.0,  +1.0,  +0.0),   new Point( +1.0,  +0.0,  +1.0),   new Point( +1.0,  +1.0,  +1.0)
        };
        final double expectedSurface = 6.0;
        final double expectedVolume = 1.0;
        final Point expectedCenter = new Point( 0.5, 0.5, 0.5 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( +0.0, +0.0, +0.0 )    "+"    (+1.0, +0.0, +0.0),  (+0.0, +1.0, +0.0),  (+0.0, +0.0, +1.0)
    }//method()
    
    
    @Test
    @Order(100_0102)
    public void testWithCubePoints02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( +0.0,  +0.0,  +0.0),   new Point( +0.0,  +5.0,  +0.0),   new Point( +0.0,  +0.0,  +5.0),   new Point( +0.0,  +5.0,  +5.0),
            new Point( +5.0,  +0.0,  +0.0),   new Point( +5.0,  +5.0,  +0.0),   new Point( +5.0,  +0.0,  +5.0),   new Point( +5.0,  +5.0,  +5.0)
        };
        final double expectedSurface = 150.0;
        final double expectedVolume = 125.0;
        final Point expectedCenter = new Point( 2.5, 2.5, 2.5 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( +0.0, +0.0, +0.0 )    "+"    (+5.0, +0.0, +0.0),  (+0.0, +5.0, +0.0),  (+0.0, +0.0, +5.0)
    }//method()
    
    
    @Test
    @Order(100_0103)
    public void testWithCubePoints03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -4.2, -4.2, -4.2),   new Point( -4.2, +4.2, -4.2),   new Point( +4.2, +4.2, -4.2),   new Point( +4.2, -4.2, -4.2),
            new Point( -4.2, -4.2, +4.2),   new Point( -4.2, +4.2, +4.2),   new Point( +4.2, +4.2, +4.2),   new Point( +4.2, -4.2, +4.2)
        };
        final double expectedSurface = 423.36;
        final double expectedVolume = 592.704;
        final Point expectedCenter = new Point( 0.0, 0.0, 0.0 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_0104)
    public void testWithCubePoints04(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( +6.7,  +3.9,  +1.3),   new Point( -8.3,  +4.9,  +5.3),   new Point( -6.3,  -1.1, +14.3),   new Point( +2.7,  +4.9, +16.3),
            new Point( -0.3,  -8.1,  +8.3),   new Point( +0.7, +10.9,  +7.3),   new Point( -2.3,  -2.1,  -0.7),   new Point( +8.7,  -2.1, +10.3)
        };
        final double expectedSurface = 726.0;
        final double expectedVolume = 1331.0;
        final Point expectedCenter = new Point( 0.2, 1.4, 7.8 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -2.3, -2.1, -0.7 )    "+"    (+9.0, +6.0, +2.0),  (+2.0, -6.0, +9.0),  (-6.0, +7.0, +6.0)
    }//method()
    
    
    @Test
    @Order(100_0105)
    public void testWithCubePoints05(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  +3.64,  +6.24, +21.19),   new Point(  -8.06,  -1.56, +18.59),   new Point( +11.44,  -2.86, +13.39),   new Point(  -0.26, -10.66, +10.79),
            new Point(  +1.04, +14.04,  +9.49),   new Point( -10.66,  +6.24,  +6.89),   new Point(  +8.84,  +4.94,  +1.69),   new Point(  -2.86,  -2.86,  -0.91)
        };
        final double expectedSurface = 1226.94;
        final double expectedVolume = 2924.207;
        final Point expectedCenter = new Point( 0.39, 1.69, 10.14 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  f(  ( -2.3, -2.1, -0.7 )    "+"    (+9.0, +6.0, +2.0),  (+2.0, -6.0, +9.0),  (-6.0, +7.0, +6.0)  )
    }//method()
    
    
    @Test
    @Order(100_0106)
    public void testWithCubePoints06(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -1.3,  -2.3,  -4.7),   new Point( -0.3, -10.3,  -0.7),   new Point( +3.7,  -6.3,  +6.3),   new Point( -8.3,  -9.3,  +3.3),
            new Point( +2.7,  +1.7,  +2.3),   new Point( -9.3,  -1.3,  -0.7),   new Point( -5.3,  +2.7,  +6.3),   new Point( -4.3,  -5.3, +10.3)
        };
        final double expectedSurface = 486.0;
        final double expectedVolume = 729.0;
        final Point expectedCenter = new Point( -2.8, -3.8, 2.8 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -1.3, -2.3, -4.7 )    "+"    (+4.0, +4.0, +7.0),  (+1.0, -8.0, +4.0),  (-8.0, +1.0, +4.0)
    }//method()
    
    
    
    @Test
    @Order(100_1101)
    public void testWithCuboidPoints01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -2.0,  -3.0,  -5.0),   new Point( -2.0,  +3.0,  -5.0),   new Point( +2.0,  -3.0,  -5.0),   new Point( +2.0,  +3.0,  -5.0),
            new Point( -2.0,  -3.0,  +5.0),   new Point( -2.0,  +3.0,  +5.0),   new Point( +2.0,  -3.0,  +5.0),   new Point( +2.0,  +3.0,  +5.0)
        };
        final double expectedSurface = 248.0;
        final double expectedVolume = 240.0;
        final Point expectedCenter = new Point( 0.0, 0.0, 0.0 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_1102)
    public void testWithCuboidPoints02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -3.7,  -1.7,  -4.3),   new Point( -0.7, -25.7,  +7.7),   new Point(+19.3,  -5.7, +42.7),   new Point(-16.7, -23.7, +15.7),
            new Point(+16.3, +18.3, +30.7),   new Point(-19.7,  +0.3,  +3.7),   new Point( +0.3, +20.3, +38.7),   new Point(  3.3,  -3.7, +50.7)
        };
        final double expectedSurface = 5022.0;
        final double expectedVolume = 21870.0;
        final Point expectedCenter = new Point( -0.2, -2.7, 23.2 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -3.7, -1.7, -4.3 )    "+"  5*(+4.0, +4.0, +7.0),  3*(+1.0, -8.0, +4.0),  2*(-8.0, +1.0, +4.0)
    }//method()
    
    
    @Test
    @Order(100_1103)
    public void testWithCuboidPoints03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -4.9,  +0.8,  -0.1),   new Point( -0.9,  -2.7,  -1.1),   new Point( +3.1,  +4.3,  -0.6),   new Point( -1.9,  -0.7,  -3.1),
            new Point( +4.1,  +2.3,  +1.4),   new Point( +0.1,  +5.8,  +2.4),   new Point( -3.9,  -1.2,  +1.9),   new Point( +1.1,  +3.8,  +4.4)
        };
        final double expectedSurface = 139.5;
        final double expectedVolume = 101.25;
        final Point expectedCenter = new Point( -0.4, 1.55, 0.65 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -1.9, -0.7, -3.1 )    "+"  2.5*(+2.0, +2.0, +1.0),  (+1.0, -2.0, +2.0),  1.5*(-4.0, +2.0, +4.0)
    }//method()
    
    
    
    
    
    private void iTestWithCubePoints(
        final String testName,
        final double expectedSurface,
        final double expectedVolume,
        final Point expectedCenter,
        final Point... shapePoints
    ){
        assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
        final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
        while(permu.hasNext() ){
            
            // local declarations
            //
            double computedSurface;
            double computedVolume;
            Point computedCenter;
            //
            boolean exceptionDetected;
            String exceptionMessage = "";
            //
            final Point[] currentPoints = permu.next();
            
            
            // test cuboid
            //
            exceptionDetected = false;
            Cuboid cuboid = null;
            try{
                cuboid = new Cuboid( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cuboid was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cuboid was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cuboid.getSurface();
            assertTrue( 
                Math.abs( expectedSurface - computedSurface ) <= epsilon,
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cuboid.getVolume();
            assertTrue(
                Math.abs( expectedVolume - cuboid.getVolume() )  <= epsilon,
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cuboid.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
             );
            
            
            //test cube
            //
            exceptionDetected = false;
            Cube cube = null;
            try{
                cube = new Cube( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cube was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cube was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cube.getSurface();
            assertTrue( 
                Math.abs( expectedSurface - computedSurface ) <= epsilon,
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cube.getVolume();
            assertTrue(
                Math.abs( expectedVolume - cuboid.getVolume() )  <= epsilon,
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cube.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
             );
            
        }//while
        
    }//method()
    
    private void iTestWithCuboidPoints(
        final String testName,
        final double expectedSurface,
        final double expectedVolume,
        final Point expectedCenter,
        final Point... shapePoints
    ){
        assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
        final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
        while(permu.hasNext() ){
            
            // local declarations
            //
            double computedSurface;
            double computedVolume;
            Point computedCenter;
            //
            boolean exceptionDetected;
            String exceptionMessage = "";
            //
            final Point[] currentPoints = permu.next();
            
            
            // test cuboid
            //
            exceptionDetected = false;
            Cuboid cuboid = null;
            try{
                cuboid = new Cuboid( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cuboid was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cuboid was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cuboid.getSurface();
            assertTrue( 
                Math.abs( expectedSurface - computedSurface ) <= epsilon,
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cuboid.getVolume();
            assertTrue(
                Math.abs( expectedVolume - cuboid.getVolume() )  <= epsilon,
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cuboid.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
             );
            
            
            //test cube
            //
            exceptionDetected = false;
            Cube cube = null;
            try{
                cube = new Cube( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
            }finally{
                if( ! exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cube was detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Faulty cube was accepted" );
                }//if
            }//try
        }//while
        
    }//method()
    
    private void iTestWithShapePoints(
            final String testName,
            final double expectedSurface,
            final double expectedVolume,
            final Point expectedCenter,
            final Point... shapePoints
        ){
            assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
            final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
            while(permu.hasNext() ){
                
                // local declarations
                //
                boolean exceptionDetected;
                String exceptionMessage = "";
                //
                final Point[] currentPoints = permu.next();
                
                
                // test cuboid
                //
                exceptionDetected = false;
                Cuboid cuboid = null;
                try{
                    cuboid = new Cuboid( currentPoints );
                }catch( final Exception | AssertionError ex ){
                    exceptionDetected = true;
                    exceptionMessage = ex.getMessage();
                }finally{
                    if( exceptionDetected ){
                        StringBuilder sb = new StringBuilder( testName );
                        sb.append( ":\n" );
                        sb.append( "ERROR: Cuboid was detected  based on :\n" );
                        sb.append( Arrays.toString( currentPoints ));
                        sb.append( "\n" );
                        sb.append( exceptionMessage );
                        System.out.printf( "%s\n", sb.toString() );
                        System.out.printf( "\n\n" );
                        fail( "ERROR: Faulty cuboid was accepted" );
                    }//if
                }//try
                
                
                //test cube
                //
                exceptionDetected = false;
                Cube cube = null;
                try{
                    cube = new Cube( currentPoints );
                }catch( final Exception | AssertionError ex ){
                    exceptionDetected = true;
                }finally{
                    if( ! exceptionDetected ){
                        StringBuilder sb = new StringBuilder( testName );
                        sb.append( ":\n" );
                        sb.append( "ERROR: Cube was detected  based on :\n" );
                        sb.append( Arrays.toString( currentPoints ));
                        sb.append( "\n" );
                        sb.append( exceptionMessage );
                        System.out.printf( "%s\n", sb.toString() );
                        System.out.printf( "\n\n" );
                        fail( "ERROR: Faulty cube was accepted" );
                    }//if
                }//try
            }//while
            
        }//method()    
    
    // Cube
    //@Test
    public void test(){
        
        
        
        
        // Cuboid (?)               (Test#3)
        permutate(
            false,                  // cube expected ?
            true,                   // cuboid expected ?
            new Point( -2.0,  -3.0,  -5.0),   new Point( -2.0,  +3.0,  -5.0),   new Point( +2.0,  -3.0,  -5.0),   new Point( +2.0,  +3.0,  -5.0),
            new Point( -2.0,  -3.0,  +5.0),   new Point( -2.0,  +3.0,  +5.0),   new Point( +2.0,  -3.0,  +5.0),   new Point( +2.0,  +3.0,  +5.0)
        );
        // ...
        
        // Cuboid
        permutate(
            false,                  // cube expected ?
            true,                   // cuboid expected ?
            new Point( -3.7,  -1.7,  -4.3),   new Point( -0.7, -25.7,  +7.7),   new Point(+19.3,  -5.7, +42.7),   new Point(-16.7, -23.7, +15.7),
            new Point(+16.3, +18.3, +30.7),   new Point(-19.7,  +0.3,  +3.7),   new Point( +0.3, +20.3, +38.7),   new Point(  3.3,  -3.7, +50.7)
        );
        //  ( -3.7, -1.7, -4.3 )    "+"  5*(+4.0, +4.0, +7.0),  3*(+1.0, -8.0, +4.0),  2*(-8.0, +1.0, +4.0)
        
        // Cuboid
        permutate(
            false,                  // cube expected ?
            true,                   // cuboid expected ?
            new Point( -4.9,  +0.8,  -0.1),   new Point( -0.9,  -2.7,  -1.1),   new Point( +3.1,  +4.3,  -0.6),   new Point( -1.9,  -0.7,  -3.1),
            new Point( +4.1,  +2.3,  +1.4),   new Point( +0.1,  +5.8,  +2.4),   new Point( -3.9,  -1.2,  +1.9),   new Point( +1.1,  +3.8,  +4.4)
        );
        //  ( -1.9, -0.7, -3.1 )    "+"  2.5*(+2.0, +2.0, +1.0),  (+1.0, -2.0, +2.0),  1.5*(-4.0, +2.0, +4.0)
        
        
        
        // nix (?)                  (Test#2)
        permutate(
            false,                  // cube expected ?
            false,                  // cuboid expected ?
            new Point( +0.0,  +0.0,  +0.0),   new Point( +0.0,  +3.0,  +4.0),   new Point( +5.0,  +0.0,  +0.0),   new Point( +5.0,  +3.0,  +4.0),
            new Point( +0.0,  +5.0,  +0.0),   new Point( +0.0,  +8.0,  +4.0),   new Point( +5.0,  +5.0,  +0.0),   new Point( +5.0,  +8.0,  +4.0)
        );
        // ...
        
        // nix                      (Test#4)
        permutate(
            false,                  // cube expected ?
            false,                  // cuboid expected ?
            new Point( -3.0,  +4.0,  +0.0),   new Point( +0.0,  +0.0,  +0.0),   new Point( +2.0,  +4.0,  +0.0),   new Point( +5.0,  +0.0,  +0.0),
            new Point( -3.0,  +4.0,  +5.0),   new Point( +0.0,  +0.0,  +5.0),   new Point( +2.0,  +4.0,  +5.0),   new Point( +5.0,  +0.0,  +5.0)
        );
        // KEIN Wuerfel und KEIN Quader, aber Kantenlaenge immer 5
        
        // nix (?)                  (Test#5)
        permutate(
            false,                  // cube expected ?
            false,                  // cuboid expected ?
            new Point( -6.0,  +1.5,  +2.5),   new Point( +1.0,  +0.0,  +0.0),   new Point( +1.0,  +3.0,  +0.0),   new Point( +3.0,  +1.5,  +2.5),
            new Point( -1.0,  +1.5,  +2.5),   new Point( +1.0,  +0.0,  +5.0),   new Point( +1.0,  +3.0,  +5.0),   new Point( +8.0,  +1.5,  +2.5)
        );
        // ...
        
        // nix (?)
        permutate(
            false,                  // cube expected ?
            false,                  // cuboid expected ?
            new Point( +1.0,  +1.0,  +0.0),   new Point( -1.0,  +1.0,  +0.0),   new Point( -1.0,  -1.0,  +1.0),   new Point( +1.0,  +1.0,  +1.0),
            new Point( Math.sqrt(2), 0, 2),   new Point( 0, Math.sqrt(2), 2),   new Point(-Math.sqrt(2), 0, 2),   new Point( 0,-Math.sqrt(2), 2)
        );
        // ...
        
    }//method()
    
    
    
    
    
    private void permutate( final boolean cubeExpected, final boolean cuboidExpected, final Point... org ){
        final Point[] permutated = new Point[org.length];
        permutateReku( org, permutated, 0, cubeExpected, cuboidExpected );
    }//method()
    
    private void permutateReku(
        final Point[] org,
        final Point[] permutated,
        final int currentElem,
        final boolean cubeExpected,
        final boolean cuboidExpected
    ){
        assert permutated.length==8 : String.format( "invalid parameter - 8 points were expectedand %d received", permutated.length );
        if( currentElem==org.length  ){
            boolean checkResult;
            
            // test cuboid
            checkResult = false;
            try{
                Cuboid cuboid = new Cuboid( permutated );
                checkResult = cuboid.isValid();
            }catch( final Exception | AssertionError ex ){
                // nothing is done on purpose
            }finally{
                if( checkResult != cuboidExpected ){
                    System.out.printf(
                        "ERROR: Cuboid(%s) was reported as %s\n",
                        Arrays.toString( permutated ),
                        checkResult
                    );
                  //assertTrue( String.format( "Cuboid( %s )", Arrays.toString( permutated ) ),  false );
                }//if
            }//try
            
            // test cube
            checkResult = false;
            try{
                Cube cube = new Cube( permutated );
                checkResult = cube.isValid();
            }catch( final Exception | AssertionError ex ){
                // nothing is done on purpose
            }finally{
                if( checkResult != cubeExpected ){
                    System.out.printf(
                        "ERROR: Cube(%s) was reported as %s\n",
                        Arrays.toString( permutated ),
                        checkResult
                    );
                  //assertTrue( String.format( "Cube( %s )", Arrays.toString( permutated ) ),  false );
                }//if
            }//try
            
        }else{
            for( int i=0; i<org.length; i++ ){
                if( null == permutated[i] ){
                    permutated[i] = org[currentElem];
                    permutateReku( org, permutated, currentElem+1, cubeExpected, cuboidExpected );
                    permutated[i] = null;
                }//if
            }//for
        }//if
    }//method()
    
}//class
