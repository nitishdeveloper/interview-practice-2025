package DesignPatternPractice.Proxy;

public class ProxyUserProfile implements Profile{
    private UserProfile userProfile;
    private final String userName;
    private final String role;
    private final String emailId;

    public ProxyUserProfile(String userName, String role, String emailId) {
        this.userName = userName;
        this.role = role;
        this.emailId = emailId;
    }

    @Override
    public void getUserProfile() {
        if("Admin".equals(this.role)){
            if(userProfile == null){
                System.out.println("user profile initialize");
                userProfile = new UserProfile(this.userName,this.role,this.emailId);
            }
            userProfile.getUserProfile();
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
