/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Lee Yee Von
 */
public interface QueueInterface {
    public void add(Object object);
    public Object first();
    public Object remove();
    public int size();
    public boolean isEmpty();
}
