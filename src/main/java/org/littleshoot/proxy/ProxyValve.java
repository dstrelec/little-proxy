package org.littleshoot.proxy;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

public interface ProxyValve {

	void filterRequest(String correlationId, UserPrincipal principal, HttpRequest httpRequest);
	
	void filterResponse(String correlationId, UserPrincipal principal, HttpResponse httpResponse);
	
}
