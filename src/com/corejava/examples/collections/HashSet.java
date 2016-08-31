package com.corejava.examples.collections;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet<E>
extends AbstractSet<E>
implements Set<E>, Cloneable, java.io.Serializable

{
    private transient HashMap<E,Object> map;
    
    // Dummy value to associate with an Object in the backing Map
    
    private static final Object PRESENT = new Object();
    
    
    
    public HashSet() {
        map = new HashMap<>();
    }
    
    // SOME CODE ,i.e Other methods in Hash Set
    
    
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
    // SOME CODE ,i.e Other methods in Hash Set
}