package au.com.softclient.backbutton.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import au.com.softclient.backbutton.R;
import au.com.softclient.backbutton.SecondActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Toast.makeText(getActivity(),"Welcome to First Fragment", Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Next Button
        view.findViewById(R.id.NextF1F2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((SecondActivity) requireActivity()).openSecondFragment();
                //hideButton();
//                view.findViewById(R.id.NextF1F2).setVisibility(View.GONE);
//                view.findViewById(R.id.BackF1).setVisibility(View.GONE);
            }
        });

        // Back Button
        view.findViewById(R.id.BackF1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //requireActivity().onBackPressed();
                getParentFragmentManager().popBackStack(); // Navigate back to the previous fragment
                //hideButton();
//                view.findViewById(R.id.NextF1F2).setVisibility(View.GONE);
//                view.findViewById(R.id.BackF1).setVisibility(View.GONE);
            }
        });

        return view;
    }
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false);
        public void hideButton(){
            //view.findViewById(R.id.NextF1F2).setVisibility(View.GONE);
            //view.findViewById(R.id.BackF1).setVisibility(View.GONE);
        }
}