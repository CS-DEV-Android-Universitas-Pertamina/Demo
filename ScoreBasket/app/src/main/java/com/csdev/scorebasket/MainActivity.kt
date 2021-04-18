package com.csdev.scorebasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var tvScoreA:TextView
    lateinit var tvScoreB:TextView
    lateinit var tvTimeCount:TextView
    lateinit var btnPoint3A:Button
    lateinit var btnPoint2A:Button
    lateinit var btnPoint3B:Button
    lateinit var btnPoint2B:Button
    lateinit var btnPointFreeA:Button
    lateinit var btnPointFreeB:Button
    lateinit var btnReset:Button
    lateinit var btnStart:Button
    lateinit var btnPause:Button
    var saveCount:Long = 0

    var scoreA = 0
    var scoreB = 0
    var start = true
    var pause = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvScoreA = findViewById(R.id.score_a)
        tvScoreB = findViewById(R.id.score_b)
        tvTimeCount = findViewById(R.id.tv_time_count)
        btnPoint3A = findViewById(R.id.btn_point_3_a)
        btnPoint2A = findViewById(R.id.btn_point_2_a)
        btnPoint3B = findViewById(R.id.btn_point_3_b)
        btnPoint2B = findViewById(R.id.btn_point_2_b)
        btnPointFreeA = findViewById(R.id.btn_free_a)
        btnPointFreeB = findViewById(R.id.btn_free_b)
        btnReset = findViewById(R.id.reset)
        btnStart = findViewById(R.id.btn_start)
        btnPause  = findViewById(R.id.btn_pause)
        btnPause.setOnClickListener {
            if(!pause) {
                pause = true
                btnPause.text = "Resume"
            }else{
                pause = false
                btnPause.text = "Pause"
                countDown(saveCount)
            }
        }

        btnPoint2A.setOnClickListener {
            if(!start) {
                scoreA += 2
                tvScoreA.text = scoreA.toString()
            }
        }

        btnPoint3A.setOnClickListener {
            if(!start) {
                scoreA += 3
                tvScoreA.text = scoreA.toString()
            }
        }

        btnPoint2B.setOnClickListener {
            if(!start) {
                scoreB += 2
                tvScoreB.text = scoreB.toString()
            }
        }

        btnPoint3B.setOnClickListener {
            if(!start) {
                scoreB+=3
                tvScoreB.text = scoreB.toString()
            }
        }

        btnPointFreeA.setOnClickListener {
            if(!start) {
                scoreA += 1
                tvScoreA.text = scoreA.toString()
            }
        }

        btnPointFreeB.setOnClickListener {
            if(!start) {
                scoreB += 1
                tvScoreB.text = scoreB.toString()
            }
        }

        btnStart.setOnClickListener {
            if (start){
                btnStart.text = "Stop"
                start = false
                countDown(TimeUnit.MINUTES.toSeconds(15))
                btnPause.visibility = View.VISIBLE
            }else{
                btnStart.text = "Start"
                start = true
                btnPause.visibility = View.INVISIBLE
            }
        }
        btnReset.setOnClickListener {
            scoreB=0
            scoreA=0
            tvScoreB.text = scoreB.toString()
            tvScoreA.text = scoreA.toString()
            tvTimeCount?.text = "00:00"
            start = true
        }
    }
    fun countDown(totalSeconds:Long){
        GlobalScope.launch(Dispatchers.Main) {
            val totalSeconds = totalSeconds
            val tickSeconds = 1
            for (second in totalSeconds downTo tickSeconds) {
                val time = String.format("%02d:%02d",
                    TimeUnit.SECONDS.toMinutes(second),
                    second - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(second))
                )
                tvTimeCount?.text = time
                if(start){
                    break
                }
                if(pause){
                    saveCount = second
                    break
                }
                delay(1000)
            }
            if(start) {
                tvTimeCount?.text = "00:00"
            }else if(pause){
                tvTimeCount?.text = "Pause"
            }else{
                tvTimeCount?.text = "Time out!"
            }
        }
    }
}