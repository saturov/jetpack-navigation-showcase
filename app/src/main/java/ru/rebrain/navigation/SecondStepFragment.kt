package ru.rebrain.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class SecondStepFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.second_step_fragment, container, false)
    }
}