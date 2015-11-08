 


import java.util.Arrays;


public class TestFrameUltraCheck {

    
    static final public double[][][] coordinate={
        //(---.-,---.-,---.-}_(---.-,---.-,---.-)_(---.-,---.-,---.-)_(---.-,---.-,---.-)_(---.-,---.-,---.-)_(---.-,---.-,---.-)_(---.-,---.-,---.-)_(---.-,---.-,---.-)
        { {-19.7,  0.3,  3.7},{-16.7,-23.7, 15.7},{ -3.7, -1.7, -4.3},{ -0.7,-25.7,  7.7},{  0.3, 20.3, 38.7},{  3.3, -3.7, 50.7},{ 16.3, 18.3, 30.7},{ 19.3, -5.7, 42.7} },
        { { -9.3, -1.3, -0.7},{ -8.3, -9.3,  3.3},{ -5.3,  2.7,  6.3},{ -4.3, -5.3, 10.3},{ -1.3, -2.3, -4.7},{ -0.3,-10.3, -0.7},{  2.7,  1.7,  2.3},{  3.7, -6.3,  6.3} },
        { { -8.3,  4.9,  5.3},{ -6.3, -1.1, 14.3},{ -2.3, -2.1, -0.7},{ -0.3, -8.1,  8.3},{  0.7, 10.9,  7.3},{  2.7,  4.9, 16.3},{  6.7,  3.9,  1.3},{  8.7, -2.1, 10.3} },
        { { -6.0,  1.5,  2.5},{ -1.0,  1.5,  2.5},{  1.0,  0.0,  0.0},{  1.0,  0.0,  5.0},{  1.0,  3.0,  0.0},{  1.0,  3.0,  5.0},{  3.0,  1.5,  2.5},{  8.0,  1.5,  2.5} },
        { { -4.9,  0.8, -0.1},{ -3.9, -1.2,  1.9},{ -1.9, -0.7, -3.1},{ -0.9, -2.7, -1.1},{  0.1,  5.8,  2.4},{  1.1,  3.8,  4.4},{  3.1,  4.3, -0.6},{  4.1,  2.3,  1.4} },
        { { -3.0,  4.0,  0.0},{ -3.0,  4.0,  5.0},{  0.0,  0.0,  0.0},{  0.0,  0.0,  5.0},{  2.0,  4.0,  0.0},{  2.0,  4.0,  5.0},{  5.0,  0.0,  0.0},{  5.0,  0.0,  5.0} },
        { { -2.0, -3.0, -5.0},{ -2.0, -3.0,  5.0},{ -2.0,  3.0, -5.0},{ -2.0,  3.0,  5.0},{  2.0, -3.0, -5.0},{  2.0, -3.0,  5.0},{  2.0,  3.0, -5.0},{  2.0,  3.0,  5.0} },
        { { -0.5,  4.0,  6.5},{  0.0,  0.0,  0.0},{  0.0,  0.0,  4.5},{  0.0,  4.5,  0.0},{  4.0, -0.5,  6.5},{  4.0,  4.0,  2.0},{  4.0,  4.0,  6.5},{  4.5,  0.0,  0.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  1.0},{  0.0,  1.0,  0.0},{  0.0,  1.0,  1.0},{  1.0,  0.0,  0.0},{  1.0,  0.0,  1.0},{  1.0,  1.0,  0.0},{  1.0,  1.0,  1.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  3.0},{  0.0,  2.0,  0.0},{  0.0,  2.0,  3.0},{  1.0,  0.0,  0.0},{  1.0,  0.0,  4.0},{  1.0,  2.0,  0.0},{  1.0,  2.0,  4.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  3.0},{  0.0,  2.0,  0.0},{  0.0,  2.0,  4.0},{  1.0,  0.0,  0.0},{  1.0,  0.0,  3.0},{  1.0,  2.0,  0.0},{  1.0,  2.0,  4.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  3.0},{  0.0,  3.0,  0.0},{  1.0,  1.0,  2.0},{  1.0,  4.0,  5.0},{  3.0,  0.0,  0.0},{  4.0,  1.0,  5.0},{  4.0,  4.0,  5.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  3.0},{  0.0,  3.0,  0.0},{  2.0,  2.0,  2.0},{  2.0,  5.0,  5.0},{  3.0,  0.0,  0.0},{  5.0,  2.0,  5.0},{  5.0,  5.0,  5.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  5.0},{  0.0,  5.0,  0.0},{  0.0,  5.0,  5.0},{  5.0,  0.0,  0.0},{  5.0,  0.0,  5.0},{  5.0,  5.0,  0.0},{  5.0,  5.0,  5.0} },
        { {  0.0,  0.0,  0.0},{  0.0,  3.0,  4.0},{  0.0,  5.0,  0.0},{  0.0,  6.0,  4.0},{  5.0,  0.0,  0.0},{  5.0,  3.0,  4.0},{  5.0,  5.0,  0.0},{  5.0,  8.0,  4.0} },
        //
        //
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------__//
        // last :  7*7 = 2*2+3*3+6*6
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  7.0},{  0.0,  7.0,  7.0},{  0.0,  7.0,  0.0},{  6.0, -3.0,  2.0},{  6.0,  2.0, 10.0},{  6.0, 10.0,  5.0},{  6.0,  5.0, -3.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  7.0},{  0.0,  7.0,  7.0},{  0.0,  7.0,  0.0},{  6.0, -2.0,  3.0},{  6.0,  3.0,  9.0},{  6.0,  9.0,  4.0},{  6.0,  4.0, -2.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  7.0},{  0.0,  7.0,  7.0},{  0.0,  7.0,  0.0},{  6.0,  2.0, -3.0},{  6.0, -3.0,  5.0},{  6.0,  5.0, 10.0},{  6.0, 10.0,  2.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  7.0},{  0.0,  7.0,  7.0},{  0.0,  7.0,  0.0},{  6.0,  3.0, -2.0},{  6.0, -2.0,  4.0},{  6.0,  4.0,  9.0},{  6.0,  9.0,  3.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  7.0,  0.0},{  7.0,  7.0,  0.0},{  7.0,  0.0,  0.0},{ -3.0,  2.0,  6.0},{  2.0, 10.0,  6.0},{ 10.0,  5.0,  6.0},{  5.0, -3.0,  6.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  7.0,  0.0},{  7.0,  7.0,  0.0},{  7.0,  0.0,  0.0},{ -2.0,  3.0,  6.0},{  3.0,  9.0,  6.0},{  9.0,  4.0,  6.0},{  4.0, -2.0,  6.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  7.0,  0.0},{  7.0,  7.0,  0.0},{  7.0,  0.0,  0.0},{  2.0, -3.0,  6.0},{ -3.0,  5.0,  6.0},{  5.0, 10.0,  6.0},{ 10.0,  2.0,  6.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  7.0,  0.0},{  7.0,  7.0,  0.0},{  7.0,  0.0,  0.0},{  3.0, -2.0,  6.0},{ -2.0,  4.0,  6.0},{  4.0,  9.0,  6.0},{  9.0,  3.0,  6.0} }, //nix
        { {  0.0,  0.0,  0.0},{  7.0,  0.0,  0.0},{  7.0,  0.0,  7.0},{  0.0,  0.0,  7.0},{  2.0,  6.0, -3.0},{ 10.0,  6.0,  2.0},{  5.0,  6.0, 10.0},{ -3.0,  6.0,  5.0} }, //nix
        { {  0.0,  0.0,  0.0},{  7.0,  0.0,  0.0},{  7.0,  0.0,  7.0},{  0.0,  0.0,  7.0},{  3.0,  6.0, -2.0},{  9.0,  6.0,  3.0},{  4.0,  6.0,  9.0},{ -2.0,  6.0,  4.0} }, //nix
        { {  0.0,  0.0,  0.0},{  7.0,  0.0,  0.0},{  7.0,  0.0,  7.0},{  0.0,  0.0,  7.0},{ -3.0,  6.0,  2.0},{  5.0,  6.0, -3.0},{ 10.0,  6.0,  5.0},{  2.0,  6.0, 10.0} }, //nix
        { {  0.0,  0.0,  0.0},{  7.0,  0.0,  0.0},{  7.0,  0.0,  7.0},{  0.0,  0.0,  7.0},{ -2.0,  6.0,  3.0},{  4.0,  6.0, -2.0},{  9.0,  6.0,  4.0},{  3.0,  6.0,  9.0} }, //nix
        { {  0.0,  0.0,  0.0},{  0.0,  0.0,  7.0},{  0.0,  7.0,  7.0},{  0.0,  7.0,  0.0},{  7.0,  0.0,  0.0},{  7.0,  0.0,  7.0},{  7.0,  7.0,  7.0},{  7.0,  7.0,  0.0} }  //Cube
    };//coordinate
    
    
    
    
    
    static public void printSorted( final double[][][] coordinate ){
        for ( final double[][] a : coordinate ){
            for ( int i=a.length; --i>=0; ){
                for ( int j=i; --j>=0; ){
                    if (     ( a[i][0]  < a[j][0] )
                        || ( ( a[i][0] == a[j][0] ) && ( a[i][1]  < a[j][1] ) )
                        || ( ( a[i][0] == a[j][0] ) && ( a[i][1] == a[j][1] ) && ( a[i][2] < a[j][2] ) )
                    ){
                        final double[] tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }//if
                }//for
            }//for
            
            System.out.printf( "%8s{ {%5.1f_%5.1f_%5.1f}",   " ", a[0][0], a[0][1], a[0][2] );
            for ( int i=1; i<a.length; i++ )  System.out.printf( "_{%5.1f_%5.1f_%5.1f}",   a[i][0], a[i][1], a[i][2] );
            System.out.printf( " }_\n" );
        }//for
    }//printSorted()
    
    
    static public String toPrettyTimeString( final long nsTime ){
        if (       nsTime < 1_000L ){
            return String.format( "%d[ns]",  nsTime );
        }else if ( nsTime < 1_000_000L ){
            return String.format( "%d_%03d[ns]",  nsTime/1000L, nsTime%1000 );
        }else if ( nsTime < 1_000_000_000L ){
            return String.format(
                "%d_%03d_%03d[ns]",
                   nsTime / 1_000_000L,
                 ( nsTime /     1_000L ) % 1000,
                   nsTime                % 1000
            );//return
        }else if ( nsTime < 1_000_000_000_000L ){
            return String.format(
                "%d__%03d_%03d_%03d[ns]",
                   nsTime / 1_000_000_000L,
                 ( nsTime /     1_000_000L ) % 1000,
                 ( nsTime /         1_000L ) % 1000,
                   nsTime                    % 1000
            );//return
        }else if ( nsTime < 1_000_000_000_000_000L ){
            return String.format(
                "%d_%03d__%03d_%03d_%03d[ns]",
                   nsTime / 1_000_000_000_000L ,
                (  nsTime /     1_000_000_000L ) % 1000,
                (  nsTime /         1_000_000L ) % 1000,
                (  nsTime /             1_000L ) % 1000,
                   nsTime                        % 1000
            );//return
        }else if ( nsTime < 1_000_000_000_000_000_000L ){
            return String.format(
                "%d_%03d_%03d__%03d_%03d_%03d[ns]",
                   nsTime / 1_000_000_000_000_000L ,
                (  nsTime /     1_000_000_000_000L ) % 1000,
                (  nsTime /         1_000_000_000L ) % 1000,
                (  nsTime /             1_000_000L ) % 1000,
                (  nsTime /                 1_000L ) % 1000,
                   nsTime                            % 1000
            );//return
        }else{
            return String.format(
                "%d_%03d_%03d_%03d__%03d_%03d_%03d[ns]",
                   nsTime / 1_000_000_000_000_000_000L ,
                (  nsTime /     1_000_000_000_000_000L ) % 1000,
                (  nsTime /         1_000_000_000_000L ) % 1000,
                (  nsTime /             1_000_000_000L ) % 1000,
                (  nsTime /                 1_000_000L ) % 1000,
                (  nsTime /                     1_000L ) % 1000,
                   nsTime                                % 1000
            );//return 
        }//if
    }//toPrettyTimeString()
    
    
    
    
    
    public static void main( final String[] unused ){
        final long timeStampStart = System.nanoTime();
        
      //printSorted( coordinate );
        
        for ( final double[][] a : coordinate ){
            
            // init for current testcase
            //
            final int EIGHT = 8;                                                // 8 points are given
            assert a.length==EIGHT : "INTERNAL BUG - NOT 8 points";
            final Point[] point = new Point[EIGHT];
            for ( int i=EIGHT; --i>=0; )  point[i] = new Point( a[i] );
            //
            final double tolerance = 1e-10;
            Cuboid  cuboid;
            double  refSurface = 0;
            double  refVolume  = 0;
            Point   refCenter  = null;
            boolean refCuboidValid;
            boolean refCubeValid;
            //
            if ( Cuboid.isValid(point) ){
                refCuboidValid = true;
                cuboid         = new Cuboid( point );
                refSurface     = cuboid.getSurface();
                refVolume      = cuboid.getVolume();
                refCenter      = cuboid.getCenter();
                refCubeValid   = Cube.isValid(point);
            }else{
                refCuboidValid = false;
                refCubeValid   = false;
            }//if
            //
            System.out.printf( "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n" );
            System.out.printf( "%s:%s     %s:%s\n",     refCuboidValid?"CUBOID":"cuboid", refCuboidValid,  refCubeValid?"CUBE":"cube", refCubeValid );
            System.out.printf( "%s\n",  Arrays.toString( point ) );
            System.out.printf( "%s\n",  Arrays.toString( Cuboid.computeLineLength( point ) ) );
            System.out.printf( "%s\n",  Cuboid.getCenter( point ) );
            //
            final Point[] permu = { null, null, null, null, null, null, null, null };
            int cnt = 0;
            
            
            // start checking with current testcase
            loop0:
            for ( int p0=EIGHT; --p0>=0; ){
                permu[p0] = point[0];
                loop1:
                for ( int p1=EIGHT; --p1>=0; ){
                    if ( permu[p1]!=null )  continue loop1;
                    permu[p1] = point[1];
                    loop2:
                    for ( int p2=EIGHT; --p2>=0; ){
                        if ( permu[p2]!=null )  continue loop2;
                        permu[p2] = point[2];
                        loop3:
                        for ( int p3=EIGHT; --p3>=0; ){
                            if ( permu[p3]!=null )  continue loop3;
                            permu[p3] = point[3];
                            loop4:
                            for ( int p4=EIGHT; --p4>=0; ){
                                if ( permu[p4]!=null )  continue loop4;
                                permu[p4] = point[4];
                                loop5:
                                for ( int p5=EIGHT; --p5>=0; ){
                                    if ( permu[p5]!=null )  continue loop5;
                                    permu[p5] = point[5];
                                    loop6:
                                    for ( int p6=EIGHT; --p6>=0; ){
                                        if ( permu[p6]!=null )  continue loop6;
                                        permu[p6] = point[6];
                                        loop7:
                                        for ( int p7=EIGHT; --p7>=0; ){
                                            if ( permu[p7]!=null )  continue;
                                            permu[p7] = point[7];
                                            
                                            //##################################
                                            //###
                                            //### ACTUAL TEST with current permutation of current test case
                                            //###
                                            
                                            
                                            /*
                                            // Martin S1T8 WS11
                                            c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vHansenMartinS1T8WS11.Point[] martinPA = new c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vHansenMartinS1T8WS11.Point[8];
                                            for ( int i=0; i<point.length; i++ ){
                                                martinPA[i] = new c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vHansenMartinS1T8WS11.Point( permu[i].dim );
                                            }
                                            if ( refCuboidValid != c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vHansenMartinS1T8WS11.Cuboid.isCuboid( martinPA ) ){
                                                System.out.printf( "(Cube:%s Cuboid:%s) REF:%s != %s\n",  Cube.isValid(permu), Cuboid.isValid(permu), refCuboidValid, c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vHansenMartinS1T8WS11.Cuboid.isCuboid( martinPA ) );
                                                System.out.printf( "%s\n",  Arrays.toString( permu ) );
                                                System.out.printf( "%s\n",  Arrays.toString( martinPA ) );
                                                System.out.printf( "%s\n",  Arrays.toString( Cuboid.computeLineLength( point ) ) );
                                                System.out.flush();
                                                assert false : "ERROR";
                                            }
                                            */
                                            
                                            
                                            /*
                                            // Arne S4T3 WS10
                                            c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vRichterArneS4T3WS10.Point[] arnePA = new c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vRichterArneS4T3WS10.Point[8];
                                            for ( int i=0; i<point.length; i++ ){
                                                arnePA[i] = new c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vRichterArneS4T3WS10.Point( permu[i].dim[0], permu[i].dim[1], permu[i].dim[2] );
                                            }
                                            c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vRichterArneS4T3WS10.Cuboid  arneCuboid = new c07_S12W_TI1_P1.aufgabenzettel3_A7.toBeChecked.vRichterArneS4T3WS10.Cuboid( arnePA );
                                            if ( refCuboidValid != arneCuboid.checkBody() ){
                                                System.out.printf( "(Cube:%s Cuboid:%s) REF:%s != %s\n",  Cube.isValid(permu), Cuboid.isValid(permu), refCuboidValid, arneCuboid.checkBody() );
                                                System.out.printf( "%s\n",  Arrays.toString( permu ) );
                                                System.out.printf( "%s\n",  Arrays.toString( arnePA ) );
                                                System.out.printf( "%s\n",  Arrays.toString( Cuboid.computeLineLength( point ) ) );
                                                System.out.flush();
                                                assert false : "ERROR";
                                            }
                                            */
                                            
                                            
                                            /*
                                            // self test
                                            // cuboid = new Cuboid( permu );
                                            if ( refCuboidValid ){
                                                // check cuboid
                                                cuboid = new Cuboid( permu );
                                                assert tolerance > Math.abs(refSurface-cuboid.getSurface()) : "SURFACE";
                                                assert tolerance > Math.abs(refVolume -cuboid.getVolume() ) : "VOLUME";
                                                assert refCenter.isEqual(cuboid.getCenter(), tolerance)     : "CENTER";
                                                if ( refCubeValid ){
                                                    // check cube
                                                }//if
                                            }//if
                                            */
                                            
                                            
                                            //###
                                            //### END of Test
                                            //###
                                            //###^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                                            cnt++;
                                            permu[p7] = null;
                                        }//for
                                        permu[p6] = null;
                                    }//for
                                    permu[p5] = null;
                                }//for
                                permu[p4] = null;
                            }//for
                            permu[p3] = null;
                        }//for
                        permu[p2] = null;
                    }//for
                    permu[p1] = null;
                }//for
                permu[p0] = null;
            }//for
            assert (!refCuboidValid) || cnt==40320 : String.format( "INTERNAL ERROR : cnt==%d!=40320==8*7*6*5*4*3*2*1", cnt );
        }//for
        //
        System.out.printf( "\nTHE END after %s", toPrettyTimeString( System.nanoTime()-timeStampStart ) );
    }//main()
    
}//TestFrameUltraCheck
