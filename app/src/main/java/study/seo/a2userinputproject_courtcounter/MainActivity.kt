package study.seo.a2userinputproject_courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import study.seo.a2userinputproject_courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var teamAScore = 0
    private var teamBScore = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.point1Button.setOnClickListener {
            displayForTeamA(++teamAScore);
        }

        binding.point2Button.setOnClickListener {
            teamAScore += 2
            displayForTeamA(teamAScore)
        }

        binding.point3Button.setOnClickListener {
            teamAScore += 3
            displayForTeamA(teamAScore)
        }

        binding.bPoint1Button.setOnClickListener {
            displayForTeamB(++teamBScore)
        }

        binding.bPoint2Button.setOnClickListener {
            teamBScore += 2
            displayForTeamB(teamBScore)
        }

        binding.bPoint3Button.setOnClickListener {
            teamBScore += 3
            displayForTeamB(teamBScore)
        }

        binding.reset.setOnClickListener {
            teamBScore = 0
            teamAScore = 0
            displayForTeamA(teamAScore)
            displayForTeamB(teamBScore)
        }

    }

    private fun displayForTeamA(num: Int) {
        binding.ATeamCount.text = num.toString()
    }

    private fun displayForTeamB(num: Int) {
        binding.BTeamCount.text = num.toString()
    }

}