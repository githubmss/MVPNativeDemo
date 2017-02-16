package rydhere.mss.com.mvplearning.login.Presenter;

import android.content.Context;

import rydhere.mss.com.mvplearning.login.Interactor.LoginInteractor;
import rydhere.mss.com.mvplearning.login.Interactor.LoginInteractorImp;
import rydhere.mss.com.mvplearning.login.View.LoginView;

/**
 * Created by dinesh on 10/2/17.
 */

public class LoginPresenterImpl implements LoginPresenter {

    LoginView mLoginView;
    Context mContext;

    LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView,Context context){
        mContext=context;
        mLoginView=loginView;
        loginInteractor=new LoginInteractorImp(context,this);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void registerNewUser(String email, String password) {
        loginInteractor.signIn(email,password);
    }

    @Override
    public void signInPresenterCallback(String result) {
        mLoginView.signInCallBack(result);
    }
}
