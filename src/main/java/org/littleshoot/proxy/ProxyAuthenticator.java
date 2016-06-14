package org.littleshoot.proxy;

import io.netty.handler.codec.http.HttpRequest;

/**
 * Interface for objects that can authenticate someone for using our Proxy on
 * the basis of a username and password.
 */
public interface ProxyAuthenticator {
    /**
     * Authenticates the user using the specified name and password from <code>UserPrincipal</code>.
     * 
     * @param principal
     *            The user principal.
     * @param httpRequest
     *            The original HTTP request.
     * @return <code>true</code> if the credentials are acceptable, otherwise
     *         <code>false</code>.
     */
    boolean authenticate(UserPrincipal principal, HttpRequest httpRequest);
    
    /**
     * The realm value to be used in the request for proxy authentication 
     * ("Proxy-Authenticate" header). Returning null will cause the string
     * "Restricted Files" to be used by default.
     * 
     * @return
     */
    String getRealm();
}
