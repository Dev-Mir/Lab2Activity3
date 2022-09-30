package com.example.lab2activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    var amount : Float = 0F;

    lateinit var getCountview: TextView;
    lateinit var q: String;
    lateinit var a : String;

    var quantity : Int = 0;

    lateinit var orderDetailView : TextView;
    lateinit var orderDetails: String;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCountview = findViewById(R.id.countItem);


    }

    fun plus(v : View){

        quantity++;
        getCountview.setText(quantity.toString())
    }

    fun minus(v: View){

        quantity--;
        if (quantity<0){
            quantity=0;
            getCountview.setText(quantity.toString())
        }
        else
        getCountview.setText(quantity.toString())

    }

    fun order(v: View){

        val crChk = findViewById<CheckBox>(R.id.creamChk);
        val chChk = findViewById<CheckBox>(R.id.chocoChk);
        orderDetailView = findViewById(R.id.details);


        if (crChk.isChecked and   chChk.isChecked){


            amount = ((quantity * 4)+0.5).toFloat();
            amount += ((quantity * 4)+1).toFloat();

             q = quantity.toString();
             a = amount.toString();

            if (q=="0"){
                orderDetails = "Kindly add quantities for selected items\n";
                orderDetailView.setText(orderDetails);
            }
            else {
                orderDetails =
                    "add Whipped cream? yes \nAdd chocolate? yes\nQuantity: $q \n\nPrice: $$a\nTHANK YOU\n";
                orderDetailView.setText(orderDetails);
            }

        }


        else if(crChk.isChecked) {


            amount = ((quantity * 4)+0.5).toFloat();
             q = quantity.toString();
             a = amount.toString();

            if (q=="0"){
                orderDetails = "Kindly add quantities for selected items\n";
                orderDetailView.setText(orderDetails);
            }
            else {
                orderDetails =
                    "add Whipped cream? yes \nAdd chocolate? yes\nQuantity: $q \n\nPrice: $$a\nTHANK YOU\n";
                orderDetailView.setText(orderDetails);
            }

            }


       else if(chChk.isChecked ) {


            amount = ((quantity * 4)+1).toFloat();
             q = quantity.toString();
             a = amount.toString();
            if (q=="0"){
                orderDetails = "Kindly add quantities for selected items\n";
                orderDetailView.setText(orderDetails);
            }
            else {
                orderDetails =
                    "add Whipped cream? yes \nAdd chocolate? yes\nQuantity: $q \n\nPrice: $$a\nTHANK YOU\n";
                orderDetailView.setText(orderDetails);
            }
        }

        else {
            orderDetails = "You did not select any item";
            orderDetailView.setText(orderDetails);
        }


    }
}