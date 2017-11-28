package org.littleshoot.proxy;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import javax.net.ssl.SSLSession;

/**
 * Adapter of {@link ActivityTracker} interface that provides default no-op
 * implementations of all methods.
 */
public class ActivityTrackerAdapter implements ActivityTracker {

    public boolean bytesReceivedFromClient(FlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    public void requestReceivedFromClient(FlowContext flowContext,
            HttpRequest httpRequest) {
    }

    public boolean bytesSentToServer(FullFlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    public void requestSentToServer(FullFlowContext flowContext,
            HttpRequest httpRequest) {
    }

    public boolean bytesReceivedFromServer(FullFlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    public void responseReceivedFromServer(FullFlowContext flowContext, HttpResponse httpResponse) {
    }

    public boolean bytesSentToClient(FlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    public void responseSentToClient(FlowContext flowContext, HttpResponse httpResponse) {
    }

    public void clientConnected(Channel channel) {
    }

    public void clientSSLHandshakeSucceeded(Channel channel, SSLSession sslSession) {
    }

    public void clientDisconnected(Channel channel, SSLSession sslSession) {
    }

	public void clientAuthorized(Channel channel, UserPrincipal principal) {
	}

	public void clientAuthorizationFailed(Channel channel) {
	}

}
