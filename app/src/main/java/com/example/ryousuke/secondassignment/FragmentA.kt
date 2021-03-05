package com.example.ryousuke.secondassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ryousuke.secondassignment.databinding.FragmentABinding
import com.example.ryousuke.secondassignment.model.UserName

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentABinding.inflate(inflater, container, false)
        val view = binding.root

        binding.button.setOnClickListener {

            val userNameET = binding.NameEt.text.toString()
            val userName = UserName(userNameET)

            val action = FragmentADirections.actionFragmentAToFragmentB(userName)
            findNavController().navigate(action)
        }

        return view
    }

    // To prevent memory leak!!
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}