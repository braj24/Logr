package brajbhushan.com.loginreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button= (Button) findViewById(R.id.login);
        Button register_button= (Button) findViewById(R.id.register);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login login=new Login(MainActivity.this,"braj","1234","https://www.colourssoftware.com/wordpress/wp-json/wc/v1/orders");
                login.runLogin();
            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register register=new Register(MainActivity.this,"braj","1234","bk@gmail.com","https://www.colourssoftware.com/wordpress/wp-json/wc/v1/orders");
                register.runRegister();
            }
        });

    }
}
