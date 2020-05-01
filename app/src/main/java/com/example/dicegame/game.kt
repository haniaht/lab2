package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class game : AppCompatActivity() {

    var  repetition1=0
    var  repetition2=0
    var  repetition3=0
    var  repetition4=0
    var  repetition5=0
    var  repetition6=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //imageView.setImageResource(R.drawable.sandy)
    }

    fun imageclicked(view: View){

        val rand = java.util.Random()
        val index = rand.nextInt(6)

        if (index== 0){
            game_image.setImageResource(R.drawable.dice1)
            repetition1++
            game_1TV.text= "1:$repetition1"
        }else if (index==1){
            game_image.setImageResource(R.drawable.dice2)
            repetition2++
            game_2TV.text= "2:$repetition2"
        }else if (index==2){
        game_image.setImageResource(R.drawable.dice3)
            repetition3++
            game_3TV.text= "3:$repetition3"
        }else if (index==3){
            game_image.setImageResource(R.drawable.dice4)
            repetition4++
            game_4TV.text= "4:$repetition4"
        }else if (index==4){
        game_image.setImageResource(R.drawable.dice5)
            repetition5++
            game_5TV.text= "5:$repetition5"
        }else if (index==5){
            game_image.setImageResource(R.drawable.dice6)
            repetition6++
            game_6TV.text= "6:$repetition6"
        }
    }

    fun resetClicked(view:View){
        repetition1=0
        repetition2=0
        repetition3=0
        repetition4=0
        repetition5=0
        repetition6=0

        game_1TV.text= "1:$repetition1"
        game_2TV.text= "2:$repetition2"
        game_3TV.text= "3:$repetition3"
        game_4TV.text= "4:$repetition4"
        game_5TV.text= "5:$repetition5"
        game_6TV.text= "6:$repetition6"
    }
}
