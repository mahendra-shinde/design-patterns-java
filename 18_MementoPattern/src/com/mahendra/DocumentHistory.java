package com.mahendra;

import java.util.Date;

public class DocumentHistory {
	private String contents;
	private Date dateModified;
	
	public String getContents() {
		return contents;
	}

	public DocumentHistory(String contents,Date dateModified) {
		super();
		this.contents = contents;
		this.dateModified = dateModified;
	}
	
	public void print(){
		System.out.println(String.format("%s - %s", dateModified,contents));
	}
}
