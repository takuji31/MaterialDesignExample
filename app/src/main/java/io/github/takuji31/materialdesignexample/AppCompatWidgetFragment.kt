package io.github.takuji31.materialdesignexample

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AppCompatWidgetFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AppCompatWidgetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
public class AppCompatWidgetFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_compat_widget, container, false)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
    }

    override fun onDetach() {
        super.onDetach()
    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.

         * @return A new instance of fragment AppCompatWidgetFragment.
         */
        // TODO: Rename and change types and number of parameters
        public fun newInstance(): AppCompatWidgetFragment {
            val fragment = AppCompatWidgetFragment()
            val args = Bundle()
            fragment.setArguments(args)
            return fragment
        }
    }

}// Required empty public constructor
