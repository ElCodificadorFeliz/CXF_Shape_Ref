package test.support;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Permutationer<T> {
    
    final private T[] originalArray;
    private T[] currentStateArray;
    
    
    
    public Permutationer( final T[] array ){
        assert  2<=array.length : "Illegal Argument : At least 2 array elements are required for actual permutation";
        assert 12>=array.length : "Illegal Argument : 12 is max. number of array elements for permutation";
        
        originalArray = array;
        currentStateArray = null;
    }//constructor()
    
    
    
    public boolean hasNext(){
        return false;
    }//method()
    
    public T[] next() {
        return null;
    }//method()
    
    
    
    
    enum Direction {
        LEFT, RIGHT, OTHER_L, OTHER_R;
    }
    
    //research
    //based on https://de.wikipedia.org/wiki/Steinhaus-Johnson-Trotter-Algorithmus
    public void justDo(){
        
        Direction direction = Direction.RIGHT;
        int workingIndex = 0;
        
        int numberOfPermutationsStillToDo = facu( originalArray.length );
        System.out.printf( "> %d <\n", numberOfPermutationsStillToDo );
        currentStateArray = originalArray;
        
        // Zu einfach - funktioniert NICHT
        do {
            System.out.printf( "%s\n",  Arrays.toString( currentStateArray ));
            switch( direction ){
                case LEFT:
                    swapInCurrentStateArray( workingIndex, workingIndex-1 );
                    if( 1 < workingIndex ){
                        workingIndex--;
                    }else{
                        direction = Direction.OTHER_R;
                    }//if
                break;
                case OTHER_R:
                    swapInCurrentStateArray( originalArray.length-2, originalArray.length-1 );
                    direction = Direction.RIGHT;
                    workingIndex= 0;
                break;
                case RIGHT:
                    swapInCurrentStateArray( workingIndex, workingIndex+1 );
                    if( originalArray.length-2 > workingIndex ){
                        workingIndex++;
                    }else{
                        direction = Direction.OTHER_L;
                    }//if
                break;
                case OTHER_L:
                    swapInCurrentStateArray( 0, 1 );
                    direction = Direction.LEFT;
                    workingIndex = originalArray.length-1;
                break;
                default:
                    assert false : "Illegal State detcted - unexpected control flow";
                break;
            }//switch
            numberOfPermutationsStillToDo--;
        }while( 0 < numberOfPermutationsStillToDo );
    }//method()
    
    
    private void swapInCurrentStateArray( final int index1st,  final int index2nd ){
        T tmp = currentStateArray[ index1st ];
        currentStateArray[ index1st ] = currentStateArray[ index2nd ];
        currentStateArray[ index2nd ] = tmp;
    }//method()
    
    private int facu( final int number ){
        assert  1<=number : "Illegal Argument : At least one item is required for permutation";
        assert 12>=number : "Illegal Argument : 12 is max. number of permutationitems";
        
        int resu = 1;
        for( int i=number; i>=2; i-- ){
            resu *= i;
            System.out.printf( "> %d <\n", resu );
        }//for
        return resu;
    }//method()
    
}//class
