import javax.sound.sampled.Line;

public class Information implements Comparable<Information> {
    private String Username;
    private String Password;
    private String UserID;
    private String GroupID;
    private String UserInfos;
    private String HomeDirectory;
    private String Command;

    public Information(String username, String password, String userID, String groupID, String userInfos, String homeDirectory, String command) {
        Username = username;
        Password = password;
        UserID = userID;
        GroupID = groupID;
        UserInfos = userInfos;
        HomeDirectory = homeDirectory;
        Command = command;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getGroupID() {
        return GroupID;
    }

    public void setGroupID(String groupID) {
        GroupID = groupID;
    }

    public String getUserInfos() {
        return UserInfos;
    }

    public void setUserInfos(String userInfos) {
        UserInfos = userInfos;
    }

    public String getHomeDirectory() {
        return HomeDirectory;
    }

    public void setHomeDirectory(String homeDirectory) {
        HomeDirectory = homeDirectory;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String command) {
        Command = command;
    }

    @Override
    public int compareTo(Information T) {
        String compearage = ((Information)T).Username;
        return this.Username.compareTo(compearage);
    }

    @Override
    public String toString(){
        return "[ Username : " + Username +
                "Password : " + Password +
                "UserID : " + UserID +
                "GroupID : " + GroupID +
                "UserInfos : " + UserInfos +
                "HomeDirectory : " + HomeDirectory +
                "Command : " + Command + "]";
    }
}
