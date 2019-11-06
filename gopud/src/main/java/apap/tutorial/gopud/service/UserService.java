package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.UserModel;

public interface UserService {
    UserModel addUser(UserModel user);
    public String encrypt(String password);
    UserModel getUser(String user);
    boolean validatePassword(String oldpass, String input);
    void updatePassword(String username, String newpass);
}
