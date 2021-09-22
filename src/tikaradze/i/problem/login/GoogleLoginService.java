package tikaradze.i.problem.login;

// ამ მაგალიზე ჩანს რომ ვიყენებთ გუგლის ავტორიზაციას, შესაბამისად ტოკენის ხანგრძლივობა და ქუქიში დამახსოვრება არის გუგლის მხარეს.
public class GoogleLoginService implements LoginService {
    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }

    @Override
    public void updateRememberMeCookie() {
        throw new RuntimeException("by google");
    }

    @Override
    public void getUserDetails() {

    }

    @Override
    public void setSessionExpiration(int seconds) {
        throw new RuntimeException("by google");
    }

}
