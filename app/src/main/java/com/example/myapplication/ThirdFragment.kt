/*
 * Copyright (c) 2021 syahbudinhamwar.All Rights Reserved
 */

package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders


class ThirdFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtNim: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).
        get(CommunicationViewModel::class.java)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third,
            container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        txtNim = view.findViewById(R.id.textViewNim)
        communicationViewModel!!.nim.observe(requireActivity(),
            Observer { s -> txtNim!!.text = s })

    }
    companion object {
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }
}