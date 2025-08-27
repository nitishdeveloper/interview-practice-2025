package DesignPatternPractice.Proxy;

public class UserProfile implements Profile {
    private final String userName;
    private final String role;
    private final String emailId;

    public UserProfile(String userName, String role, String emailId) {
        this.userName = userName;
        this.role = role;
        this.emailId = emailId;
    }

    @Override
    public void getUserProfile() {
        System.out.println("UserName: " + userName);
        System.out.println("role: " + role);
        System.out.println("emailId: " + emailId);
    }
}
