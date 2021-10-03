package com.my.feature_a

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.my.shared_base.viewModel

class AFragment : Fragment(R.layout.fragment_a) {

    private val viewModel by viewModel<AViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener { viewModel.test() }
    }
}