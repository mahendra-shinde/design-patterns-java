/**
 * 
 */
package com.mahendra;

import java.util.*;

/**
 * @author mahendra
 *
 */
public class DocumentEditor {
	private Document document;
	private Stack<DocumentHistory> undoHistory = new Stack();
	
	/**
	 * Creating new instance of Document with this document editor
	 * @param Original contents 
	 */
	public DocumentEditor(String contents) {
		super();
		document = new Document(contents);
	}
	
	public void replaceContent(String newContent){
		undoHistory.push( document.saveState());
		document.setContents(newContent);
	}
	
	public void printHistory(){
		System.out.println("Document History: ");
		
		for(DocumentHistory history: undoHistory){
			history.print();
		}
	}
	
	public void printContents(){
		System.out.println("Now the content of Document is: ");
		System.out.println(document.getContents());
	}
	
	public void undo(){
		System.out.println("Revert to last changes");
		document.setContents(undoHistory.pop().getContents());
	}
}
