package com.example.guesstheword

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
    var win:Int=0
    var vopros:Int=0
    fun ClickNext(view: View) {
        val Picture1:ImageView=findViewById(R.id.imageView1)
        val Picture2:ImageView=findViewById(R.id.imageView2)
        val Picture3:ImageView=findViewById(R.id.imageView3)
        val Picture4:ImageView=findViewById(R.id.imageView4)
        val button1:Button=findViewById(R.id.buttonClick1)
        val button2:Button=findViewById(R.id.buttonClick2)
        val button3:Button=findViewById(R.id.buttonClick3)
        val button4:Button=findViewById(R.id.buttonClick4)
        val buttonNext:Button=findViewById(R.id.buttonNext)
        button1.visibility=View.VISIBLE
        button2.visibility=View.VISIBLE
        button3.visibility=View.VISIBLE
        button4.visibility=View.VISIBLE
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button1.setBackgroundColor(ContextCompat.getColor(this, R.color.ColorButton))
        button2.setBackgroundColor(ContextCompat.getColor(this, R.color.ColorButton))
        button3.setBackgroundColor(ContextCompat.getColor(this, R.color.ColorButton))
        button4.setBackgroundColor(ContextCompat.getColor(this, R.color.ColorButton))
            if (vopros == 0) {
                Picture1.setImageResource(R.drawable.potch2)
                Picture2.setImageResource(R.drawable.potch22)
                Picture3.setImageResource(R.drawable.potch23)
                Picture4.setImageResource(R.drawable.potch24)
                vopros += 1
                button1.text="Шахматы"
                button2.text="Царство"
                button3.text="Русь"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 1) {
                Picture1.setImageResource(R.drawable.potch3)
                Picture2.setImageResource(R.drawable.potch32)
                Picture3.setImageResource(R.drawable.potch33)
                Picture4.setImageResource(R.drawable.potch34)
                vopros += 1
                button1.text="Цифры"
                button2.text="Индекс"
                button3.text="Номер"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 2) {
                Picture1.setImageResource(R.drawable.potch4)
                Picture2.setImageResource(R.drawable.potch42)
                Picture3.setImageResource(R.drawable.potch43)
                Picture4.setImageResource(R.drawable.potch44)
                vopros += 1
                button1.text="Красный"
                button2.text="Роскошь"
                button3.text="Красота"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 3) {
                Picture1.setImageResource(R.drawable.potch5)
                Picture2.setImageResource(R.drawable.potch52)
                Picture3.setImageResource(R.drawable.potch53)
                Picture4.setImageResource(R.drawable.potch54)
                vopros += 1
                button1.text="Знание"
                button2.text="Идея"
                button3.text="Событие"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 4) {
                Picture1.setImageResource(R.drawable.potch6)
                Picture2.setImageResource(R.drawable.potch62)
                Picture3.setImageResource(R.drawable.potch63)
                Picture4.setImageResource(R.drawable.potch64)
                vopros += 1
                button1.text="Цирк"
                button2.text="Представление"
                button3.text="Живодёрство"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 5) {
                Picture1.setImageResource(R.drawable.potch7)
                Picture2.setImageResource(R.drawable.potch72)
                Picture3.setImageResource(R.drawable.potch73)
                Picture4.setImageResource(R.drawable.potch74)
                vopros += 1
                button1.text="Несчастье"
                button2.text="Счастье"
                button3.text="Удача"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 6) {
                Picture1.setImageResource(R.drawable.potch8)
                Picture2.setImageResource(R.drawable.potch82)
                Picture3.setImageResource(R.drawable.potch83)
                Picture4.setImageResource(R.drawable.potch84)
                vopros += 1
                button1.text="Закат"
                button2.text="Утро"
                button3.text="Обед"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 7) {
                Picture1.setImageResource(R.drawable.potch9)
                Picture2.setImageResource(R.drawable.potch92)
                Picture3.setImageResource(R.drawable.potch93)
                Picture4.setImageResource(R.drawable.potch94)
                vopros += 1
                button1.text="Расходники"
                button2.text="Игры"
                button3.text="Круг"
                button4.text="Нет верного ответа"
            }
            else if (vopros == 8) {
                Picture1.setImageResource(R.drawable.potch10)
                Picture2.setImageResource(R.drawable.potch102)
                Picture3.setImageResource(R.drawable.potch103)
                Picture4.setImageResource(R.drawable.potch104)
                vopros += 1
                button1.text="Круг"
                button2.text="Окружность"
                button3.text="Мяч"
                button4.text="Нет верного ответа"
                buttonNext.text="Конец"
        }
        else if (buttonNext.text=="Конец")
        {
            val intent = Intent(this, StatisticsActivity::class.java)
            intent.putExtra("Number", win.toInt().toString())
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
    fun clickOt1(view: View) {
        val button1:Button=findViewById(R.id.buttonClick1)
        val button2:Button=findViewById(R.id.buttonClick2)
        val button3:Button=findViewById(R.id.buttonClick3)
        val button4:Button=findViewById(R.id.buttonClick4)
        if (button1.text=="Шахматы" && vopros==1) {
            button2.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button1.setBackgroundColor(Color.GREEN)
            win+=1
            button1.isEnabled = false
        }
        else if(button1.text=="Красный" && vopros==3)
        {
            button2.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button1.setBackgroundColor(Color.GREEN)
            win+=1
            button1.isEnabled = false
        }
        else if(button1.text=="Цирк" && vopros==5)
        {
            button2.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button1.setBackgroundColor(Color.GREEN)
            win+=1
            button1.isEnabled = false
        }
        else
        {
            button3.visibility = View.INVISIBLE
            button2.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button1.setBackgroundColor(Color.RED)
            button1.isEnabled = false
        }
    }
    fun clickOt2(view: View) {
        val button1:Button=findViewById(R.id.buttonClick1)
        val button2:Button=findViewById(R.id.buttonClick2)
        val button3:Button=findViewById(R.id.buttonClick3)
        val button4:Button=findViewById(R.id.buttonClick4)
        if (button2.text=="Ёлка" && vopros==0) {
            button1.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button2.setBackgroundColor(Color.GREEN)
            win+=1
            button2.isEnabled = false
        }
        else if(button2.text=="Идея" && vopros==4)
        {
            button1.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button2.setBackgroundColor(Color.GREEN)
            win+=1
            button2.isEnabled = false
        }
        else if(button2.text=="Утро" && vopros==7)
        {
            button1.visibility = View.INVISIBLE
            button3.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button2.setBackgroundColor(Color.GREEN)
            win+=1
            button2.isEnabled = false
        }
        else
        {
            button3.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button2.setBackgroundColor(Color.RED)
            button2.isEnabled = false
        }
    }
    fun clickOt3(view: View) {
        val button1:Button=findViewById(R.id.buttonClick1)
        val button2:Button=findViewById(R.id.buttonClick2)
        val button3:Button=findViewById(R.id.buttonClick3)
        val button4:Button=findViewById(R.id.buttonClick4)
        if (button3.text=="Номер" && vopros==2) {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button3.setBackgroundColor(Color.GREEN)
            win+=1
            button3.isEnabled = false
        }
        else if(button3.text=="Удача" && vopros==6)
        {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button3.setBackgroundColor(Color.GREEN)
            win+=1
            button3.isEnabled = false
        }
        else if(button3.text=="Круг" && vopros==8)
        {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button3.setBackgroundColor(Color.GREEN)
            win+=1
            button3.isEnabled = false
        }
        else if(button3.text=="Мяч" && vopros==9)
        {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button3.setBackgroundColor(Color.GREEN)
            win+=1
            button3.isEnabled = false
        }
        else
        {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button4.visibility = View.INVISIBLE
            button3.setBackgroundColor(Color.RED)
            button3.isEnabled = false
        }
    }
    fun clickOt4(view: View) {
        val button1:Button=findViewById(R.id.buttonClick1)
        val button2:Button=findViewById(R.id.buttonClick2)
        val button3:Button=findViewById(R.id.buttonClick3)
        val button4:Button=findViewById(R.id.buttonClick4)
        button2.visibility = View.INVISIBLE
        button1.visibility = View.INVISIBLE
        button3.visibility = View.INVISIBLE
        button4.setBackgroundColor(Color.RED)
        button4.isEnabled = false
    }
}