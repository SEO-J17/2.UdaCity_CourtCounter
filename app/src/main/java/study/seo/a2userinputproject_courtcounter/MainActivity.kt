package study.seo.a2userinputproject_courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var teamAScore = 0
    private var teamBScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.point1_Button).setOnClickListener(this)
        findViewById<Button>(R.id.point2_Button).setOnClickListener(this)
        findViewById<Button>(R.id.point3_Button).setOnClickListener(this)
        findViewById<Button>(R.id.b_point1_Button).setOnClickListener(this)
        findViewById<Button>(R.id.b_point2_Button).setOnClickListener(this)
        findViewById<Button>(R.id.b_point3_Button).setOnClickListener(this)
        findViewById<Button>(R.id.reset).setOnClickListener(this)
    }

    private fun displayForTeamA(num: Int) {
        val scoreA = findViewById<TextView>(R.id.A_teamCount)
        scoreA.text = num.toString()
    }

    private fun displayForTeamB(num: Int) {
        val scoreB = findViewById<TextView>(R.id.B_teamCount)
        //텍스트 추가
        scoreB.text = num.toString()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.point1_Button -> {
                displayForTeamA(++teamAScore);
            }
            R.id.point2_Button -> {
                teamAScore += 2
                displayForTeamA(teamAScore)
            }
            R.id.point3_Button -> {
                teamAScore += 3
                displayForTeamA(teamAScore)
            }
            R.id.b_point1_Button -> {
                displayForTeamB(++teamBScore)
            }
            R.id.b_point2_Button -> {
                teamBScore += 2
                displayForTeamB(teamBScore)
            }
            R.id.b_point3_Button -> {
                teamBScore += 3
                displayForTeamB(teamBScore)
            }
            R.id.reset -> {
                teamBScore = 0
                teamAScore = 0
                displayForTeamA(teamAScore)
                displayForTeamB(teamBScore)
            }
        }
    }
}