package DesignPatternPractice.Proxy;

public class ActualServer implements Server {
    private final String IP;
    private final String serverName;

    public ActualServer(String serverName) {
        this.IP = "101.11.22.11";
        this.serverName = serverName;
    }

    @Override
    public void getActualServerDetail() {
        System.out.println("IP: " + IP + " NAME: " + serverName);
    }
    
}
