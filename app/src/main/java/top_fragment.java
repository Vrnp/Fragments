import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.harsh.challa.R;

/**
 * Created by harsh on 1/19/2018.
 */

public class top_fragment extends Fragment {

    private static EditText top_text,bottom_text;
    private static Button b1;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.top_fragment,container,false);
      top_text = (EditText)view.findViewById(R.id.top_text);
      bottom_text = (EditText)view.findViewById(R.id.bottom_text);
      b1 = (Button)view.findViewById(R.id.b1);

      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              buttonClicked(v);

          }
      });

       return view;
    }

    public void buttonClicked(View view){
        
    }
}
