// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package test.support;


/**
 * A Permutationer supports step by step permutation of a given array.
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/17 (#1)
 *
 * @param <T>  ...
 */
public interface Permutationer<T> {
    
    /**
     * ...
     * 
     * @return
     */
    boolean hasNext();
    
    /**
     * ...
     * 
     * @return
     */
    T[] next();
    
}//interface
