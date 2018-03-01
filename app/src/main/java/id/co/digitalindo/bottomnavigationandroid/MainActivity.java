package id.co.digitalindo.bottomnavigationandroid;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //ini untuk mengubah dari fragment satu k fragment lainnya
                    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();

                    //panggil fragment tujuannya
                    FirstFragment first = new FirstFragment();
                    transaction.replace(R.id.container2,first).commit();

                    return true;
                case R.id.navigation_dashboard:
                    android.support.v4.app.FragmentManager manager1 = getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction transaction1 = manager1.beginTransaction();

                    //panggil fragment tujuannya
                    SecondFragment first1 = new SecondFragment();
                    transaction1.replace(R.id.container2,first1).commit();

                    return true;
                case R.id.navigation_notifications:
                    android.support.v4.app.FragmentManager manager2 = getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction transaction2 = manager2.beginTransaction();

                    //panggil fragment tujuannya
                    ThirdFragment first2 = new ThirdFragment();
                    transaction2.replace(R.id.container2,first2).commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();

        //panggil fragment tujuannya
        FirstFragment first = new FirstFragment();
        transaction.replace(R.id.container2,first).commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
