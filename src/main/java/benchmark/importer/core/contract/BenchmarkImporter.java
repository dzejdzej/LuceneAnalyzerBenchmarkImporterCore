package benchmark.importer.core.contract;

import java.io.InputStream;

import benchmark.importer.core.model.ImportedBenchmarkModel;

public interface BenchmarkImporter {
	
	boolean canImport(InputStream zipWithAssetsForImport);
	ImportedBenchmarkModel importBenchmark(String documentDirPath, InputStream zipWithAssetsForImport);
}
