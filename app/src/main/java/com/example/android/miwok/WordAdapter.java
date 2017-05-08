package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import static com.example.android.miwok.R.id.default_text_view;
import static com.example.android.miwok.R.id.miwok_text_view;

/**
 * Created by Karnoha on 08.05.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //    Provides a view for an AdapterView.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word current_Word = getItem(position);

        // find the miwok translation text view in the list_item.xml
        TextView miwokTextView = (TextView) listItemView.findViewById(miwok_text_view);
        // sets values from the list to the textview
        miwokTextView.setText(current_Word.getMiwokTranslation());

        // find the default translation text view in the list_item.xml
        TextView defaultTextView = (TextView) listItemView.findViewById(default_text_view);
        // sets values from the list to the textview
        defaultTextView.setText(current_Word.getDefaultTranslation());

        //returns the whole list item layout
        return listItemView;
    }


    //    Constructor for the WordAdapter class.
    public WordAdapter(Activity context, ArrayList<Word> Word) {
        super(context, 0, Word);
    }
}