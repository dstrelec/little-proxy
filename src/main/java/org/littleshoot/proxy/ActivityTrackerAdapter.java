package org.littleshoot.proxy;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.net.InetSocketAddress;

import javax.net.ssl.SSLSession;

/**
 * Adapter of {@link ActivityTracker} interface that provides default no-op
 * implementations of all methods.
 */
public class ActivityTrackerAdapter implements ActivityTracker {

    @Override
    public boolean bytesReceivedFromClient(FlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    @Override
    public void requestReceivedFromClient(FlowContext flowContext,
            HttpRequest httpRequest) {
    }

    @Override
    public boolean bytesSentToServer(FullFlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    @Override
    public void requestSentToServer(FullFlowContext flowContext,
            HttpRequest httpRequest) {
    }

    @Override
    public boolean bytesReceivedFromServer(FullFlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    @Override
    public void responseReceivedFromServer(FullFlowContext flowContext, HttpResponse httpResponse) {
    }

    @Override
    public boolean bytesSentToClient(FlowContext flowContext, int numberOfBytes) {
    	return false;
    }

    @Override
    public void responseSentToClient(FlowContext flowContext, HttpResponse httpResponse) {
    }

    @Override
    public void clientConnected(InetSocketAddress clientAddress) {
    }

    @Override
    public void clientSSLHandshakeSucceeded(InetSocketAddress clientAddress,
            SSLSession sslSession) {
    }

    @Override
    public void clientDisconnected(InetSocketAddress clientAddress, SSLSession sslSession) {
    }

	@Override
	public void clientAuthorized(InetSocketAddress clientAddress, UserPrincipal principal) {
	}

	@Override
	public void clientAuthorizationFailed(InetSocketAddress clientAddress) {
	}

}
