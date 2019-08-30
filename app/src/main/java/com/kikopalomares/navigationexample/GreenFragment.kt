package com.kikopalomares.navigationexample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_green.*

class GreenFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_green, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goButton.setOnClickListener {
            val textBundle = Bundle()
            textBundle.putString("text", editText.text.toString())
            it.findNavController().navigate(R.id.action_greenFragment_to_textFragment, textBundle)
        }
    }
}
