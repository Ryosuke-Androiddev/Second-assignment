package com.example.ryousuke.secondassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.ryousuke.secondassignment.databinding.FragmentBBinding

class FragmentB : Fragment() {
    
    private val args by navArgs<FragmentBArgs>()
    
    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(inflater,container,false)
        val view = binding.root
        val myName = args.CurrentUserName
        
        binding.nameTv.text = "Your name is ${myName}"
        
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}