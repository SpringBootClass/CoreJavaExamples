package com.corejava.examples.singleton.enums;

import java.io.ObjectStreamException;

public class SerializableSingleton {

	public static SerializableSingleton getInstance() {
	     return fINSTANCE;
	  }

	  // PRIVATE

	  /**
	  * Single instance created upon class loading.
	  */
	  private static final SerializableSingleton fINSTANCE =  new SerializableSingleton();

	  /**
	  * Private constructor prevents construction outside this class.
	  */
	  private SerializableSingleton() {
	    
	  }

	  /**
	  * If the singleton implements Serializable, then this
	  * method must be supplied.
	  */
	  private Object readResolve() throws ObjectStreamException {
	    return fINSTANCE;
	  }
}
