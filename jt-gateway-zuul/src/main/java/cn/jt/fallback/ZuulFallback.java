package cn.jt.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
//实现断路器
@Component//实现熔断机制
public class ZuulFallback implements ZuulFallbackProvider{

	@Override
	public String getRoute() {
		 
		return "provider-user";
	}

	@Override
	public ClientHttpResponse fallbackResponse() {
		 
		return new ClientHttpResponse() {
			
			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
				return headers;
			}
			
			@Override
			public InputStream getBody() throws IOException {
				return new ByteArrayInputStream(("fallback "+ZuulFallback.this.getRoute()).getBytes());
			}
			
			@Override
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
