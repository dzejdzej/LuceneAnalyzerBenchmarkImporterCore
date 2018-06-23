package benchmark.importer.core.model;

import java.util.ArrayList;
import java.util.List;

public class ImportedQuery {
	
	private String searchType;
	private String text;
	
	private List<String> relevantDocumentsPath = new ArrayList<String>();
	private List<ImportedRelevantDocument> relevantDocumentsMeta = new ArrayList<ImportedRelevantDocument>();
	
	private long numOfRelevant;
	
	private long allBenchmarkDocuments;
	
	
	
}
