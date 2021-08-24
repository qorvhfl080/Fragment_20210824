package com.nepplus.fragment_20210824.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.fragment_20210824.R

class FirstFragment : Fragment() {

//    xml + kt의 조합 -> 연결을 어떻게 하는가
//    kt단에서 어떤 xml을 쓸지 연결 (전용 함수 존재)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

//    동작 관련 코드들이 작성되는 함수 -> 액티비티 : onCreate
//    이 클래스 : 화면 X, 화면에 올라가는 부품 O
//    프래그먼트의 onCreate는 화면도 준비되기 전 -> 동작시키면 에러 가능

    override fun onAttach(context: Context) {
        super.onAttach(context)


    }

}