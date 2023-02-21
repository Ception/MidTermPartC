import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {
    public static void main(String[] args) {
        UserProfile up = new UserProfile("Aleks", "Comedy");

        System.out.printf("%s's favourite Movie Gendre is: %s\n\n", up.getUserID(), up.getGenre());
    }
}
