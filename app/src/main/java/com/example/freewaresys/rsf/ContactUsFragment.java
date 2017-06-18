package com.example.freewaresys.rsf;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Freeware Sys on 13-06-2017.
 */

public class ContactUsFragment  extends Fragment implements View.OnClickListener {
    Button button;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceStance)
    {
        View v=inflater.inflate(R.layout.contactus, container,false);
        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(this);
        return v;
    }
    public void onClick(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND); // it's not ACTION_SEND
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
        intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
        intent.setData(Uri.parse("mailto:team@reachingsky.org")); // or just "mailto:" for blank
        startActivity(intent);
    }
}

