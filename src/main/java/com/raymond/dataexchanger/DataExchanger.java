package com.raymond.dataexchanger;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.raymond.dataexchanger.json.JSON;
import com.raymond.domain.Products;

public class DataExchanger {

	@Inject
	private List<Products> productList;

	public void export(File dataFile) {
		try {
			JSON.writeToJSON(productList, dataFile);
		} catch (JsonGenerationException e) {
			throw new IllegalStateException(e);
		} catch (JsonMappingException e) {
			throw new IllegalStateException(e);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
	
	public void importIntoDB(File dataFile) {
		// TODO implement this method.
	}



}
