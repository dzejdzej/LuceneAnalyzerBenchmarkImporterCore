package benchmark.importer.core.model;

import java.util.ArrayList;
import java.util.List;

public class ImportedQuery {
	
	private String searchType;
	private String text;
	private Long tempId;
	
	private List<String> relevantDocumentsPath = new ArrayList<String>();
	private List<ImportedRelevantDocument> relevantDocumentsMeta = new ArrayList<ImportedRelevantDocument>();
	

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getRelevantDocumentsPath() {
		return relevantDocumentsPath;
	}

	public void setRelevantDocumentsPath(List<String> relevantDocumentsPath) {
		this.relevantDocumentsPath = relevantDocumentsPath;
	}

	public List<ImportedRelevantDocument> getRelevantDocumentsMeta() {
		return relevantDocumentsMeta;
	}

	public void setRelevantDocumentsMeta(List<ImportedRelevantDocument> relevantDocumentsMeta) {
		this.relevantDocumentsMeta = relevantDocumentsMeta;
	}

	public Long getTempId() {
		return tempId;
	}

	public void setTempId(Long tempId) {
		this.tempId = tempId;
	}
	
	

	
	
	
	
	
	
}
