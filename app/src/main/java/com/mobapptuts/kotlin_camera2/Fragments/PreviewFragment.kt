package com.mobapptuts.kotlin_camera2.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobapptuts.kotlin_camera2.R

/**
 * Created by nigelhenshaw on 2018/01/23.
 */
class PreviewFragment : Fragment() {

    companion object {
        fun newInstance() = PreviewFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_preview, container, false)
    }
}