package Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kertasbatugunting.PlayerVSPlayer
import com.example.kertasbatugunting.TypeGameActivity
import com.example.kertasbatugunting.databinding.LadingPage3FragmentBinding
import com.example.kertasbatugunting.intentTo

class LadingPage3fragment : Fragment () {
    private var _binding : LadingPage3FragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LadingPage3FragmentBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.edt
        binding.textEdit


        binding.btnStar.setOnClickListener {
            val name= binding.textEdit.text.toString()
            context?.intentTo ( TypeGameActivity ::class.java) { intent ->
                intent.putExtra("name",name)
                startActivity(intent)
                
            }

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}