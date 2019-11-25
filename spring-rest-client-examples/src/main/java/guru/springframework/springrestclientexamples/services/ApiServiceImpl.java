package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.Resource;
import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 9/21/17.
 */
@Service
public class ApiServiceImpl implements  ApiService {

    private RestTemplate restTemplate;
    private final String api_url;
    private final String resources_url;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url , @Value("${resources.url}") String resources_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
        this.resources_url = resources_url;
    }

    @Override
    public List<User> getUsers(Integer limit) {

    	UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_url).queryParam("limit", limit);
    	
        UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
        return userData.getData();
    }

	@Override
	public List<Resource> getResources() {
		
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(resources_url);
    	
        @SuppressWarnings("unchecked")
		List<Resource> resource = restTemplate.getForObject(uriBuilder.toUriString(), ArrayList.class);
        return resource;
	}
}
