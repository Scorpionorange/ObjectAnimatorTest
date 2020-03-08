package com.example.objectanimatortest

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var compassImage: ImageView = findViewById(R.id.comapassImage)
    var currentDirection: Float = 0.0f
    var mTargetDirection: Float = 3600.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var animator: ObjectAnimator = ObjectAnimator.ofFloat(
                compassImage, "rotation", currentDirection, mTargetDirection)
        animator.setDuration(5000)
        animator.start()
    }
}
