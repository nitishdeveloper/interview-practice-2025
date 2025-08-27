package DesignPatternPractice.Proxy;

public class ProxyServer implements Server {
    private ActualServer actualServer;
    private final String serverName;

    public ProxyServer(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void getActualServerDetail() {
        if (actualServer == null) {
            actualServer = new ActualServer(serverName);
        }
        actualServer.getActualServerDetail();
    }
}
