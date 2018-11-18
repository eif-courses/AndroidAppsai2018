package com.example.viko.appsas.single.activity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Home : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_home, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    shop_button.setOnClickListener {
      Toast.makeText(view.context, " WOOW", Toast.LENGTH_LONG).show()
        val shop = HomeDirections.shopAction()
        val r = Random()
      shop.setItemName("Price: ${r.nextInt(2000)} eur")

      Navigation.findNavController(it).navigate(shop)

    }

  }
}
