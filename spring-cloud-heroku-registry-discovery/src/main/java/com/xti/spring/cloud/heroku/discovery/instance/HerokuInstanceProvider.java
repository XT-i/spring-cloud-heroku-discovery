package com.xti.spring.cloud.heroku.discovery.instance;

import com.xti.spring.cloud.heroku.discovery.metadata.LocallyMutableMetadataProvider;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface HerokuInstanceProvider {
    List<ServiceInstance> getServiceInstances(String service);
    ServiceInstance getLocalServiceInstance(LocallyMutableMetadataProvider locallyMutableMetadataProvider);
}
