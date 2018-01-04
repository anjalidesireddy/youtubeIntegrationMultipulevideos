package app.grepthor.fragmentex26;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Grepthor_4 on 1/2/2018.
 */

public class GalaryAdapter1 extends BaseAdapter {
    private Context mContext;
    int arr[];

    public GalaryAdapter1(Context c,int[] arr) {

        mContext = c;
        this.arr=arr;
    }

    public int getCount() {
        return arr.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(320, 320));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

            /*imageView.setPadding(2, 2, 2, 2);*/
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(arr[position]);
        return imageView;
    }


}