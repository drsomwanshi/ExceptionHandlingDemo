package com.example.exceptionhandlingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.exceptionhandlingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
    }

    fun division(view: View) {

        try {
            var n1=binding.txtno1.text.toString().toInt();
            var n2=binding.txtno2.text.toString().toInt();
            var ans=n1/n2;
            binding.txtans.setText("" + ans);
            var arr= arrayOf(10,20,40,50);
            var p=arr[9];
        }
        catch(e3:ArrayIndexOutOfBoundsException)
        {
            Toast.makeText(this, "Array capacity Exceed", Toast.LENGTH_SHORT).show()
        }

        catch (e1:java.lang.ArithmeticException)
        {
            Toast.makeText(this, e1.message, Toast.LENGTH_SHORT).show()
        }
        catch(e2:java.lang.NumberFormatException)
        {
            Toast.makeText(this, "number is too Long or Wrong Format", Toast.LENGTH_SHORT).show()
        }
        catch (e:java.lang.Exception)
        {
            Toast.makeText(this, "Incorrect Input", Toast.LENGTH_SHORT).show()
        }



    }
}