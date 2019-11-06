package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.UserModel;
import apap.tutorial.gopud.repository.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDB userDB;

    @Override
    public UserModel addUser(UserModel user){
        String pass = encrypt(user.getPassword());
        user.setPassword(pass);
        return userDB.save(user);
    }

    @Override
    public String encrypt(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        return hashedPassword;
    }

    @Override
    public UserModel getUser(String username) {
        return userDB.findByUsername(username);
    }

    @Override
    public boolean validatePassword(String oldpass, String input) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(input,oldpass);
    }

    @Override
    public void updatePassword(String username, String newpass) {
        UserModel user = userDB.findByUsername(username);
        String newpassword = encrypt(newpass);
        user.setPassword(newpassword);
        userDB.save(user);
    }
}
