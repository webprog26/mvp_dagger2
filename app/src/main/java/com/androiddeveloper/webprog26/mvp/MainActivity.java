package com.androiddeveloper.webprog26.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.androiddeveloper.webprog26.mvp.app.MvpApplication;
import com.androiddeveloper.webprog26.mvp.impls.NamePresenterImpl;
import com.androiddeveloper.webprog26.mvp.interfaces.controllers.NameView;
import com.androiddeveloper.webprog26.mvp.interfaces.presenters.NamePresenter;
import com.androiddeveloper.webprog26.mvp.listeners.ButtonClickListener;
import com.androiddeveloper.webprog26.mvp.models.Girl;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NameView{

    @BindView(R.id.tv_text)
    TextView mTvText;

    @BindView(R.id.btn_get_name)
    Button mBtnGetName;

    @Inject
    NamePresenter mNamePresenter;
//    private NamePresenter mNamePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MvpApplication) getApplication()).getAppComponent().inject(this);

        ButterKnife.bind(this);

        mNamePresenter.setNameView(this);

        ButtonClickListener buttonClickListener = new ButtonClickListener(mNamePresenter);
        getBtnGetName().setOnClickListener(buttonClickListener);

    }

    @Override
    public void showName(final Girl girl) {
        getTvText().setText(girl.getName());
    }

    @Override
    public void showErrorMessage() {
//
    }

    private NamePresenter getNamePresenter() {
        return mNamePresenter;
    }

    private TextView getTvText() {
        return mTvText;
    }

    private Button getBtnGetName() {
        return mBtnGetName;
    }

}
