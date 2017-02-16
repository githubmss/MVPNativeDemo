package rydhere.mss.com.mvplearning.login.Presenter;

/**
 * Created by dinesh on 10/2/17.
 */

public interface LoginPresenter {

    void onCreate();
    void onDestroy();
    void registerNewUser(String email,String password);
    void signInPresenterCallback(String result);

}
