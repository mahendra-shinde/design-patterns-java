/**
 * 
 */
package com.mahendra;

/**
 * @author mahendra
 *
 */
public class IndianStates implements IterableObject {

	private String[] states = {"Maharashtra","Delhi","Rajastan","Gujrat","Hariyana","Himachal Pradesh","Uttar Pradesh","Arunachal Pradesh","Odisha","Bengal","Manipur","Assam","Andhra Pradesh","Karnataka","Tamil Nadu","Madhya Pradesh","Kerala","Goa"};	
	/* (non-Javadoc)
	 * @see com.mahendra.IterableObject#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			int index =0;
			@Override
			public Object next() {
				while(index<states.length)
					return states[index++];
				return null;
			}
			
			@Override
			public boolean hasNext() {
				while(index<states.length)
					return true;
				return false;
			}
		};
	}

}
