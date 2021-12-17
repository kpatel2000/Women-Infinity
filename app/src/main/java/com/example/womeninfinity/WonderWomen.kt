package com.example.womeninfinity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.womeninfinity.models.Women
import kotlinx.android.synthetic.main.activity_wonder_women.*

class WonderWomen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wonder_women)

        recyclerView.layoutManager = LinearLayoutManager(this)
        var women = ArrayList<Women>()
        women.add(Women("Radhika Menon","https://im.indiatimes.in/photogallery/2021/Mar/1bccl_6040b6c824cfa.jpg?w=750&h=563&cc=1","In 2012, Radhika Menon became the first Indian woman captain in the Merchant Navy. In 2016, she became the first woman in the world to receive the Award for Exceptional Bravery at Sea from the International Maritime Organisation after she saved seven fishermen who got lost at sea."))
        women.add(Women("Arunima Sinha","https://im.indiatimes.in/photogallery/2021/Mar/2afp_6040b6feb5d05.jpg?w=750&h=563&cc=1","She was a national level volleyball player who lost her left leg in a tragic train accident when she was pushed out of a train coach by robbers who wanted to snatch her bag and gold chain. However, she didn’t let her shortcoming stop her from scaling the heights of Mt. Everest. She became India’s first female amputee to climb the mountain and was awarded Padma Shri in 2015."))
        women.add(Women("Tessy Thomas","https://im.indiatimes.in/photogallery/2021/Mar/4bccl_6040b8492f967.jpg?w=750&h=563&cc=1","Dr. Tessy Thomas is a female scientist from DRDO, who devoted her life to the development of India's Agni Missile. Thomas is the first woman scientist to head a missile project in the country O. Known as the ‘Missile Woman of India’, Thomas became the Project Director for the 5,000-km range Agni-IV missile in 2009, which was tested successfully in 2012."))
        women.add(Women("Mithali Raj","https://im.indiatimes.in/photogallery/2021/Mar/12bccl_6040b90f21ef1.jpg?w=750&h=563&cc=1","In 2004, Mithali Raj became the first woman to score a double century in Test Cricket. She scored 214* against New Zealand."))
        var adapter = WonderWomenAdapter(this,women)
        recyclerView.adapter = adapter
    }
}