package shape;


import java.util.*;


/**
 * TestFrame for A4x2: ...
 * 
 * @author   Michael Schäfers ; P1@Hamburg-UAS.eu 
 * @version  2015/11/13
 */
public class UnitTestFrame {
    
    /**
     * Note that this is JUnit Test
     */
    public void doTest(){
        
        System.out.printf( "Nach [Rechts-Klick] auf Klasse nicht mit new ... ein Objekt erzeugen,\n" );
        System.out.printf( "sondern \"Test All\" starten.\n" );
        System.out.printf( "Es kann etwas dauern (ca. 10s).\n" );
        System.out.printf( "Falls ein gruener Balken erscheint, was der Test erfolgreich.\n" );
        System.out.printf( "Falls ein roter Balken erscheint, sind Fehler aufgetreten.\n" );
        
    }//method()
    
    
    
    
    
    //@Test
    public void test(){
        
        // Cube
        permutate(
            true,                   // cube expected ?
            true,                   // cuboid expected ?
            new Point( +0.0,  +0.0,  +0.0),   new Point( +0.0,  +1.0,  +0.0),   new Point( +0.0,  +0.0,  +1.0),   new Point( +0.0,  +1.0,  +1.0),
            new Point( +1.0,  +0.0,  +0.0),   new Point( +1.0,  +1.0,  +0.0),   new Point( +1.0,  +0.0,  +1.0),   new Point( +1.0,  +1.0,  +1.0)
        );
        //  ( +0.0, +0.0, +0.0 )    "+"    (+1.0, +0.0, +0.0),  (+0.0, +1.0, +0.0),  (+0.0, +0.0, +1.0)
        
        // Cube                     (Test#1)
        permutate(
            true,                   // cube expected ?
            true,                   // cuboid expected ?
            new Point( +0.0,  +0.0,  +0.0),   new Point( +0.0,  +5.0,  +0.0),   new Point( +0.0,  +0.0,  +5.0),   new Point( +0.0,  +5.0,  +5.0),
            new Point( +5.0,  +0.0,  +0.0),   new Point( +5.0,  +5.0,  +0.0),   new Point( +5.0,  +0.0,  +5.0),   new Point( +5.0,  +5.0,  +5.0)
        );
        //  ( +0.0, +0.0, +0.0 )    "+"    (+5.0, +0.0, +0.0),  (+0.0, +5.0, +0.0),  (+0.0, +0.0, +5.0)
        
        // Cube
        permutate(
            true,                   // cube expected ?
            true,                   // cuboid expected ?
            new Point( +6.7,  +3.9,  +1.3),   new Point( -8.3,  +4.9,  +5.3),   new Point( -6.3,  -1.1, +14.3),   new Point( +2.7,  +4.9, +16.3),
            new Point( -0.3,  -8.1,  +8.3),   new Point( +0.7, +10.9,  +7.3),   new Point( -2.3,  -2.1,  -0.7),   new Point( +8.7,  -2.1, +10.3)
        );
        //  ( -2.3, -2.1, -0.7 )    "+"    (+9.0, +6.0, +2.0),  (+2.0, -6.0, +9.0),  (-6.0, +7.0, +6.0)
        
        // Cube (?)                 (Test#6)
        permutate(
            true,                   // cube expected ?
            true,                   // cuboid expected ?
            new Point( -8.3,  +4.9,  +5.3),   new Point( -2.3,  -2.1,  -0.7),   new Point( +0.7, +10.9,  +7.3),   new Point( +6.7,  +3.9,  +1.3),
            new Point( -6.3,  -1.1, +14.3),   new Point( -0.3,  -8.1,  +8.3),   new Point( +2.7,  +4.9, +16.3),   new Point( +8.7,  -2.1, +10.3)
        );
        //  ...
        
        // Cube
        permutate(
            true,                   // cube expected ?
            true,                   // cuboid expected ?
            new Point( -1.3,  -2.3,  -4.7),   new Point( -0.3, -10.3,  -0.7),   new Point( +3.7,  -6.3,  +6.3),   new Point( -8.3,  -9.3,  +3.3),
            new Point( +2.7,  +1.7,  +2.3),   new Point( -9.3,  -1.3,  -0.7),   new Point( -5.3,  +2.7,  +6.3),   new Point( -4.3,  -5.3, +10.3)
        );
        //  ( -1.3, -2.3, -4.7 )    "+"    (+4.0, +4.0, +7.0),  (+1.0, -8.0, +4.0),  (-8.0, +1.0, +4.0)
        
        
        
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
