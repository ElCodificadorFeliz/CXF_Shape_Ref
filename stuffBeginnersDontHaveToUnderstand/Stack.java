// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffBeginnersDontHaveToUnderstand;


import java.util.List;


public interface Stack<T> {
    //
    //--VERSION:--------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                                #___~version~___YYYY_MM_DD__dd_
    final static long encodedInterfaceVersion = 2___00001_000___2022_05_17__01L;
    //------------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static Version stackInterfaceVersion = new Version( encodedInterfaceVersion );
    
    
    
    
    
    /**
     * ...
     * 
     * @param elem  pushes given element on top of stack
     */
    void push( final T elem );
    
    
    
    /**
     * ...
     * 
     * @return  pops top element from stack
     */
    T pop();
    
    
    
    /**
     * ...
     * 
     * @return  retrieves, but does not remove, top element from stack
     */
    T peek();
    
    
    
    /**
     * ...
     */
    void clear();
    
    
    
    /**
     * ...
     * 
     * @return  true if stack empty, false otherwise
     */
    boolean isEmpty();
    
    
    
    /**
     * ...
     * 
     * @return  stack size
     */
    int size();
    
    
    
    /*#*
     * ...
     * 
     * @param elem
     * @return
     *#/
    T[] toArray( final T elem );
    */
    
    
    /**
     * ...
     * 
     * @return  list of all stack elements
     */
    List<T> toList();
    
}//interface
