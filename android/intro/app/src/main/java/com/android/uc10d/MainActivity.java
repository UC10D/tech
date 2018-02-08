package com.android.uc10d;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder m_alertDialog;
    private String s = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_alertDialog = new AlertDialog.Builder(this);

        // 登录
        findViewById(R.id.loginBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertText("事件" , "登陆");
            }
        });

        // 支付
        findViewById(R.id.payBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertText("事件" , "支付");
            }
        });

        // 分析
        findViewById(R.id.analyzeBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertText("事件" , "统计");
            }
        });

        // 崩溃
        findViewById(R.id.errorBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.equals("");
            }
        });
    }

    // 弹窗提示文字
    private void alertText(final String title, final String message) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                m_alertDialog.setTitle(title)
                        .setMessage(message)
                        .setPositiveButton(R.string.sure, null)
                        .show();
            }
        });
    }

    // 提示框
    private void toastText(final String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
