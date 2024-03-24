package jp.techacademy.nasahiro.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import jp.techacademy.nasahiro.ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener { // 変更

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.text = "ボタン"
        binding.button1.setOnClickListener(this)  // 追加
    }

    // 以下の関数を追加
    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタンをタップしました")
    }
}