package com.mindtree.aem.guides.wknd.core.models;

import java.util.Map;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;


@Model(adaptables = SlingHttpServletRequest.class,adapters=Asss.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Asssimpl implements Asss {
	
	@OSGiService
	Asss service;
	@Override
	public Map<String, Object> getPageInfo() {

	return service.getPageInfo();
	}
	@Override
	public String getPath() {
	// TODO Auto-generated method stub
	return service.getPath();
	}

	
	}


