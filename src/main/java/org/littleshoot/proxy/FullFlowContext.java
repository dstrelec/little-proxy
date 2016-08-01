package org.littleshoot.proxy;

import org.littleshoot.proxy.impl.ClientToProxyConnection;
import org.littleshoot.proxy.impl.ProxyToServerConnection;

/**
 * Extension of {@link FlowContext} that provides additional information (which
 * we know after actually processing the request from the client).
 */
public class FullFlowContext extends FlowContext {
	
    private final ChainedProxy chainedProxy;

    public FullFlowContext(ClientToProxyConnection clientConnection,
            ProxyToServerConnection serverConnection) {
        super(clientConnection);
        this.chainedProxy = serverConnection.getChainedProxy();
    }

    /**
     * The chained proxy (if proxy chaining).
     * 
     * @return
     */
    public ChainedProxy getChainedProxy() {
        return chainedProxy;
    }

}
