package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   var tvnumbers=findViewById<RecyclerView>(R.id.rvdigits)
        tvnumbers.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter=Fibonaccinumbers(findFibonacci(100))
    tvnumbers.adapter=numberAdapter

    }
}
fun findFibonacci(nums:Int):List<BigInteger>{
    var namba= mutableListOf<BigInteger>()
    var number1=BigInteger.ZERO
    var number2=BigInteger.ONE
    namba[0]=number1
    namba[1]=number2

    for (i in 1..nums) {
        var sum=number1+number2
        number1=number2
        number2=sum
        namba[i-1]=number2
    }
    return namba
    }
