package DesignPatternPractice.Proxy;

public class Main {
    public static void main(String[] args) {
        /*Server server1 = new ProxyServer("PROD");
        Server server2 = new ProxyServer("QA");
        server1.getActualServerDetail();
        server2.getActualServerDetail();
        server1.getActualServerDetail();*/

        Profile profile1 = new ProxyUserProfile("Admin User","Admin","admin@gamil.com");
        Profile profile2 = new ProxyUserProfile("Super Admin User","Super Admin","super.admin@gamil.com");
        profile1.getUserProfile();
        profile2.getUserProfile();
    }
}
