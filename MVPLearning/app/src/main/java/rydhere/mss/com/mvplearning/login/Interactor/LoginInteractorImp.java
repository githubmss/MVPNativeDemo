package rydhere.mss.com.mvplearning.login.Interactor;

import android.content.Context;

import rydhere.mss.com.mvplearning.login.Presenter.LoginPresenter;

/**
 * Created by dinesh on 10/2/17.
 */

public class LoginInteractorImp implements LoginInteractor {

    private final Context mContext;
    LoginPresenter mLoginPresenter;

    public LoginInteractorImp(Context context, LoginPresenter loginPresenter) {
        mContext = context;
        mLoginPresenter=loginPresenter;

    }

    @Override
    public void signIn(String email, String Password) {
        mLoginPresenter.signInPresenterCallback(email);

    }
}
