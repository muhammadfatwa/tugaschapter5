package Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kertasbatugunting.databinding.LadingPage1FragmentBinding
class Ladingpage1fragment : Fragment () {
    private var _binding : LadingPage1FragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= LadingPage1FragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgLpone
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
