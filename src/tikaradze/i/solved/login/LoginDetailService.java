package tikaradze.i.solved.login;

public interface LoginDetailService {
    void updateRememberMeCookie();

    void setSessionExpiration(int seconds);
}
