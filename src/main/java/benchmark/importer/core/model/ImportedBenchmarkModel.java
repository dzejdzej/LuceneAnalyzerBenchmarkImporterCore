package benchmark.importer.core.model;

import java.util.ArrayList;
import java.util.List;

public class ImportedBenchmarkModel {
	
	private List<String> relevantDocuments = new ArrayList<String>();
	
	private String indexDir;
	
	private List<ImportedQuery> queryAndRelevantDocumentsList = new ArrayList<ImportedQuery>();
	
	private long num_of_SearchQueries;
	
	public List<String> getRelevantDocuments() {
		return relevantDocuments;
	}

	public void setRelevantDocuments(List<String> relevantDocuments) {
		this.relevantDocuments = relevantDocuments;
	}

	public String getIndexDir() {
		return indexDir;
	}

	public void setIndexDir(String indexDir) {
		this.indexDir = indexDir;
	}

	public long getNum_of_SearchQueries() {
		return num_of_SearchQueries;
	}

	public void setNum_of_SearchQueries(long num_of_SearchQueries) {
		this.num_of_SearchQueries = num_of_SearchQueries;
	}

	public List<ImportedQuery> getQueryAndRelevantDocumentsList() {
		return queryAndRelevantDocumentsList;
	}

	public void setQueryAndRelevantDocumentsList(List<ImportedQuery> queryAndRelevantDocumentsList) {
		this.queryAndRelevantDocumentsList = queryAndRelevantDocumentsList;
	}
	

}
