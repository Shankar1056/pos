package apextechies.pos.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import apextechies.pos.R
import kotlinx.android.synthetic.main.activity_productdetails.*
import org.json.JSONException
import org.json.XML
import org.json.JSONObject



class ProductDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetails)
//        productDetailsTV.text = getIntent().getStringExtra("data")

        var jsonObj: JSONObject? = null
        try {
            jsonObj = XML.toJSONObject(getIntent().getStringExtra("data"))
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        if (jsonObj.toString().equals("{}"))
        productDetailsTV.text = getIntent().getStringExtra("data")
        else
        productDetailsTV.text = jsonObj.toString()
        Log.e("Json", jsonObj.toString())


    }
}