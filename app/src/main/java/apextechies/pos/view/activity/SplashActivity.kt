package apextechies.pos.view.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import apextechies.pos.R
import kotlinx.android.synthetic.main.splash.*

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        submit.setOnClickListener {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }

    }
}