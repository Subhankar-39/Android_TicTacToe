package np.com.bimalkafle.tictactoeonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import np.com.bimalkafle.tictactoeonline.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playOfflineBtn.setOnClickListener {
            createOfflineGame()
        }
    }


    fun createOfflineGame(){
        GameData.saveGameModel(
            GameModel(
                gameStatus = GameStatus.JOINED
            )
        )
        startGame()
    }


    fun startGame(){
        startActivity(Intent(this,GameActivity::class.java))
    }

}












