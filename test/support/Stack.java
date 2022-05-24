package test.support;


import java.util.List;


/**
 * ...
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version {@value #interfaceEncodedVersion}
 *
 * @param <T> ...
 */
public interface Stack<T> {
    //
    //--VERSION:--------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                                #___~version~___YYYY_MM_DD__dd_
    final static long interfaceEncodedVersion = 2___00001_000___2022_05_17__01L;
    //------------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static Version interfaceVersion = new Version( interfaceEncodedVersion );
    
    
    
    
    
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
