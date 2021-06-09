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


class FourthFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtJurusan: TextView? = null
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
        return inflater.inflate(R.layout.fragment_fourth,
            container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        txtJurusan = view.findViewById(R.id.textViewJurusan)
        communicationViewModel!!.jurusan.observe(requireActivity(),
            Observer { s -> txtJurusan!!.text = s })

    }
    companion object {
        fun newInstance(): FourthFragment {
            return FourthFragment()
        }
    }
}