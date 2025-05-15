package test;

public abstract class User {

    private String userid;
    private String name;
    private String email;
    private String phone;
    private String password;
    private boolean isVerified;
    /**
     * Authenticates the user.
     *
     * @param email    user's email
     * @param password user's password
     * @return true if authentication is successful
     */
    public boolean login(String email, String password) {
        throw new UnsupportedOperationException("Login not implemented yet");
    }

    /**
     * Logs out the user.
     */
    public void logout() {
        throw new UnsupportedOperationException("Logout not implemented yet");
    }

    /**
     * Updates user profile data.
     *
     * @param name     new name
     * @param email    new email
     * @param phone    new phone
     * @param password new password
     */
    public void updateProfile(String name, String email, String phone, String password) {
        throw new UnsupportedOperationException("Update profile not implemented yet");
    }
}
