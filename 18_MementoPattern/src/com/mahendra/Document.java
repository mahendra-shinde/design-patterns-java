/**
 * 
 */
package com.mahendra;

import java.util.Date;

/**
 * @author mahendra
 *
 */
public class Document {
	private String contents;

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public DocumentHistory saveState(){
		return new DocumentHistory(contents,new Date());
	}
	
	public Document(String contents) {
		super();
		this.contents = contents;
	}
	
}
