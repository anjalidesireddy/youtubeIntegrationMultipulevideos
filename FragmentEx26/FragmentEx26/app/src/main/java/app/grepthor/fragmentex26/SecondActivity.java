package app.grepthor.fragmentex26;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SecondActivity extends Fragment {


   /* @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(R.layout.activity_second, container, false);
    }*/

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_second, container, false);

        // uses the view to get the context instead of getActivity().
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Bundle b= getActivity().getIntent().getExtras();
        byte b1[]=b.getByteArray("picture");


        //Intent intent = getActivity().getIntent();
      //  ((TextView)view.findViewById(R.id.hello)).setText(intent.getStringExtra("Hello"));


        Bitmap bitmap=  BitmapFactory.decodeByteArray(b1,0,b1.length);


        ImageView image=getActivity().findViewById(R.id.img2);
        image.setImageBitmap(bitmap);


    }
}
