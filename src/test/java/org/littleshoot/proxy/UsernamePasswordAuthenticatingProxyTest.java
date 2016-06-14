package org.littleshoot.proxy;

import io.netty.handler.codec.http.HttpRequest;

/**
 * Tests a single proxy that requires username/password authentication.
 */
public class UsernamePasswordAuthenticatingProxyTest extends BaseProxyTest
        implements ProxyAuthenticator {
    @Override
    protected void setUp() {
        this.proxyServer = bootstrapProxy()
                .withPort(0)
                .withProxyAuthenticator(this)
                .start();
    }

    @Override
    protected String getUsername() {
        return "user1";
    }

    @Override
    protected String getPassword() {
        return "user2";
    }

    @Override
    public boolean authenticate(UserPrincipal principal, HttpRequest request) {
        return getUsername().equals(principal.getName()) && getPassword().equals(principal.getPassword());
    }

    @Override
    protected boolean isAuthenticating() {
        return true;
    }

    @Override
    public String getRealm() {
        return null;
    }
}
