package com.nowornaver.booksearchapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nowornaver.booksearchapp.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {
    private var _binding : FragmentSettingBinding? = null
    private val binding get() = _binding!! // 백킹프로퍼티

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}