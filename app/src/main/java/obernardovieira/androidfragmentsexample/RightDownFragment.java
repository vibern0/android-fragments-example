package obernardovieira.androidfragmentsexample;

/**
 * Created by bernardovieira on 21-01-2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightDownFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right_down, container, false);
    }

    public void onClickButtonToChange()
    {
        TextView text_on_fragment = (TextView) getView().findViewById(R.id.text_on_fragment);
        if(text_on_fragment.getText().equals(getString(R.string.fragment_right_down_text)))
        {
            text_on_fragment.setText(getString(R.string.fragment_right_down_text_2));
        }
        else
        {
            text_on_fragment.setText(getString(R.string.fragment_right_down_text));
        }
    }
}