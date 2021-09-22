package tikaradze.i.problem.login;

// ჩვენ ამ შემთხვევაში გვაქვს fat ინტერფეისი.
// ბევრი სპეციფიური მეთოდიდ, რაც გვაძლევს იმის ფიქრის საშუალებას რო ეს ინტერფეისები დავყოთ პატარა ინტერფეისებად.
public interface LoginService {
    void signIn();
    void signOut();
    void updateRememberMeCookie();
    void setSessionExpiration(int seconds);
    void getUserDetails();
    // ...
}
