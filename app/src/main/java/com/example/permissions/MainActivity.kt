package com.example.permissions

import android.media.MediaPlayer.OnPreparedListener
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.permissions.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hitOnlineVideo()

    }

    private fun hitOnlineVideo() {
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.video)

        binding.video.setVideoPath("https://res.cloudinary.com/dmhpacb7m/video/upload/v1664378815/ssstik.io_1664372753030_mtin5e.mp4")
        binding.video.start()
        binding.video.setMediaController(mediaController)
        binding.video.setOnPreparedListener(OnPreparedListener { mp -> mp.isLooping = true })
    }
}