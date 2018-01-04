package app.grepthor.fragmentex26;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.ByteArrayOutputStream;

/**
 * Created by Grepthor_4 on 1/2/2018.
 */

public class FragmentGalary extends Fragment {
    Intent intent;

    int[] mThumbIds = {
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1,
            R.drawable.s1, R.drawable.s1

    };


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.photos_layout, container, false);

        // uses the view to get the context instead of getActivity().
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        GridView gridView = (GridView) getActivity().findViewById(R.id.photogridview);
        gridView.setAdapter(new GalaryAdapter1(getActivity(),mThumbIds));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(),SecondActivity.class);

                Bitmap bitmap= BitmapFactory.decodeResource(getResources(),mThumbIds[i]);
                ByteArrayOutputStream outstream=new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG,100,outstream);
                byte[] byteArray=outstream.toByteArray();

               /* intent.putExtra("picture",byteArray);
                startActivity(intent);*/
            }
        });




    }
}