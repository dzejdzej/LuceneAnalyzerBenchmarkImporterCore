package benchmark.importer.core.contract;

import java.util.zip.ZipInputStream;

import benchmark.importer.core.model.ImportedBenchmarkModel;

public interface BenchmarkImporter {
	
	boolean canImport(ZipInputStream zipWithAssetsForImport);
	boolean isValid();
	ImportedBenchmarkModel importBenchmark(String documentDirPath, ZipInputStream zipWithAssetsForImport);
}
