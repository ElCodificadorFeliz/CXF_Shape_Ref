// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package test.support;


/**
 * 
 * @author ...
 *
 * @param <T>
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
