package com.mindtree.aem.guides.wknd.core.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, adapters = AuthorBooks.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorBooksImpl {
	private static  final org.slf4j.Logger LOG=org.slf4j.LoggerFactory.getLogger(AuthorBooksImpl.class);
	@Inject
	Resource componentResource;
	@ValueMapValue
	@Default(values = "saiphani")
	private String authorname;
	@ValueMapValue
	private List<String> books;
	
	
	public List<String> getAuthorBooks() {
		
		if(books!=null)
		{
			return new ArrayList<String>(books);
		}
		else
		{
			return Collections.emptyList();
		}
	}



	public String getAuthorName() {
		// TODO Auto-generated method stub
		return authorname;
	}

	}


