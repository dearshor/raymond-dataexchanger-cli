package com.raymond.dataexchanger.json;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializationConfig.Feature;

import com.raymond.domain.Products;

public class JSON {

	public static void writeToJSON(List<Products> productList, File dataFile)
			throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		SerializationConfig serializationConfig = objectMapper
				.getSerializationConfig()
				.withDateFormat(new SimpleDateFormat("yyyy-MM-dd"))
				.with(Feature.INDENT_OUTPUT);
		objectMapper.setSerializationConfig(serializationConfig);
		objectMapper.writeValue(dataFile, productList);
	}

}
