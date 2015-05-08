package io.github.takuji31.materialdesignexample

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TopFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TopFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
public class TopFragment : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var appCompatWidgetButton:Button? = getView().findViewById(R.id.appCompatWidgetButton) as Button?
        appCompatWidgetButton?.setOnClickListener {
            listener?.onAppCompatWidgetButtonTapped()
        }
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        try {
            listener = activity as OnFragmentInteractionListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity!!.toString() + " must implement OnFragmentInteractionListener")
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    public trait OnFragmentInteractionListener {
        public fun onAppCompatWidgetButtonTapped()
        public fun onThirdPartyLibsButtonTapped()
    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         * @return A new instance of fragment TopFragment.
         */
        // TODO: Rename and change types and number of parameters
        public fun newInstance(): TopFragment {
            val fragment = TopFragment()
            val args = Bundle()
            fragment.setArguments(args)
            return fragment
        }
    }

}// Required empty public constructor
