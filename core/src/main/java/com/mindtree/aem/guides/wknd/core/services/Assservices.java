package com.mindtree.aem.guides.wknd.core.services;

import java.util.Map;

public interface Assservices
{
	public interface ProjectServices {
		Map<String, Object> getPageInfo();
		String getPath();
		}
}
