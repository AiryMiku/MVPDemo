package com.airy.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airy.mvpdemo.model.UserBean;
import com.airy.mvpdemo.presenter.UserPresenter;
import com.airy.mvpdemo.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView{

    EditText edt_id, edt_name;
    Button btn_load, btn_save;
    TextView tv_show;

    UserPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new UserPresenter(this);
        initView();
        initEvent();

    }

    private void initEvent() {
        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadUser();
            }
        });
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.saveUser();
                Toast.makeText(MainActivity.this, "保存完成", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        edt_id = (EditText) findViewById(R.id.edit_text_id);
        edt_name = (EditText) findViewById(R.id.edit_text_name);
        btn_load = (Button) findViewById(R.id.button_load);
        btn_save = (Button) findViewById(R.id.button_save);
        tv_show = (TextView) findViewById(R.id.text_show);
    }


    @Override
    public UserBean getUser() {
        int id = Integer.valueOf(edt_id.getText().toString().trim());
        String name = edt_name.getText().toString().trim();

        if (name != null){
            UserBean bean = new UserBean();
            bean.setId(id);
            bean.setName(name);
            return bean;
        }
        return null;
    }

    @Override
    public void setUser(UserBean bean) {
        if (bean != null){
            tv_show.setText(bean.getId()+"\n"+bean.getName());
        }
    }
}
