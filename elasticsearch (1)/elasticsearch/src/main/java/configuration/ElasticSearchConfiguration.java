package configuration;

import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages = "com.baeldung.spring.data.es.repository")
public class ElasticSearchConfiguration {
	
	 @Bean
	    public NodeBuilder nodeBuilder() {
	        return new NodeBuilder();
	    }

}
