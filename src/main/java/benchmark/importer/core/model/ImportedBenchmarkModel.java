package benchmark.importer.core.model;

import java.util.ArrayList;
import java.util.List;

public class ImportedBenchmarkModel {
	
	private List<String> allDocumentsPath = new ArrayList<String>();
	

	private List<ImportedQuery> queryAndRelevantDocumentsList = new ArrayList<ImportedQuery>();
	

	public List<String> getAllDocumentsPath() {
		return allDocumentsPath;
	}

	public void setAllDocumentsPath(List<String> allDocumentsPath) {
		this.allDocumentsPath = allDocumentsPath;
	}

	public List<ImportedQuery> getQueryAndRelevantDocumentsList() {
		return queryAndRelevantDocumentsList;
	}

	public void setQueryAndRelevantDocumentsList(List<ImportedQuery> queryAndRelevantDocumentsList) {
		this.queryAndRelevantDocumentsList = queryAndRelevantDocumentsList;
	}
	

}
