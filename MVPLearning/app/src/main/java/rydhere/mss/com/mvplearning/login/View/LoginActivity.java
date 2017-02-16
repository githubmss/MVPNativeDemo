package rydhere.mss.com.mvplearning.login.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rydhere.mss.com.mvplearning.R;
import rydhere.mss.com.mvplearning.login.Presenter.LoginPresenter;
import rydhere.mss.com.mvplearning.login.Presenter.LoginPresenterImpl;

/**
 * Created by dinesh on 10/2/17.
 */

public class LoginActivity extends AppCompatActivity implements LoginView {

    LoginPresenter loginPresenter;
    @Bind(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        loginPresenter = new LoginPresenterImpl(this,this);
        loginPresenter.onCreate();

    }


    @OnClick(R.id.btn_login)
    @Override
    public void handleSignIn() {
      loginPresenter.registerNewUser("Dinesh","Admin123#");
    }

    @Override
    public void signInCallBack(String result) {
        Toast.makeText(LoginActivity.this, "Email " + result, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.onDestroy();
    }
}
