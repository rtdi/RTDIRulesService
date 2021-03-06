package io.rtdi.bigdata.rulesservice;

import java.io.File;
import java.io.IOException;

import io.rtdi.bigdata.connector.pipeline.foundation.exceptions.PropertiesException;
import io.rtdi.bigdata.connector.properties.ServiceProperties;

public class RulesServiceProperties extends ServiceProperties {

	public RulesServiceProperties(String name) throws PropertiesException {
		super(name);
	}

	public RulesServiceProperties(File dir, String name) throws IOException {
		super(dir, name);
	}

	@Override
	protected RuleStep readMicroservice(File dir) throws PropertiesException {
		RuleStep m = new RuleStep(dir);
		return m;
	}

	@Override
	protected void writeMicroservice(File stepdir) throws IOException {
	}

}
