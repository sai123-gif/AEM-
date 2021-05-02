package com.mindtree.aem.guides.wknd.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = Author.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Authorimpl implements Author {
@Inject
@Default(values = "saiphani")
String name;

@Override
public String getName() {
return name;

}

}

