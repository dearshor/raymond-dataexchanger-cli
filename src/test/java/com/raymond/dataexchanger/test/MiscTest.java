package com.raymond.dataexchanger.test;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.raymond.dataexchanger.DataExchanger;

public class MiscTest {
	
	private DataExchanger dataExchanger;

	@Test
	public void testExport(File dataFile) {
		dataExchanger.export(dataFile);
		Assert.assertTrue(dataFile.exists(), "output dataFile exists");
	}

}
